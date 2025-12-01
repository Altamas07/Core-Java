package com.oops;

class Product{
	
	int productId;
	String productName;
	double price;
	double discountPercent;
	
	Product(int productId,String productName,double price,double discountPercent){
		
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.discountPercent=discountPercent;
		
		
	}
	
	double  calculateDiscount() {
		
		return( price*discountPercent)/100;
		
	}
	double getFinalPrice() {
		
		return(price-calculateDiscount());
		
	}
	
	public void showDetails() {
		
		System.out.println("Product Id___________"+productId);
		System.out.println("Product Name_________"+productName);
		System.out.println("Price_______"+price);
		System.out.println("Discount Perentage________"+discountPercent);
		System.out.println("Discount amount______"+calculateDiscount());
		System.out.println("Final Price_________"+getFinalPrice());
		System.out.println("__------------------____");
	}
}

public class DiscountCalculator {

	  public static void main(String[] args) {
		
		  Product product=new Product(23, "Laptop", 570000, 10);
		  
		  product.showDetails();
	}
}
