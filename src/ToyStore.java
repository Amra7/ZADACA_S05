
public class ToyStore {
	
	private String storeName;
	private int inventar;
	private Toy[] toys;
	
	public Toy[] getToys() {
		return toys;
	}

	public void setToys(Toy[] toys) {
		this.toys = toys;
	}

	public ToyStore (){
		this.storeName = "Unknown";
		this.inventar = 0;
		toys = new Toy[2];
	}
	
	public ToyStore (String storeName, int inventar){
		this.storeName = storeName;
		this.inventar = 0;
		toys = new Toy[2];
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getInventar() {
		return inventar;
	}

	public void setInventar(int inventar) {
		this.inventar = inventar;
	}
	
	
	public String toString (){
		String str = "";
		str = "\nIme prodavnice: " + storeName + "\nInventar:" + inventar;
		return str;
	}
	
	public void addToy (String naziv, String tip, double cijena, int godina,
			int dobnoOgranicenje){
		
		toys[inventar] = new Toy (naziv, tip, cijena, godina, dobnoOgranicenje);
			inventar++;
			
			if (inventar == toys.length){
				resizeToys();
			
		}
	}

	private void resizeToys() {
		int newLength = 2* toys.length;
		Toy[] temp = new Toy[newLength];
		
		for ( int i=1; i<toys.length; i++){
			temp[i]=toys[i];
		}
		
	}
}
