package com.encapsulation;

 class BankingApp2 {
	private String name;
	private int age;
	private String address;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
	class Main2{
		public static void main(String[] args) {
			BankingApp2 a=new BankingApp2();
			a.setAddress("BaghNagar Bazar Sant Kabir Nagar") ;
			a.setAge(18);
			a.setSalary(56000.50);
			a.setName("Altamash khan");
			System.out.println(a.getAddress());
			System.out.println(a.getAge());
			System.out.println(a.getSalary());
			System.out.println(a.getName());
		}
	}


