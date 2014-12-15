
public class TestKnjizara {
public static void main(String[] args) {
	
	Knjizara hh = new Knjizara();
	hh.addKnjiga("abababab", 23.67,"John Smit");
	hh.addKnjiga("abab", 45.67,"Mary Adams");
	
	
	System.out.println("-----------------");
	System.out.println("Knjige sortirane po nazivu: ");
	Knjizara.bubbleSortNazivKnjige(hh.returnKnjige());
	for ( int i = 0; i<hh.returnKnjige().length; i++){
		System.out.println(hh.returnKnjige()[i].toString());
	}
	
	System.out.println("-----------------");
	System.out.println("Knjige sortirane po cijeni: ");
	Knjizara.bubbleSortCijenaKnjige(hh.returnKnjige());
	for ( int i =0; i< hh.returnKnjige().length; i++){
		System.out.println(hh.returnKnjige()[i].toString());
	}
	
	System.out.println("-----------------");
	System.out.println("Knjige sortirane po autoru: ");
	Knjizara.bubbleSortAutorKnjige(hh.returnKnjige());
	for ( int i =0; i< hh.returnKnjige().length; i++){
		System.out.println(hh.returnKnjige()[i].toString());
	}
	
}
}
