
public class TestPjesma {
public static void main(String[] args) {
	
	Pjesma jazz1 = new Pjesma ("Suspicion" , 7.80 , "Ibrahim M.");
	Pjesma jazz2 = new Pjesma ("Ilusion" , 5.80 , "Ibrahim M.");
	Pjesma jazz3 = new Pjesma ("True Story" , 4.60 , "Ibrahim M.");
	
	System.out.println(jazz1.equal(jazz2));
	jazz1.compare(jazz3);
	jazz1.compare(jazz2);
}
}
