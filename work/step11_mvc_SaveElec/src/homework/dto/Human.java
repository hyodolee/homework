package homework.dto;

import java.io.Serializable;

public class Human  implements Serializable{
	private String name; 
	private String weight; 
	private int password;
	
	private static final long serialVersionUID = 1L;
	
	public Human(String name, String weight, int password) {
		super();
		this.name = name;
		this.weight = weight;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
}
