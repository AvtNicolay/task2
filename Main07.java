//6. Задана последовательность N вещественных чисел a1, a2, a3, a4, ..an-1,an1.
//   найти max(a1+a2n, a2+a2n-1, ..an+an+1).
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main07 {
	public static void main(String args[]) {

		double[] mas = new double[1];
		mas = entermas(args);
		int N = mas.length / 2;
		calcMaxMas(N, mas);
	}

	public static double[] entermas(String args[]) {
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.print("N= ");
		int N = enter.nextInt();
		double[] mas1 = new double[2 * N];

		for (int i = 0; i < mas1.length; i++) {
			System.out.print("mas[" + i + "]= ");
			mas1[i] = enter.nextDouble();
		}
		return mas1;
	}

	public static void calcMaxMas(int N1, double[] mas1) {
		System.out.println(Arrays.toString(mas1));
		double[] mas2 = new double[N1];
		//System.out.println("N1= " + N1);
		
		int i;
		for (i = 0; i < N1; i++) {
			mas2[i] = mas1[i] + mas1[mas1.length - 1 - i];
		//	System.out.println("mas2[" + i + "]= " + mas2[i]);
		}
		System.out.println(Arrays.toString(mas2));
	
		double maxmas = 0;
	    for (i=1; i<N1; i++) {
	    	if (maxmas<mas2[i]) {
	    		maxmas=mas2[i]; 
	    	}
	    }System.out.println("maxmas=" +maxmas);
	}
}
