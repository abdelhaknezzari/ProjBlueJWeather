
/**
 * Write a description of class Weather here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weather
{
    // instance variables - replace the example below with your own
    //weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],
    private int id;
    private String main;
    private String description;
    private String icon;
    
    public Weather()
    {
        // initialise instance variables
        
    }
    
    public void setId( int id )
    {
      this.id = id;
    }
    
    public int getId( int id )
    {
      return this.id ;
    }

    public void setMain( String main )
    {
      this.main = main;
    }
    
    public String getMain( String main )
    {
      return this.main ;
    } 
    
    public void setDescription( String description )
    {
      this.description = description;
    }
    
    public String getDescription( String description )
    {
      return this.description ;
    } 
        
    
    public void setIcon( String icon )
    {
      this.icon = icon;
    }
    
    public String getIcon( String icon )
    {
      return this.icon ;
    } 
    
    
    
    
}
