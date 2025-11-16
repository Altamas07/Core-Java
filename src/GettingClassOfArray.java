
public class GettingClassOfArray {
	
	public static void main(String[] args) {
		
		char[][]  x=new char[8][];
		int[] v=new int[7];
		long[] b=new long[8];
		byte[] g=new byte[8];
		short[] e=new short[8];
		double[] w=new double [8];
		float[] h=new float[8];
		boolean[] j=new boolean[8];

		
		System.out.println(x.getClass().getName());
		System.out.println(v.getClass().getName());
		System.out.println(b.getClass().getName());
		System.out.println(g.getClass().getName());
		System.out.println(e.getClass().getName());
		System.out.println(w.getClass().getName());
		System.out.println(h.getClass().getName());
		System.out.println(j.getClass().getName());
		
	}
	

}
