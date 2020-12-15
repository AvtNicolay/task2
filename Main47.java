//7. Ќаписать метод(методы) дл€ вычислени€ суммы факториалов всех нечетных чисел от 1 до 9.
package by.training.tutor2;

import java.util.Arrays;

public class Main47 {
	public static void main(String args[]) {
		System.out.println("суммы факториалов всех нечетных чисел от 1 до 9");
		int[] mas = new int[10];
		mas = factorial(args);
		summa(mas);
	}

	public static int[] factorial(String args[]) {
		int[] mas = new int[10];
			mas[0] = 1;
		for (int i = 1; i < 10; i++) {
			mas[i] = mas[i - 1] * i;
			}
		System.out.println(Arrays.toString(mas));
		return mas;
	}

	public static void summa(int[] mas1) {

		mas1[0] = 0;
		int sum = mas1[0];
		for (int i = 1; i < 10; i++) {
			if (i % 2 != 0) {
				sum = sum + mas1[i];
				//System.out.println("factorial [" + i + "]= " + mas1[i]);
			}
		}
		System.out.println("factorial sum= " + sum);
	}

}