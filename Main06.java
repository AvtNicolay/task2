//6. «адана последовательность N вещественных чисел. ¬ычислить сумму чисел, пор€дковые номера которых
//€вл€ютс€ простыми числами.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main06 {
	public static void main(String args[]) {
		double summa;
		double[] mas = new double[1];
		mas = entermas(args);
		summa = findmember(mas);
		System.out.println("summa= " + summa);

	}

	public static double[] entermas(String args[]) {
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.print("N= ");
		int N = enter.nextInt();
		double[] mas1 = new double[N];

		for (int i = 0; i < mas1.length; i++) {
			System.out.print("mas[" + i + "]= ");
			mas1[i] = enter.nextDouble();
		}
		return mas1;

	}

	public static double findmember(double[] mas1) {

		double sum1 = 0, sum2 = 0, sum3;
		System.out.println(Arrays.toString(mas1));
		for (int i = 0; i < mas1.length; i++) {

			if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7) {
				// System.out.println("mas[" + i + "]= " + mas1[i]);
				sum1 = sum1 + mas1[i];
				// System.out.println("summa1= " + sum1);
			}
		}

		for (int i = 8; i < mas1.length; i++) {
			if (i % 2 != 0 & i % 3 != 0 & i % 5 != 0 & i % 7 != 0) {
				sum2 = sum2 + mas1[i]; // System.out.println("["+i+"] summa2= " + sum2);
			}
		}
		sum3 = sum1 + sum2;
		System.out.println("summa1= " + sum1 + "/  summa2= " + sum2 + "/  summa3= " + sum3);
		return sum3;
	}
}
