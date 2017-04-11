/**
 * Stopwatch.java
 * Defines a stopwatch that can be started, stopped, and reset.
 * 
 * @author Robert Cutler
 * 
 * @date November, 2012
 */
public class Stopwatch
{
  private long startTime;
  private long endTime;
  private long elapsedTime;
  private boolean running;
  
  /**
   * initializes the stopwatch by resetting it.
   */
  public Stopwatch()
  {
    this.reset();
  }
  
  /**
   * resets the stopwatch by setting the start and elapsed times to zero and
   * the state to not running.
   */
  public void reset()
  {
    this.startTime = 0;
    this.elapsedTime = 0;
    this.running = false;
  }
  
  /**
   * starts the stopwatch by setting the start time to the current time and
   * the state to running.
   */
  public void start()
  {
    this.startTime = System.currentTimeMillis();
    this.running = true;
  }
  
  /**
   * stops the stopwatch by adding the time the stopwatch was running to 
   * the elapsed time and setting the state to not running.
   */
  public void stop()
  {
    this.elapsedTime += (System.currentTimeMillis() - this.startTime);
    this.running = false;
  }
    
  /**
   * gets the elapsed time (the time the stopwatch has been running for
   * since it was last reset). If it is running, return the elapsed time
   * plus the time since it was last started.  If it is not running, just 
   * return the elapsed time.
   * 
   * @return The elapsed time in milliseconds.
   */
  public long getElapsedTime()
  {
    if (this.running)
      return this.elapsedTime + (System.currentTimeMillis() - this.startTime);
    else
      return this.elapsedTime;
  }
}