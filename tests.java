
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

import java.time.LocalDateTime;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.Map.Entry;
import org.springframework.http.ResponseEntity;

import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.annotate.JsonMethod;
import org.codehaus.jackson.annotate.JsonProperty;
//import org.codehaus.jackson.map.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonAlias;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class tests
{
     

    
     // instance variables - replace the example below with your own
     private static final Logger log = LoggerFactory.getLogger(tests.class);

    public static void main(String ...args) throws IOException {
        RestTemplate restTemplate = new RestTemplate();
       // RequestParams quote = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=784d8dc34b1679e4536b1dffe7426a0e", RequestParams.class);
        //log.info(quote.toString());
        
        Map<String, Object> result = (Map<String, Object>) restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=784d8dc34b1679e4536b1dffe7426a0e", Map.class);
               
       
        ResponseEntity<String> response = restTemplate.getForEntity("http://api.openweathermap.org/data/2.5/weather?q=London,uk&APPID=784d8dc34b1679e4536b1dffe7426a0e" , String.class);
        
        
        
        Double temperature = (Double) ((Map<String, Object>) result.get("main")).get("temp") - 273;
        Double wind = (Double) ((Map<String, Object>) result.get("wind")).get("speed") * 3.6;
        //System.out.println( "The current temperature " + temperature + " degrees and the wind is " + wind + " km/h. (" + LocalDateTime.now() + ")");
        System.out.println(response.getBody());
        
        
        //WeatherInfo weatherInfo = new ObjectMapper().readerFor(WeatherInfo.class).readValue(response.getBody());
        
        String jsonData = "{"  +"\"writerId\" : 111,"  +"\"mywname\" : \"Mahesh\","  +"\"writerBook\" : {"    +"\"bookName\" : \"Learning Spring\","  +"\"bkcat\" : \"Spring\""
				  +"}"  +"}";
        
				  
				  
	ObjectMapper mapper = new ObjectMapper();
	Writer writer = mapper.readValue(jsonData, Writer.class);
	System.out.println(writer.getId()+", "+ writer.getName());
	Book book = writer.getBook();
	System.out.println(book.getName()+", "+ book.getCategory());
        
        
        //result.forEach( System.out:: println );
        
        
// coord={lon=-0.13, lat=51.51}
// weather=[{id=804, main=Clouds, description=overcast clouds, icon=04d}]
// base=stations
// main={temp=278.55, pressure=995, humidity=70, temp_min=278.15, temp_max=279.15}
// visibility=10000
// wind={speed=3.6, deg=180}
// clouds={all=90}
// dt=1548769800
// sys={type=1, id=1502, message=0.0037, country=GB, sunrise=1548747775, sunset=1548780306}
        
            
                // // result.entrySet().stream()
                        // // .filter(x -> x.getKey().contains("sys"))
                        // // .flatMap(x -> x.getValue().stream())
                        // // .forEach(x -> System.out.println(x.getValue()));

        //collect.forEach(x -> System.out.println(x));
        
        
       //result.entrySet().stream().forEach(System.out::println);
		//.filter(x -> "something".equals(x.getValue()))
		//.map(x->x.getValue())
		//.collect(Collectors.joining());
        
        
        
    }
    
}
