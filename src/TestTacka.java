public class TestTacka {
	public static void main(String[] args) {

		System.out.println("Unesi koordinate x1 i y1");
		double x1 = TextIO.getlnDouble();
		double y1 = TextIO.getlnDouble();
		Tacka k1 = new Tacka(x1, y1);

		System.out.println(k1.toString());
		
		System.out.println("Unesi koordinate x2 i y2");
		double x2 = TextIO.getlnDouble();
		double y2 = TextIO.getlnDouble();
		Tacka k2 = new Tacka(x2, y2);

		System.out.println(k2.toString());
		
		System.out.println("Distanca izmedju tacaka je:");
		System.out.print( k1.getDistance(k2));
	}
}
