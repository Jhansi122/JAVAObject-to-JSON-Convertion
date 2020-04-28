package CovertUtil;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Utility 
{
public static ObjectMapper mapper;
static {
	mapper = new ObjectMapper();
	
}
public static String covertJavaToJson(Object obj)
{
	String result="";
	try {
		result = mapper.writeValueAsString(obj);
	}
	catch (JsonGenerationException e)
	{
		System.out.println("Exception " +e.getMessage());
		e.printStackTrace();
	}
	catch(JsonMappingException e)
	{
		System.out.println("Exception " +e.getMessage());
		e.printStackTrace();
		
	}
	
	catch (IOException e)
	{
		System.out.println("Exception " +e.getMessage());
		e.printStackTrace();
	}
	return result;

	}
public  static <T> T convertJsonToJava(String JsonString, Class<T> cls)
{
	T result = null;
	try {
		result = mapper.readValue(JsonString, cls);
		
	}
	catch (JsonParseException e) 
	{

       e.printStackTrace();
	} 
	catch (JsonMappingException e)
	{
		e.printStackTrace();
	} 
	catch (IOException e) 
	{
		
		e.printStackTrace();
	}
	return result;
}

}
