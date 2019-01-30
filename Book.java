
/**
 * Write a description of class Book here.
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

public class Book {
	@JsonProperty("bookName")		
	private String name;
	
	@JsonProperty("bookCategory")	
	@JsonAlias({"bkcat", "mybkcat"})
	private String category;  
	
  	public Book(){}
  	public Book(String name, String category) {
  		this.name = name;
  		this.category = category;
  	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
} 