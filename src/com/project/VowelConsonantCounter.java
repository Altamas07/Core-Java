package com.project;


	import java.util.Scanner;

	public class VowelConsonantCounter {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your string :");
			String str=sc.nextLine();
			
			int vowel =0,consonant=0;
			str.toLowerCase();
			for(int i=0;i<str.length();i++) {
				
				char ch=str.charAt(i);
				if('a'==ch||'e'==ch||'i'==ch|| 'o'==ch||'u'==ch) {
					
					vowel++;
					
				}
				else {
					consonant++;
					
				}
				
			}
			System.out.println("Vowels are :"+vowel);
			System.out.println("Consnants are :"+consonant);
			sc.close();
		}

	}


