import java.awt.Color; // import java.awt.Color

public class MapAreaQuery
{
    private MapBounds bounds;
    private MapDataset dataset;
    private MapWindow window; //declare a private MapWindow data member

    // TODO: add a MapWindow parameter to the constructor below
    public MapAreaQuery(MapWindow window, MapDataset dataset, MapBounds bounds)
    {
        this.dataset = dataset;
        this.bounds = bounds;
        this.window = window;
        
        //TODO: save that MapWindow parameter to data member "window"
        //      "window" has already been declared above

        
        //TODO: back to Main class, change the codes that create MapAreaQuery,
        //      since the constructor of MapAreaQuery has been changed
    }
    
    public void run()
    {
        //TODO: set the boundaries of the window with its setMapArea() method
        
        for (int i = 0 ; i < this.dataset.getNumRecords() ; i++)
        {
            MapRecord record = this.dataset.getRecord(i);
            
            if (record.isIn(this.bounds)) {
                //TODO: display the record on window instead of console
                //      1) comment record.print();
                //      2) call display() method of record
                //record.print();
            	window.setMapArea(bounds);
            	record.display(window, Color.black);
            }
        }
        
        //TODO: redraw the map window with redraw() method of window

        
        //TODO: back to Main class, change the codes that create MapAreaQuery,
        //      since the constructor of MapAreaQuery has been changed
    }
}