public class MapBounds
{
  public static final MapBounds TIPPECANOE = new MapBounds(-87.1, 40.21, -86.69, 40.57);
  public static final MapBounds SANTACLARA = new MapBounds(-122.2, 36.89, -121.21, 37.49);
  public static final MapBounds PURDUE = new MapBounds(-87.1, 40.21, -86.69, 40.57);
  public static final MapBounds APPLE = new MapBounds(-87.1, 40.21, -86.69, 40.57);
  
  public double minLongitude;
  public double minLatitude;
  public double maxLongitude;
  public double maxLatitude;
  
  public MapBounds(double minLongitude, double minLatitude, double maxLongitude, double maxLatitude)
  {
    this.minLongitude = minLongitude;
    this.minLatitude = minLatitude;
    this.maxLongitude = maxLongitude;
    this.maxLatitude = maxLatitude;
  }
  
  public boolean contains(double longitude, double latitude)
  {
    return (longitude >= this.minLongitude && longitude <= this.maxLongitude &&
            latitude >= this.minLatitude && latitude <= this.maxLatitude);
  }
}