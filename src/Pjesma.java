
public class Pjesma {

	private String nazivP;
	private double duzinaP;
	private String autor;
	
	public Pjesma ( String nazivP, double duzinaP, String autor){
		this.nazivP=nazivP;
		this.duzinaP=duzinaP;
		this.autor=autor;
	}
	
	public void setNazivP ( String nazivP){
		this.nazivP = nazivP;
	}
	
	public String getNazivP (){
		return nazivP;
	}
	
	public void setDuzinaP ( double duzinaP){
		this.duzinaP=duzinaP;
	}
	
	public double getDuzinaP (){
		return duzinaP;
	}
	
	public void setAutor (String autor){
		this.autor = autor;
	}
	
	public String getAutro (){
		return autor;
	}
	
	public String toString (){
		String str="";
		str =  "\nNaziv pjesme: " + nazivP + "\nduzina pjesme: "
				+ duzinaP +  "\nAutor pjesme: " + autor;
		return str;
	}
	
	public void compare (Pjesma other){
		if ( this.nazivP==other.nazivP && this.duzinaP==other.duzinaP && this.autor==other.autor){
			System.out.println("Ove pjesme su identicne!");
		} else if (  this.autor==other.autor){
			System.out.println("Pjesme imaju istog autora!");		
		} else if ( this.nazivP==other.nazivP ){
			System.out.println("Pjesme imaju identican naziv, ali nisu od istog autora!");
		} else {
			System.out.println("Pjesme su razlicite!");
		}
	}
	
	public boolean equal ( Pjesma other){
		if ( this.nazivP==other.nazivP && this.duzinaP==other.duzinaP && this.autor==other.autor){
			return true;
		}
		return false;
	}
	
	
	
	
}

