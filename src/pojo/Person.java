package pojo;

public class Person {

	private String id;
	private String name;
	private String major;
	
	public String getMajor(){
		return this.major;
	}
	
	public void setMajor(String major){
		this.major = major;
	}

	public String getId() {
		
		return this.id;
	}
	
	public void setId(String id) {
		
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
