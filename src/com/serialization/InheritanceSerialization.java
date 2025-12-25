package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


// if parent class implements serializable so we can serialize child class also because child class automatically
// inherits the property of serializable interface 

class Animal implements Serializable{
	
	int i=45;
	
}
class Dog extends Animal{
	
	int j=20;
	
}
public class InheritanceSerialization  {

	public static void main(String[] args) throws Exception {
		
		Dog dog=new Dog();
		
		System.out.println(dog.i+" "+dog.j);
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(dog);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=((Dog)ois.readObject());
		
		System.out.println(d2.i+" "+d2.j);
	}
}
