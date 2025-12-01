package com.oops;


public class CreatingOwnSingleTonClass {

private static CreatingOwnSingleTonClass creatingOwnSingleTonClass=new CreatingOwnSingleTonClass();

private CreatingOwnSingleTonClass() {
	
	
}

private static CreatingOwnSingleTonClass getCreatingOwnSingleTonClass() {
	
	return creatingOwnSingleTonClass;
              
	
}
public static void main(String[] args) {
	
	CreatingOwnSingleTonClass t=CreatingOwnSingleTonClass.getCreatingOwnSingleTonClass();
	
	
}
}
