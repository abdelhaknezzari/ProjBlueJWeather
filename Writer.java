
/**
 * Write a description of class Writer here.
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


    public class Writer {
	@JsonProperty("writerId")	
	private Integer id; 
	
	@JsonProperty("writerName")
	@JsonAlias({"wname", "mywname"})
	private String name;
	
	@JsonProperty("writerBook")	
	private Book book;

  	public Writer(){}
  	public Writer(Integer id, String name, Book book){
  		this.id = id;
  		this.name = name;
  		this.book = book;
  	}	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
} 

