
interface Test{
	
	default void show() {
		
		System.out.println("roar");
	}
	
	static void  show1() {
		
		System.out.println("roaring");
	}
	
	
	
}


interface Test1 {
	
	private void show() {
		
		System.out.println("kj");
	}
	
}

public class MultipleInheritance implements Test,Test1  {
	
	public static void main(String[] args) {
		
		MultipleInheritance mu=new MultipleInheritance();
		
		mu.show();
		Test.show1();
		
	}
	
}
