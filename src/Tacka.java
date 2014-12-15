/*
 * Napisati klasu Tacka koja predstavlja tacku u 2D koordinatnom sistemu. 
 * Tacke u takvimsistemima imaju 2 koordinate: x i y. 
 * Klasa tacka osim standardnih metoda treba I da ima metodu da provjeri
 *  koliko je jedna tacka udaljena od druge double getDistance(Point other).
 */
public class Tacka {

	private double x;
	private double y;
	
	public Tacka (){
		this.x=0;
		this.y=0;
	}
	
	public Tacka (double x, double y){
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public String toString(){
		String str = "";
		str= "Koordinat su x:" +x+ " i y: "+y;
		return str;
	}
	
	public void compare (Tacka other){
		if ( this.x==other.x  && this.y==other.y){
			System.out.println("Koordinate su iste!");
		} else {
			System.out.println("Koordinate su razlicite!");
		}
	}
	
	public double getDistance(Tacka other){
		double distance =( double) Math.sqrt((other.x*other.x )-(this.x* this.x) + (other.y *other.y)-(this.x*this.x));
		return distance;
	}
}
