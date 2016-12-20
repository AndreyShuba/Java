import java.nio.file.NotLinkException;

public class labw03 implements var04 {

	public double logika(double d1, double d2, double d3) {
		// Даны три числа. Найти количество положительных чисел в исходном наборе.
		
		int countPositive = 0;
		
		if (d1 > 0) {
			countPositive++;
		}
		if (d2 > 0) {
			countPositive++;
		}
		if (d3 > 0) {
			countPositive++;
		}
		
		System.out.println("Kol-vo polozhitel'nih v nabore: " + countPositive);
		return 0;
	}
  
	public void poka(int N) {
		// Дано целое число N (> 0). Используя операции деления нацело и
		// взятия остатка от деления, вывести все его цифры, начиная с 
		// самой правой (разряда единиц).
		int n = Math.abs(N);
        while(n > 0) {
            System.out.println(n % 10);
            n -= n % 10;
            n /= 10;
        }
	}
 
	public void massivy(double[] A, double D) {

		// Найти элемент массива A, модуль разницы которого с D минимален
		double[] B = new double[A.length];
		
		for (int i = 0; i < A.length ; i++){
			B[i] = Math.abs(A[i] - D);
		}
		
		double min = B[0];

		int num=0;
		for(int i = 0; i < B.length; i++){
			System.out.println("Raznici: " + B[i]);
            if(min > B[i]){
                min = B[i];
				num=i;
            }
		}

		System.out.println("Nomer minimalnogo elementa massiva: " + num);
		
	}
  	
}