//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим числом. 
//Подсчитать количество замен
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main02 {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner enter = new Scanner(System.in);
		System.out.print("n= ");
		int n = enter.nextInt();

		int[] a = new int[n];

		System.out.print("Z= ");
		int Z = enter.nextInt();
		initArray(a);
		resultArray(a, Z);
	}

	public static void initArray(int[] a) {
		if (a == null) {
			return;
		}

		for (int i = 0; i < a.length; i++) {
			@SuppressWarnings("resource")
			Scanner enter = new Scanner(System.in);
			System.out.print("a[" + i + "] = ");
			a[i] = enter.nextInt();
		}
		System.out.println(Arrays.toString(a));
	}

	public static void resultArray(int[] b, int Z) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] > Z)
				b[i] = Z;
		}
		System.out.println("Результат: ");
		System.out.println(Arrays.toString(b));
	}

}
