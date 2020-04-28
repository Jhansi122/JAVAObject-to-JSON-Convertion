package Conversion;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
@JsonPropertyOrder(value=  
{"name",
         "Job",
        "Id",
       "email"})
		
public class details implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name = "Jhansi";
  private String Job = "Leader";
  private int Id = 300;
  private String email = "Jhansics12@gmail.com";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@JsonIgnore
public String getJob() {
	return Job;
}

public void setJob(String job) {
	Job = job;
}
public int getId() {
	return Id;
}
public void setId(int i) {
	Id = i;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
  
  
}
