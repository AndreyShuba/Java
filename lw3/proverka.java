public class proverka {
	
	public static void main(String[] args) {
		
		double d1 = 4.0;
		double d2 = 12.0;
		double d3 = -3.0;
		
		int N = 54;
		
		double A[] = {2.0, -1.0, 3.0, 54.0, -34.0, 42.0, 17.0, 112.0, 17.0, 0, -2.0};
		double D = 54;
		
		labw03 L = new labw03();
		
		L.logika(d1, d2, d3);
		L.poka(N);
		L.massivy(A, D);
	}
	
}