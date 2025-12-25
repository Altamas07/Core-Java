package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// if parent class does not implement  serializable interface and child implements serializable interface 
// when we try to serialize parent class default value will be stored in the file 

// while deserialization default value will not show to the object but jvm will execute instance control flow
// of non serializable parent object but to execute instance control flow there must be no-arg constructor 
// by default or explicitly provided by the programmer otherwise we will runtime exception 

class Animal1 {
	
	int i=10;
	
	Animal1(){
		
		System.out.println("Parent constructor ");
	}
	
}
 class Dog1 extends Animal1 implements Serializable    {
	 
	 int j=20;
	 
	Dog1(){
		
		System.out.println("Child constructor ");
	}
 }
public class InhritanceSerialization2 {

	public static void main(String[] args) throws Exception {
		
		Dog1 dog= new Dog1();
		
		System.out.println(dog.i+" "+dog.j);
		
		dog.i=25;
		dog.j=999;
		
		
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(dog);
		
		System.out.println("Deserialization started ");
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Dog1 d2=((Dog1)ois.readObject());
		
		System.out.println(d2.i+" "+d2.j);
				
				
				
				
				
				
				
				
	}
}
