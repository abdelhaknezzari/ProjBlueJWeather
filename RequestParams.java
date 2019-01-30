
/**
 * Write a description of class RequestParams here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;

public class RequestParams
{
       //"coord":{"lon":-0.13,"lat":51.51},
    private Coord coord;
   //"weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04d"}],
    private List<Weather> weather;  
    //"base":"stations", 
    private String base;
   // "main":{"temp":274.15,"pressure":1002,"humidity":64,"temp_min":271.15,"temp_max":277.15},
    private Main main;
    // "visibility":10000,
    private int visibility;
   //"wind":{"speed":3.1,"deg":170},
    private Wind wind;
    //"clouds":{"all":64},
    private Clouds clouds;
   // "dt":1548751800,
    private long dt ;
   // "sys":{"type":1,"id":1414,"message":0.0038,"country":"GB","sunrise":1548747794,"sunset":1548780282},
    private Sys sys;
    //"id":2643743,
    private long id;
   //"name":"London",
    private String name;
   //"cod":200
    private int cod;
    
    public RequestParams()
    {
    }

    public Coord getCoord(){
    return coord;
    }
     public void setCoord(Coord coord){
     this.coord = coord;
    }
      public List<Weather> getWeather(){
    return weather;
    }
     public void setWeather(List<Weather> weather){
     this.weather = weather;
    }  
       
   public String getBase(){
    return base;
    }
   public void setWeather(String base){
     this.base = base;
   }
    
   public Main getMain(){
    return main;
    }
     public void setWeather(Main main){
     this.main = main;
    } 
    
     public int getVisibility(){
    return visibility;
    }
     public void setVisibility(int visibility){
     this.visibility = visibility;
    }
    
     public Wind getWind(){
    return wind;
    }
     public void setWind(Wind wind){
     this.wind = wind;
    }  
   
    public Clouds getClouds(){
    return clouds;
    }
     public void setClouds(Clouds clouds){
     this.clouds = clouds;
    } 
    
     public long getDt(){
    return dt;
    }
     public void setDt(long dt){
     this.dt = dt;
    }  
    
     public Sys getSys(){
    return sys;
    }
     public void setDt(Sys sys){
     this.sys = sys;
    }
    
     public long getId(){
    return id;
    }
     public void setId(Long id){
     this.id = id;
    }
    
    
      public String getName(){
    return name;
    }
     public void setName(String name){
     this.name = name;
    }
    
    
       public int getCod(){
    return cod;
    }
     public void setCod(int cod){
     this.cod = cod;
    }
    
    
}
