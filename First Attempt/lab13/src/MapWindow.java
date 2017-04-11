import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.util.HashSet;

public class MapWindow extends JFrame
{
    private class Segment
    {
        private Color color;
        private double fromLongitude;
        private double fromLatitude;
        private double toLongitude;
        private double toLatitude;
        
        public Segment (Color color, double fromLongitude, double fromLatitude, double toLongitude, double toLatitude)
        {
            this.color = color;
            this.fromLongitude = fromLongitude;
            this.fromLatitude = fromLatitude;
            this.toLongitude = toLongitude;
            this.toLatitude = toLatitude;
        }
        
        public boolean equals(Object o)
        {
            if (! (o instanceof Segment))
                return false;
            
            Segment other = (Segment) o;
            
            return (this.fromLongitude == other.fromLongitude && this.fromLatitude == other.fromLatitude &&
                    this.toLongitude == other.toLongitude && this.toLatitude == other.toLatitude);
        }
    }
    
    private class MapView extends JComponent
    {
        private MapBounds bounds;
        private HashSet<Segment> segments;
        
        public MapView()
        {
            this.segments = new HashSet<Segment>();
        }
        
        public void paint(Graphics g)
        {
            synchronized(this.segments)
            {
                for (Segment segment : this.segments)
                {
                    g.setColor(segment.color);
                    g.drawLine(this.longitudeToX(segment.fromLongitude), this.latitudeToY(segment.fromLatitude), 
                               this.longitudeToX(segment.toLongitude), this.latitudeToY(segment.toLatitude));
                }
            }
        }
        
        public void addMapRecord(MapRecord mapRecord, Color color)
        {
            Segment segment = new Segment(color, mapRecord.fromLongitude, mapRecord.fromLatitude, mapRecord.toLongitude, mapRecord.toLatitude);
            
            synchronized (this.segments)
            {
                if (this.segments.contains(segment))
                    this.segments.remove(segment);
                
                this.segments.add(segment);
            }
        }
        
        public void setMapArea(MapBounds bounds)
        {
            this.bounds = bounds;
        }
        
        private int longitudeToX(double longitude)
        {    
            double deltaLong = longitude - this.bounds.minLongitude;
            double totalLong = this.bounds.maxLongitude - this.bounds.minLongitude;
            double totalX = this.getWidth();
            double deltaX = (deltaLong * totalX) / totalLong;
            
            return (int) deltaX;
        }
        
        private int latitudeToY(double latitude)
        {    
            double deltaLat = this.bounds.maxLatitude - latitude;
            double totalLat = this.bounds.maxLatitude - this.bounds.minLatitude;
            double totalY = this.getHeight();
            double deltaY = (deltaLat * totalY) / totalLat;
            
            return (int) deltaY;
        }
        
    }
    
    
    private MapView view;
    private boolean showDrawing;
    
    public MapWindow(int x, int y, int width, int height, boolean showDrawing)
    {
        super();
        
        this.view = new MapView();
        this.showDrawing = showDrawing;
        
        this.setTitle("Lab 13");
        this.setLocation(x, y);
        this.setSize(width, height);
        this.setContentPane(view);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);    
        this.setVisible(true);
    }
    
    public void redraw()
    {
        this.update(this.getGraphics());
    }
    
    public void setMapArea(MapBounds bounds)
    {
        view.setMapArea(bounds);
        redraw();
    }
    
    public void addMapRecord(MapRecord mapRecord, Color color)
    {
        view.addMapRecord(mapRecord, color);
        
        if (this.showDrawing)
            update(getGraphics());
    }
    
    public static double geographicDistance(double lon1, double lat1, double lon2, double lat2) 
    {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + 
            Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        
        return (dist);
    }
    
    private static double deg2rad(double deg) 
    {
        return (deg * Math.PI / 180.0);
    }
    
    private static double rad2deg(double rad) 
    {
        return (rad * 180.0 / Math.PI);
    }
    
}