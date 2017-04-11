/**
 * Main.java
 * The class that holds the main method for the lab.
 * I was on step 5 when the lab ended
 * @author Robert Cutler
 * 
 * @date November, 2012
 */
public class Main
{
    public static void main(String[] args)
    {
        // Create two MapWindow. They will be used later.
        MapWindow windowT = new MapWindow(100, 100, 640, 480, false);
        MapWindow windowS = new MapWindow(200, 200, 640, 480, false);
        
        MapDataset tippecanoe = new MapDataset("Tippecanoe");
        MapDataset santaclara = new MapDataset("SantaClara");
        
        //TODO: Read and understand the constructor of MapAreaQuery before you start.
        //TODO: Create two MapAreaQuery here.
        MapAreaQuery mqT = new MapAreaQuery(windowT, tippecanoe, MapBounds.TIPPECANOE);
        MapAreaQuery mqS = new MapAreaQuery(windowS, santaclara, MapBounds.SANTACLARA);

        
        // TODO: call run() method of the two MapAreaQuery objects
        mqT.run();
        mqS.run();
        
    }
}