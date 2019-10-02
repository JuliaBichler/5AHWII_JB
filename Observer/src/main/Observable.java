package main;

import java.util.ArrayList;

public class Observable {
	
	private static ArrayList<Observer> observer;
	private static int value;
	
	public Observable(int value) {
		observer = new ArrayList<Observer>();
		this.value = value;
	}
	
	private static void notifyAllObservers(int value){
		for(Observer o : observer) {
			
			if(o.getValue()<=value)
			o.update(value);
		}
	}
	
	public int getValue() {
		return value;
	}
	
	public static void setValue(int value1) {
		value = value1;
		notifyAllObservers(value1);
	}
	
	public static void subscribe(Observer name) {
		observer.add(name);
	}
	
	public static void unsubscribe(Observer name){
		observer.remove(name);
	}
	

}
