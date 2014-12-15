/*
 * Napisite klasu krug koja ima 2 atributa prvi je centa kruga (tipa Tacka) a drugi je radius. 
 * Osimstandardnih metoda napisati I metodu koja ce vratiti -1 ako neka druga tacka lezi van tog kurga, 
 * 0 ukoliko je na granici kruga I 1 ukoliko je unutar kruga. Ta metoda moze izgledati kao isInside(Point other).
 *  Napisite I metodu koja ce vratiti true ukoliko se 2 kruga sjeku.
 */
public class Krug {

	private int radijus;
	private int p;
	private int q;

	public Krug() {
		this.radijus = 1;
		this.p = 0;
		this.q = 0;
	}

	public Krug(int p, int q , int radijus) {
		this.radijus = radijus;
		this.p = p;
		this.q = q;
	}

	public int getRadijus() {
		return radijus;
	}

	public void setRadijus(int radijus) {
		this.radijus = radijus;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	public String toString() {
		String str = "";
		str = "Centar kruznice je " + p + "," + q + "i radijus iznosi "
				+ radijus;
		return str;
	}

	public int isInside(Tacka other) {
		int tacke = (int) ((other.getX() - this.p) * (other.getX() - this.p) + (other
				.getY() - this.q) * (other.getY() - this.q));
		int r2 = radijus * radijus;
		if (tacke == r2) {
			return 0;
		} else if (tacke < r2){
			return 1;
		} else {
			return -1;
		}
	}
	
	public boolean isIntersect ( Krug other){
		Tacka one = new Tacka (this.p,this.q);
		Tacka two = new Tacka (other.p,other.q);
		double distanca =  one.getDistance(two);
		double sumR = this.radijus + other.radijus;
		double razlikaR = other.radijus - this.radijus;
		if ( razlikaR < distanca && distanca> sumR){
			return true;
		}
		
		return false;
	}

}
