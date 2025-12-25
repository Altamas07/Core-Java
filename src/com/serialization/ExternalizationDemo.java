package com.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable {

	int i;int j;String name;
	

    public ExternalizationDemo(){
		
		System.out.println("No Rg constructor ");
	}
	
	public ExternalizationDemo(int i,int j,String name){
		
		this.i=i;
		this.j=j;
		this.name=name;
		
	}
	

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		
		out.writeObject(name);
		out.writeInt(j);
		
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
		
		name=(String)in.readObject();
		j=in.readInt();
		
		
	}
	
	public static void main(String[] args) throws Exception {
		
		ExternalizationDemo ex=new ExternalizationDemo(23,45,"Altamas khan");
		
		System.out.println(ex.i+" "+ex.j+" "+ex.name);
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(ex);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		ExternalizationDemo ex2= (ExternalizationDemo)ois.readObject();
		
		System.out.println(ex2.i+" "+ex2.j+" "+ex2.name);
		
	}

}
