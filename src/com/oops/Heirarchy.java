package com.oops;


class Vehicle{
	
	void start(){
		
		System.out.println("Vehicle has started ");
		

	}
	void stop() {
		
		System.out.println("Vehicle has stopped moving :");
	}
}

class Car extends Vehicle{
    
	void start() {
		
		System.out.println("car has started ----");
	}
	void stop() {
		
		System.out.println("car has stopped ----");
	}
	
	}
class SportsCar{
	
	void start() {
		System.out.println("Sportcar has statred ---");
	}
void stop() {
		
		System.out.println("Sport car has stopped ---");
	}

}
public class Heirarchy {
     
	public static void main(String[] args) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.start();
		vehicle.stop();
		
		
		Car car =new Car();
		
		car.start();
		car.stop();
		
		
		SportsCar sportsCar=new SportsCar();
		sportsCar.start();
		sportsCar.stop();
	}
}
