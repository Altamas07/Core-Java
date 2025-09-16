package com.basic;

public class NumberSwapping {
	public static void main(String[] args) {
		int a=25;
		int b=34;
		a=b+a;
	    b=a-b;
        a=a-b;
        System.out.println(+ a  );
        System.out.println(+b);
}
}