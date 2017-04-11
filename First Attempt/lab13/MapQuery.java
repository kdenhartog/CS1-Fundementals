public abstract class MapQuery 
{
    private Stopwatch watch;
    private MapBounds bounds;
    private MapDataset dataset;
    
    public MapQuery(MapDataset dataset, MapBounds bound) {
        //TODO: save parameters to data members
        this.dataset = dataset;
        this.bounds = bounds;
        
        watch = new Stopwatch();
    }
    
    public abstract void preprocess();
    public abstract void process(MapRecord record);
    public abstract void postprocess();
    
    public void run() {
        preprocess();
        watch.reset();
        watch.start();
        
        //TODO: write a loop iterate through all the records in dataset
        for(int i = 0;i<dataset.getNumRecords();i++){
        	MapRecord record = this.dataset.getRecord(i);
        	process(record);
        }
        
        watch.stop();
        
        postprocess();
        
        watch.getElapsedTime();
    }
    
    public long getElapsedTime()
    {
        //TODO: return watch.getElapsedTime();
        long elapsedTime = 0;
        return elapsedTime;
    }
}