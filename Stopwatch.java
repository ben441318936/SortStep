
public class Stopwatch {
  private long start=0;
  private long stop=0;
  public void start()
    /* begins keeping track of time */
  {
    start=System.nanoTime();
  }
  public void stop()
    /* stops keeping track of time */
  {
    stop=System.nanoTime();
  }
  public long elapsedTime()
    /* uses System.out to display the elapsed time in seconds */
  {
    return (stop-start)/1000;
  }
  public void reset()
    /* resets the elapsed time to 0 */
  {
    start=0;
    stop=0;
  }
}

