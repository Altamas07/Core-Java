package com.practicequestionbasicstoadvance;


class  StudentBean{
	
	private String name;
	private int    rollNo;
	


       StudentBean(){
    	   
    	   
       }



	   public String getName() {
		   return name;
	   }



	   public void setName(String name) {
		   this.name = name;
	   }



	   public int getRollNo() {
		   return rollNo;
	   }



	   public void setRollNo(int rollNo) {
		   this.rollNo = rollNo;
	   }
       
       
}
public class JavaBeanClass {
	
	public static void main(String[] args) {
		
		StudentBean studentBean=new StudentBean();
		
		studentBean.setName("Altamash khan");
		studentBean.setRollNo(45);
		
		System.out.println(studentBean.getName());
		System.out.println(studentBean.getRollNo());
	}

}
