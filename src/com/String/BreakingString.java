package com.string;

public class BreakingString {
public static void main(String[] args) {
	String str="Sakinaka mumbra Mumbai ";
	String[] parts=str.split("a");
	for(String part: parts) {
		System.out.println(part);
	}
}
}
 