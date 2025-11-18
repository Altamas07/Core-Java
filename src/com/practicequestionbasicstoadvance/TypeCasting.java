package com.practicequestionbasicstoadvance;

public class TypeCasting {
        public static void main(String[] args) {
			
        	
        	byte b=87;
        	byte c=20;
        	
        	byte d=(byte) ((byte)b+c); // by default jvm is taking here int so we have to ytpe cast here
        	
        	b++;
        	System.out.println(d);
        	
        	
        }
}
