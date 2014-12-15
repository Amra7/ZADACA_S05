
public class TestKrug {
public static void main(String[] args) {
	
	Krug one = new Krug(3,4,8);
	Krug two = new Krug(2,5,7);
	 
	Tacka point = new Tacka (2,3);
	System.out.println(one.isInside(point));
	System.out.println(one.isIntersect(two));
	
}
}
