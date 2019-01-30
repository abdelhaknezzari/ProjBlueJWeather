
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    //"main":{"temp":274.15,"pressure":1002,"humidity":64,"temp_min":271.15,"temp_max":277.15},
    private double temp;
    private long   pressure;
    private long humidity;
    private double temp_min;
    private double temp_max;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
       
    }

 
    public double getTemp()
    {
    return this.temp;
    }
    
    public void setTemp(double temp)
    {
    this.temp =temp;
    }
    
    public long getPressure()
    {
    return this.pressure;
    }
    
    public void setPressure(long pressure)
    {
    this.pressure = pressure;
    }
    
    public long getHumidity()
    {
    return this.pressure;
    }
    
    public void setHumidity(long humidity)
    {
    this.humidity = humidity;
    }
    
    
    public double getTemp_min()
    {
    return this.temp_min;
    }
    
    public void setTemp_min(double temp_min)
    {
    this.temp_min = temp_min;
    }
    
    
    public double getTemp_max()
    {
    return this.temp_max;
    }
    
    public void setTemp_max(double temp_max)
    {
    this.temp_max = temp_max;
    }
    
    
    
}
