import java.util.Date;

public class GarbageCollector {

	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		
		System.out.println("Total memory of heap ::"+r.totalMemory());
		System.out.println("Free MEmory of heap  "+r.freeMemory());
		
		for(int i=0;i<=10000;i++) {
			
			Date d=new Date();
			d=null;
			
		}
		
		System.out.println("Free memory of Heap ::"+r.freeMemory());
		r.gc();
		
		System.out.println("Free memory of heap ::"+r.freeMemory());
	}
}
