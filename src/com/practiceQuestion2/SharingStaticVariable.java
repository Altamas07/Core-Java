package com.practiceQuestion2;

public class SharingStaticVariable {
	
	static String collageName;
	static String detais(String collageName) {
		
		
		System.out.println(collageName);
		return collageName;
	}
public static void main(String[] args) {
	
	
	SharingStaticVariable.detais("skdka");
	
	SharingStaticVariable.detais("najbaj,");
}
}
