package main;

public class Main {

	public static void main(String[] args) {

		Observable heater = new Observable(20);
		
		User p1 = new User("p1",12);
		User p2 = new User("p2",15);
		User p3 = new User("p3",20);
		
		Observable.subscribe(p1);
		Observable.subscribe(p2);
		Observable.subscribe(p3);
		
		Observable.setValue(20);
		
		Observable.unsubscribe(p2);
		
		Observable.setValue(20);
		
		
		
		
		
		
		
		
		

	}

}
