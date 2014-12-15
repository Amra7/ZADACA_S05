
public class Autor {

	private String ime;
	private String prezime;
	private String spol;
	private String email;
	
	
	public Autor (String ime, String prezime, String spol, String email){
		this.ime= ime;
		this.prezime=prezime;
		this.spol=spol;
		this.email=email;
	}
	
	public String toString(){
		String str="";
		str ="\nIme: " +ime+"\nPrezime: " +prezime+"\nSpol: "+spol+ "\nEmail: "+email;
		return str;
	}
	
	public String getIme (String ime){
		return ime;
	}
	
	public String getPrezime (){
		return prezime;
	}
	
	public String getSpol (){
		return spol;
	}
	
	public String getEmail (){
		return email;
	}
	
	public void setIme(String ime){
		this.ime=ime;
	}
	
	public void  setPrezime (String prezime){
		this.prezime=prezime;
	}
	
	public void setSpol (String spol){
		this.spol=spol;
	}
	
	public void setEmail (String email){
		this.email=email;
	}
	
	public boolean equals (  Autor other ){
		if ( this.ime==other.ime && this.prezime==other.prezime && this.spol==other.spol && this.email==other.email){
			return true;
		}
		
		return false;
	}
	
	public void compare ( Autor other){
		if ( this.ime==other.ime && this.prezime==other.prezime && this.spol==other.spol && this.email==other.email){
			System.out.println("Autori su isti!");
		} else if ( this.ime==other.ime && this.prezime==other.prezime && this.spol==other.spol) {
			System.out.println("Autori su isti ali im kontakt podaci nisu isti!");
		} else {
			System.out.println("Autori su razliciti!");
		}
	}
	
	public Autor copy (Autor other){
		this.ime=other.ime;
		this.prezime=other.prezime;
		this.spol=other.spol;
		this.email=other.email;
		
		return this;
	}
}
