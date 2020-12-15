//7. Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=a3<=...an и b1<=b2<=b3...bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=b3...bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main37 {
	public static void main(String args[]) {

		int[] mas1 = new int[0];
		int[] mas2 = new int[0];
		int[] mas3 = new int[0];
		mas1 = entermas1(args);
		mas2 = entermas2(args);
		mas3 = mixmas(mas1, mas2);
		sort(mas3, mas1.length, mas2.length);
	}

	@SuppressWarnings("resource")
	public static int[] entermas1(String args[]) {
		// int[] mas1 = new int[] { 1, 3, 5, 7, 9, 11};
		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive1= ");
		int n = ent.nextInt();
		int[] mas1 = new int[n];

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = (i * 2 + 1) * 3;
		}
		System.out.println(Arrays.toString(mas1) + "исходный массив1");
		return mas1;
	}

	@SuppressWarnings("resource")
	public static int[] entermas2(String args[]) {
		// int[] mas2 = new int[] { 1, 3, 5, 7, 9, 11};
		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive2= ");
		int m = ent.nextInt();
		int[] mas2 = new int[m];

		for (int i = 0; i < mas2.length; i++) {
			mas2[i] = i * 2;
		}
		System.out.println(Arrays.toString(mas2) + "исходный массив2");
		return mas2;
	}

	public static int[] mixmas(int[] mas11, int[] mas12) {
		int k = mas11.length + mas12.length;
		int[] mas13 = new int[k];
		for (int i = 0; i < mas11.length; i++) {
			mas13[i] = mas11[i];
		}
		for (int i = 0; i < mas11.length; i++) {
			mas13[i] = mas11[i];
		}
		for (int j = 0; j < mas12.length; j++) {
			mas13[j + mas11.length] = mas12[j];
		}
		System.out.println(Arrays.toString(mas13) + "новый массив");

		for (int b = mas11.length; b < mas13.length; b++) {
			for (int a = 0; a < mas11.length; a++) {
				if (mas13[b] > mas13[a] && mas13[b] <= mas13[a + 1])
					System.out.println("a[" + a + "], b[" + b + "],  a[" + (a + 1) + "]");
			}
			if (mas13[b] < mas13[0] && mas13[b] <= 0)
				System.out.println("  0,  b[" + b + "],  a[1]");

		}

		return mas13;
	}
//сортировка вставками
	public static void sort(int[] mas13, int n, int m) {
		for (int i = 1; i < mas13.length; i++) {
			int temp = mas13[i];
			int j = i - 1;
			while (j >= 0 && temp < mas13[j]) {
				mas13[j + 1] = mas13[j];
				j--;
			}
			mas13[j + 1] = temp;
		}
		System.out.println(Arrays.toString(mas13) + "сортировка");
	}
}
