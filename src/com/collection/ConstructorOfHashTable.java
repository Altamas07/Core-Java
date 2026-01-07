package com.collection;

import java.util.Hashtable;

public class ConstructorOfHashTable {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		
		// creates an empty Hashtable object with default capacity 11 and fill ratio 0.75
		
           Hashtable<Integer, String> ht1=new Hashtable<Integer, String>(25);
		// creates an  Hashtable object with  capacity 25 and fill ratio 0.75
           
           
          Hashtable<Integer, String> ht2=new Hashtable<Integer, String>(25,0.78f);

         // creates an Hashtable object with  capacity 25 and fill ratio 0.78
          
        Hashtable<Integer, String> ht3=new Hashtable<Integer, String>(ht);

        // creates an  Hashtable object by copying all element of ht in ht3 with default capacity 11 and fill ratio 0.75 
    
	}
}
