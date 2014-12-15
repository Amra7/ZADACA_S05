
public class TestKnjiga {
public static void main(String[] args) {
	
	Knjiga prvaKnjiga = new Knjiga ("Class", 45.80, 1, "H.M." );
	
	Autor prviAutor = new Autor ("Hans", "K.A.", "muski", "nema email-a");
	
	System.out.println(prvaKnjiga.toString());
	System.out.println(prviAutor.toString());
}
}
