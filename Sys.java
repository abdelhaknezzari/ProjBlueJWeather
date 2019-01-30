
/**
 * Write a description of class Sys here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sys
{
    // instance variables - replace the example below with your own
    // "sys":{"type":1,"id":1414,"message":0.0038,"country":"GB","sunrise":1548747794,"sunset":1548780282}
    private int type;
    private long id;
    private double message;
    private String country;
    private double sunrise;
    private double sunset;

    /**
     * Constructor for objects of class Sys
     */
    public Sys()
    {
        // initialise instance variables
        
    }
    
    
    public int getType()
    {
     return this.type;
     
    }

    public void setType(int type)
    {
       this.type = type;  
    
    }
    
        public long getId()
    {
     return this.id;
     
    }

    public void setId(long id)
    {
       this.id = id;  
    
    }
    
    public double getMessage()
    {
     return this.message;
     
    }

    public void setMessage(double message)
    {
       this.message = message;  
    
    }
    
    public String getCountry()
    {
     return this.country;
     
    }

    public void setCountry(String country)
    {
       this.country = country;  
    
    }
    
     public double getSunrise()
    {
     return this.sunrise;
     
    }

    public void setSunrise(double sunrise)
    {
       this.sunrise = sunrise;  
    }
    
    
         public double getSunset()
    {
     return this.sunset;
     
    }

    public void setSunset(double sunset)
    {
       this.sunset = sunset;  
    }
    
    
    

}
