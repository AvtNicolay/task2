
//10. Дано натуральное число N. Написать метод(методы) для формирования массива, 
//элементами которого являются цифры числа N.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main50 {
	public static void main(String args[]) {

		INtr(args);
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter number =");

		int n;
		while (!ent.hasNextInt()) {
			ent.next();
			System.out.print("incorrect input");
		}
		n = ent.nextInt();

		return n;
	}

	public static void INtr(String args[]) {// формируем массив из A&B

		// int m = 12345;
		int m = enter(args);

		double k = Math.log10(m);
		int z = (int) k;// кол-во разрядов числа
		int[] mas = new int[z + 1];
		System.out.println("число разрядов: " + (z + 1));

		for (int i = z; i >= 0; i--) {

			double Dec = Math.pow(10, i);
			mas[z - i] = (int) (m / Dec);
			m = m - ((int) Dec) * mas[z - i];
		}
		System.out.println(Arrays.toString(mas));
	}
}
