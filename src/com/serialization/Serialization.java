package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Serial implements Serializable{
	
	int i=10;
	int j=15;
	
}
public class Serialization {

	public static void main(String[] args) throws  Exception {
		
		Serial s=new Serial();
		
		System.out.println(s.j+" "+s.i);
		FileOutputStream fio=new FileOutputStream("abc.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fio);
		
		oos.writeObject(s);
		
		FileInputStream fi=new FileInputStream("abc.ser");
		ObjectInputStream os=new ObjectInputStream(fi);
		
		Serial s2=((Serial)os.readObject());
		
		System.out.println(s2.i+"   "+s2.j);
	}
}
