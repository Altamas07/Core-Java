package com.project;



	
	import java.util.Scanner;


	import java.util.ArrayList;

	class Book{
		int id;
		String title;
		 String author;
		 boolean isAvailable;
		 
		 Book(int id,String title,String author){
			 this.id=id;
			 this.title=title;
			 this.author=author;
			 this.isAvailable=true;
			 
		 }
	}
	class Library{
		ArrayList<Book> books=new ArrayList<>();
		void addBook(Book book) {
			books.add(book);
			System.out.println("Book added succesfully :");
		}
		void showAllBook() {
		if	(books.isEmpty()) {
		System.out.println("No books in library :");	
		
		}
		for(Book b:books) {
			
			System.out.println(b.id+"\n"+b.title+"\n"+b.author+"\n"+b.isAvailable);
			return;
		}
		}
		
		void searchBook(String title) {
			for(Book b:books) {
				if(b.title.equalsIgnoreCase(title)) {
					
					System.out.println("Found Id:"+b.id+"Found title:"+b.title+"Author:"+b.author+b.isAvailable);
					return;
				}
			}
			System.out.println("Book not found:");
		}
		void borrowBook(int id) {
			
			for(Book b:books) {
				if(b.id==id) {
					if(b.isAvailable) {
						b.isAvailable=false;
						System.out.println("You borrowed "+b.title);
					}
						else {
						System.out.println("Book already borrowed :");
					}
					return;
				}
			}
			System.out.println("book with id:"+id+"not found");
			}
	}
	public class LibraryManagementSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Library library=new Library();
		while(true) {
			System.out.println("Library menu : ///");
			
			System.out.println("1: Add book :"); 
			System.out.println("2: show all book:");
			System.out.println("3:Search book:");
			System.out.println("4:Borrow book:");
			System.out.println("5: Exit:");
			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			
			case 1:
				System.out.println("Enter your book id :");
				int id =sc.nextInt();
				System.out.println("enter your book title :");
				String title=sc.next();
				System.out.println("Enter your author name:");
				String author=sc.next();
				Book newBook= new Book( id,title,author);
				library.addBook(newBook);
				break;
			case 2:
				library.showAllBook();
				
				break;
			case 3:
				System.out.println("Enter book title  to search book");
			String searchTitle=sc.nextLine();
			library.searchBook(searchTitle);
			
			break;
			case 4:
				System.out.println("Enter your book id to borrow :");
				int borrowId=sc.nextInt();
				library.borrowBook(borrowId);
				break;
			case 5:
				System.out.println("Exiting.....");
				return;
				
			default :
				System.out.println("Invalid choice::");
			}
			sc.close();
		}
		
		}
	}


