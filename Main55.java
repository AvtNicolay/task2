//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main55 {
	public static void main(String args[]) {

		find(args);
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {// ввести число

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range number =");

		int n;
		while (!ent.hasNextInt()) {
			System.out.println("incorrect input");
			System.out.print("Enter range number =");
			ent.next();
		}
		n = ent.nextInt();
		return n;
	}

	public static int[] MasDiap(String args[]) {// формируем массив из нач. и кон. чисел
		int n = enter(args);
		int Nstart = (int) (1 * Math.pow(10, n - 1));
		int Nend = 0;
		for (int i = 0; i < n; i++) {
			int N9i = (int) (9 * Math.pow(10, i));
			Nend = Nend + N9i;
		}

		int[] mas = new int[3];
		mas[0] = Nstart;
		mas[1] = Nend;
		mas[2] = n;
		return mas;
	}

	public static int[] MasNum(int m) {// формируем массив из цифр заданного числа

		double k = Math.log10(m);
		int z = (int) k;// кол-во разрядов числа
		int[] mas = new int[z + 1];
		
		for (int i = z; i >= 0; i--) {

			double Dec = Math.pow(10, i);
			mas[z - i] = (int) (m / Dec);
			m = m - ((int) Dec) * mas[z - i];
		}
		return mas;
	}

	public static void find(String args[]) {// формируем массивs из цифр от нач. до кон. чисел
		//int n = enter(args);
		int[] masD = new int[3];
		masD = MasDiap(args);
		int n = masD[2];
		int Nstart = masD[0];
		int Nend = masD[1];
		System.out.println("n= " + n + "; Nstart= " + Nstart + "; Nend= " + Nend);

		int[] mas1 = new int[n];
		for (int i = Nstart; i < Nend; i++) {
			mas1 = MasNum(i);

			int mult = 1;
			int ind;

			for (int j = 1; j < n; j++) {
				int k = j - 1;
				ind = (mas1[j] - mas1[k]);
				
				if (ind != 1)
					ind = 0;
				else
					ind = 1;
				mult = mult * ind;
			}
			
			if (mult == 1) {
				System.out.println(Arrays.toString(mas1));
			} 
		}
	}
}