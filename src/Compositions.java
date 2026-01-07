
public class Compositions {
 // design patterns 
 Compositions a () {
	
	 System.out.println("l;'");
	return this;
}
 
 Compositions b() {
	 
	 System.out.println("sdfghjkl;");
	 return this;
 }
 void c() {
	 
	 System.out.println();
 }

 
public static void main(String[] args) {
   
	new Compositions().a().b().c();
}
}

