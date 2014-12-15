
public class Knjiga {

	private String nazivKnjige;
	private double cijenaKnjige;
	
	private int stanjeKnj;
	public static int brojac = 0;
	private String autor;

	public Knjiga(String nazivKnjige, double cijenaKnjige, int stanjeKnj,
			String autor) {
		this.nazivKnjige = nazivKnjige;
		this.cijenaKnjige = cijenaKnjige;
		
		this.autor = autor;
		
		if (this.nazivKnjige == nazivKnjige
				&& this.cijenaKnjige == cijenaKnjige
				&& this.autor == autor){
			brojac++;
			this.stanjeKnj = brojac;
		} else{
			this.stanjeKnj = stanjeKnj;
		}

	}
	
	public Knjiga(String nazivKnjige, double cijenaKnjige, String autor) {
		this.nazivKnjige = nazivKnjige;
		this.cijenaKnjige = cijenaKnjige;
		this.autor = autor;
		stanjeKnj = 1;
		
	}

	public void setNazivKnjige(String nazivKnjige) {
		this.nazivKnjige = nazivKnjige;
	}

	public String getNazivKnjige() {
		return nazivKnjige;
	}

	public void setCijenaKnjige(double cijenaKnjige) {
		this.cijenaKnjige = cijenaKnjige;
	}

	public double getCijenaKnjige() {
		return cijenaKnjige;
	}

	public void setStanjeKnjige(int satanjeKnj) {
		this.stanjeKnj = satanjeKnj;
	}

	public int getStanjeKnjige() {
		return stanjeKnj;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public String toString() {
		String str = "";
		str = "\nNaziv knjige : " + nazivKnjige + "\nCijena knjige : "
				+ cijenaKnjige + "\nStanje knjige : " + stanjeKnj
				+ "\nAutor knjige : " + autor;
		return str;
	}

	public boolean equlas(Knjiga other) {
		if (this.nazivKnjige == other.nazivKnjige
				&& this.cijenaKnjige == other.cijenaKnjige
				&& this.stanjeKnj == other.stanjeKnj
				&& this.autor == other.autor) {
			return true;
		}
		
		return false;

	}
	
	public void compare ( Knjiga other) {
		if (this.nazivKnjige == other.nazivKnjige
				&& this.cijenaKnjige == other.cijenaKnjige
				&& this.autor == other.autor) {
			System.out.println("Knjige su identicne!");
		} else  if ( this.autor == other.autor) {
			System.out.println("Isti je autor ali  su knjige razlcite!");
		} else if (this.nazivKnjige == other.nazivKnjige){
			System.out.println("Isti je naziv knjige ali su autori razliciti!");
		} else {
			System.out.println("Knjige su razlicite!");
		}
	}

}
