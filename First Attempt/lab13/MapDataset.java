import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapDataset
{
  private MapRecord[] mapRecords;
  private int numMapRecords;
  
  private class MapNode 
  {
    private int id;
    private double longitude;
    private double latitude;
    
    public MapNode(int id, double longitude, double latitude)
    {
      this.id = id;
      this.longitude = longitude;
      this.latitude = latitude;
    }
  }
  
  private class MapEdge
  {
    private int id;
    private int fromNodeId;
    private int toNodeId;
    private int streetId;
    private String type;
    private String fromAddressLeft;
    private String toAddressLeft;
    private String fromAddressRight;
    private String toAddressRight;
    private String tractLeft;
    private String tractRight;
    private String blockLeft;
    private String blockRight;
    private String zipLeft;
    private String zipRight;
    
    public MapEdge(int id, int fromNodeId, int toNodeId, int streetId, String type, 
                   String fromAddressLeft, String toAddressLeft,
                   String fromAddressRight, String toAddressRight, 
                   String tractLeft, String tractRight,
                   String blockLeft, String blockRight,
                   String zipLeft, String zipRight
    )
    {
      this.id = id;
      this.fromNodeId = fromNodeId;
      this.toNodeId = toNodeId;
      this.streetId = streetId;
      this.type = type;
      this.fromAddressLeft = fromAddressLeft;
      this.toAddressLeft = toAddressLeft;
      this.fromAddressRight = fromAddressRight;
      this.toAddressRight = toAddressRight;
      this.tractLeft = tractLeft;
      this.tractRight = tractRight;
      this.blockLeft = blockLeft;
      this.blockRight = blockRight;
      this.zipLeft = zipLeft;
      this.zipRight = zipRight;
    }
  }
    
  private class MapStreet
  {
    private int id;
    private String name;
    
    public MapStreet(int id, String name)
    {
      this.id = id;
      this.name = name;
    }
  }
    
  public MapDataset(String folderName)
  {
    ArrayList<MapNode> mapNodes = loadNodes(folderName + "/node.txt");
    ArrayList<MapStreet> mapStreets = loadStreets(folderName + "/street.txt");
    ArrayList<MapEdge> mapEdges = loadEdges(folderName + "/edge.txt");
    
    mapRecords = new MapRecord[mapEdges.size()];
    
    for (int k = 0 ; k < mapEdges.size() ; k++)
    {
      mapRecords[k] = new MapRecord();
      mapRecords[k].fromLongitude = mapNodes.get(mapEdges.get(k).fromNodeId).longitude;
      mapRecords[k].fromLatitude = mapNodes.get(mapEdges.get(k).fromNodeId).latitude;
      mapRecords[k].toLongitude = mapNodes.get(mapEdges.get(k).toNodeId).longitude;
      mapRecords[k].toLatitude = mapNodes.get(mapEdges.get(k).toNodeId).latitude;
      mapRecords[k].name = mapStreets.get(mapEdges.get(k).streetId).name; 
      mapRecords[k].type = mapEdges.get(k).type;
      mapRecords[k].fromAddressLeft = mapEdges.get(k).fromAddressLeft;
      mapRecords[k].toAddressLeft = mapEdges.get(k).toAddressLeft;
      mapRecords[k].fromAddressRight = mapEdges.get(k).fromAddressRight;
      mapRecords[k].toAddressRight = mapEdges.get(k).toAddressRight;
      mapRecords[k].zipLeft = mapEdges.get(k).zipLeft;
      mapRecords[k].zipRight = mapEdges.get(k).zipRight;
      mapRecords[k].tractLeft = mapEdges.get(k).tractLeft;
      mapRecords[k].tractRight = mapEdges.get(k).tractRight;
      mapRecords[k].blockLeft = mapEdges.get(k).blockLeft;
      mapRecords[k].blockRight = mapEdges.get(k).blockRight;
    }
    
    this.numMapRecords = mapEdges.size();
  }
  
  public MapRecord getRecord(int index)
  {
    return mapRecords[index];
  }
  
  public int getNumRecords()
  {
    return numMapRecords;
  }
  
  private ArrayList<MapNode> loadNodes(String fileName)
  {
    BufferedReader br = null;
    
    ArrayList<MapNode> mapNodes = new ArrayList<MapNode>();
    
    try
    {
      br = new BufferedReader(new FileReader(fileName));
      
      int count = 0;
      
      System.out.print("Loading Nodes: ");
      
      while (true)
      {
        String line = br.readLine();
        
        if (line == null)
          break;
        
        String[] items = line.split(",", 3);
        
        MapNode node = new MapNode(Integer.parseInt(items[0]) - 1,
                                   Double.parseDouble(items[1]),
                                   Double.parseDouble(items[2]));
        
        mapNodes.add(node); 
        
        count += 1;
      }
      
      System.out.println(count + " nodes");
      
      if (br != null)
        br.close();
      
      return mapNodes;
    }
    catch (IOException exception)
    {
      System.out.println("Error " + exception);
      exception.printStackTrace();
    }

    return null;
  }
  
  private ArrayList<MapStreet> loadStreets(String fileName)
  {
    BufferedReader br = null;
    
    ArrayList<MapStreet> mapStreets = new ArrayList<MapStreet>();
    
    try
    {
      br = new BufferedReader(new FileReader(fileName));
      
      int count = 0;
      
      System.out.print("Loading Streets: ");
      
      while (true)
      {
        String line = br.readLine();
        
        if (line == null)
          break;
        
        String[] items = line.split(",", 6);
        
        MapStreet street = new MapStreet(Integer.parseInt(items[0]) - 1, items[1].trim());
        
        mapStreets.add(street); 
        
        count += 1;
      }
      
      System.out.println(count + " streets");
      
      if (br != null)
        br.close();
      
      return mapStreets;
    }
    catch (IOException exception)
    {
      System.out.println("Error " + exception);
      exception.printStackTrace();
    }

    return null;
  }
  
  private ArrayList<MapEdge> loadEdges(String fileName)
  {
    BufferedReader br = null;
    
    ArrayList<MapEdge> mapEdges = new ArrayList<MapEdge>();
    
    try
    {
      br = new BufferedReader(new FileReader(fileName));
      
      int count = 0;
      
      System.out.print("Loading Edges: ");
      
      while (true)
      {
        String line = br.readLine();
        
        if (line == null)
          break;
        
        String[] items = line.split(",", 17);
        
        if (items.length > 1)
        {
          MapEdge mapEdge = new MapEdge(Integer.parseInt(items[0]) - 1,
                                        Integer.parseInt(items[1]) - 1,
                                        Integer.parseInt(items[2]) - 1,      
                                        Integer.parseInt(items[3]) - 1,
                                        items[4].trim(),       
                                        items[5].trim(),  
                                        items[6].trim(),
                                        items[7].trim(),
                                        items[8].trim(),
                                        items[9].trim(),
                                        items[10].trim(),
                                        items[11].trim(),
                                        items[12].trim(), 
                                        items[15].trim(),
                                        items[16].trim());
        mapEdges.add(mapEdge); 
        
        count += 1;
        }
      }
      
      System.out.println(count + " edges");
      
      if (br != null)
        br.close();
      
      return mapEdges;
    }
    catch (IOException exception)
    {
      System.out.println("Error " + exception);
      exception.printStackTrace();
    }

    return null;
  }
}
