
public class Knjizara {

	private String imeKnjizare;
	private Knjiga [] knjigeUProdaji;
	private int brojKnjiga;
	
	public Knjizara (){
		imeKnjizare = "Nepoznato!";
		knjigeUProdaji = new Knjiga [2];
		brojKnjiga=0;
	}
	
	public Knjizara ( String imeKnjizare){
		this.imeKnjizare = imeKnjizare;
		knjigeUProdaji = new Knjiga [2];
		brojKnjiga =0;
	}
	
	public void addKnjiga (String nazivKnjige, double cijenaKnjige, String autor){
		knjigeUProdaji [brojKnjiga] = new Knjiga (nazivKnjige, cijenaKnjige, autor); // uraditi sirtiiranje
		brojKnjiga ++;
		if ( brojKnjiga == knjigeUProdaji.length){
			resizeKnjigeUProdaji();
		}
	}
	
	public static void bubbleSortAutorKnjige ( Knjiga[] knjigeUProdaji) {
		for (int i = 0; i < knjigeUProdaji.length; i++) {
			for (int j = i + 1; j < knjigeUProdaji.length; j++) {
				int length1=knjigeUProdaji[i].getAutor().length();
				int length2=knjigeUProdaji[j].getAutor().length();
				int mylength=0;
				if(length1<length2){
					mylength=length1;
				}else{
					mylength=length2;
				}
				char[] word1=knjigeUProdaji[i].getAutor().toCharArray();
				char[] word2=knjigeUProdaji[j].getAutor().toCharArray();
				for (int k=0;k<mylength;k++){
					int ascii1=(int)word1[k];
					int ascii2=(int)word2[k];
					if(ascii2<ascii1){
						Knjiga temp = knjigeUProdaji[i];
						knjigeUProdaji[i] = knjigeUProdaji[j];
						knjigeUProdaji[j] = temp;
						break;
					}
					if (k==(mylength-1)){
						if (length2<length1){
							Knjiga temp = knjigeUProdaji[i];
							knjigeUProdaji[i] = knjigeUProdaji[j];
							knjigeUProdaji[j] = temp;
						}
					}
				}

			}

		}

	}
	
	public static void bubbleSortNazivKnjige ( Knjiga[] knjigeUProdaji) {
		for (int i = 0; i < knjigeUProdaji.length; i++) {
			for (int j = i + 1; j < knjigeUProdaji.length; j++) {
				int length1=knjigeUProdaji[i].getNazivKnjige().length();
				int length2=knjigeUProdaji[j].getNazivKnjige().length();
				int mylength=0;
				if(length1<length2){
					mylength=length1;
				}else{
					mylength=length2;
				}
				char[] word1=knjigeUProdaji[i].getNazivKnjige().toCharArray();
				char[] word2=knjigeUProdaji[j].getNazivKnjige().toCharArray();
				for (int k=0;k<mylength;k++){
					int ascii1=(int)word1[k];
					int ascii2=(int)word2[k];
					if(ascii2<ascii1){
						Knjiga temp = knjigeUProdaji[i];
						knjigeUProdaji[i] = knjigeUProdaji[j];
						knjigeUProdaji[j] = temp;
						break;
					}
					if (k==(mylength-1)){
						if (length2<length1){
							Knjiga temp = knjigeUProdaji[i];
							knjigeUProdaji[i] = knjigeUProdaji[j];
							knjigeUProdaji[j] = temp;
						}
					}
				}

			}

		}

	}
	
	public static void bubbleSortCijenaKnjige ( Knjiga[] knjigeUProdaji) {
		for (int i = 0; i < knjigeUProdaji.length; i++) {
			for (int j = i + 1; j < knjigeUProdaji.length; j++) {
				double broj1 =knjigeUProdaji[i].getCijenaKnjige();
				double broj2 =knjigeUProdaji[j].getCijenaKnjige();
					if(broj2<broj1){
						Knjiga temp = knjigeUProdaji[i];
						knjigeUProdaji[i] = knjigeUProdaji[j];
						knjigeUProdaji[j] = temp;
						break;
					}
				}
			}
		}

	
	
	public Knjiga[] returnKnjige (){
		return knjigeUProdaji;
	}

	private void resizeKnjigeUProdaji() {
		int novaDuzina = 2* knjigeUProdaji.length;
		Knjiga [] temp = new Knjiga [novaDuzina];
		
		for ( int i = 0;  i< knjigeUProdaji.length; i++){
			temp [i] = knjigeUProdaji[i];
		}
	}
	
	public String toString (){
		String str = "";
		str += imeKnjizare;
		for ( int i = 0; i< brojKnjiga ; i++){
			str += knjigeUProdaji[i].toString();
		}
		
		return str;
	}
	
	
}
