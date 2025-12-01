package com.oops;

  class Book{
	  
	  int id ;
	  String title;
	  String author;
	  
	  
	  Book(int id , String title, String author ){
		  
		  
		  this.id=id;
		  this.title=title;
		  this.author=author;
		  
		  
	  }
	  public int getId() {
		  return id;
	  }
	  public void setId(int id) {
		  this.id = id;
	  }
	  public String getTitle() {
		  return title;
	  }
	  public void setTitle(String title) {
		  this.title = title;
	  }
	  public String getAuthor() {
		  return author;
	  }
	  public void setAuthor(String author) {
		  this.author = author;
	  }
	  
	  
	  public void displayDetails() {
		  
		  System.out.println("ID-------"+getId());
		  System.out.println("AUTHOR NAME-------"+getAuthor());
		  System.out.println("TITLE-------"+getTitle());
		  
	  }
	  
	  
  }
public class EncapsulationProgram {

	public static void main(String[] args) {
		
		Book book=new Book(45, "The God ", "Altamash Khan");
		
		book.displayDetails();
		
	}
}
