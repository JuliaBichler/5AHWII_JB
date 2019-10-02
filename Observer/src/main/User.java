package main;

public class User implements Observer{
	
	private String name;
	private int value;
	
	public User(String name,int value) {
		this.name=name;
		this.value=value;
	}
	
	public void update(int value) {
		this.value=value;
		System.out.println("User "+this.name+" got a notification "+value);
	}
	
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}

}
