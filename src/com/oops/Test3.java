package com.oops;

public class Test3{
	
	static int count =0;
	{
		count++;
	}
	
	Test3(){
		
		
	}
	Test3(int a){
		
	}
	
	Test3(double b){
		
	}


         public static void main(String[] args) {
	
    Test3 test3=new Test3();
    Test3 test32=new Test3(10);
    Test3 test33=new Test3(34.5);

     System.out.println(count);

}

}
	

