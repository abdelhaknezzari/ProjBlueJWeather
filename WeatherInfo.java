
/**
 * Write a description of class WeatherInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;
//import org.codehaus.jackson.map.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAlias;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Map;

public class WeatherInfo 
    {
        //"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"base":"stations",
        //,"visibility":10000,"wind":{"speed":3.1,"deg":270},
        //"clouds":{"all":0},"dt":1548838200,"sys":{"type":1,"id":1502,"message":0.0036,"country":"GB","sunrise":1548834106,"sunset":1548866790},"id":2643743,"name":"London","cod":200}
            private float coordLon;
            private float coordLat;
            private float mainTemp;
            private float mainPressure;
            private float mainHumidity;
            private float mainTemp_min;
            private float mainTemp_max;
            
            
            public WeatherInfo()
            {
            }
            
            
            @SuppressWarnings("unchecked")
            @JsonProperty("main")
            private void unpackNestedMain( Map<String,Object> main ) {
             //  "main":{"temp":272.05,"pressure":995,"humidity":92,"temp_min":271.15,"temp_max":273.15}
                this.mainTemp        = (float)main.get("temp");
                this.mainPressure    = (float)main.get("pressure");
                this.mainHumidity    = (float)main.get("humidity");
                this.mainTemp_min    = (float)main.get("temp_min");
                this.mainTemp_max    = (float)main.get("temp_min");
                
            }
    
    
    } 
    