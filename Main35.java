//5. Сортировка вставками. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main35 {
	public static void main(String args[]) {

		int[] mas1 = new int[0];
		mas1 = entermas1(args);
		sortBin(mas1);
		 sort(mas1);
		 sortBinMod(mas1);
	}

	@SuppressWarnings("resource")
	public static int[] entermas1(String args[]) {

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive1= ");
		int n = ent.nextInt();
		int[] mas1 = new int[n];
		for (int i = 0; i < mas1.length; i++) {
			Random rand = new Random();
			mas1[i] = rand.nextInt(20);
		}
		System.out.println(Arrays.toString(mas1) + "исходный массив");
		return mas1;
	}

	// сортировка вставками
	public static void sort(int[] mas11) {
		for (int i = 1; i < mas11.length; i++) {
			int temp = mas11[i];
			int j = i - 1;
			while (j >= 0 && temp < mas11[j]) {
				mas11[j + 1] = mas11[j];
				j--;
			}
			mas11[j + 1] = temp;
		}
		System.out.println(Arrays.toString(mas11) + "сортировка вставками+");
	}
	//сортировка бинарными вставками мод.( с помощью класса Arrays пакета java.util.
	public static void sortBinMod(int[] mas12) {
		for (int i = 1; i < mas12.length; i++) {
			int temp = mas12[i];
			int k;
			
			k = Arrays.binarySearch(mas12, 0, i, temp);
			int j = Math.abs(k + 1);
			
			System.arraycopy(mas12, j, mas12, j + 1, i - j);
			mas12[j] = temp;
		}
		System.out.println(Arrays.toString(mas12) + "сортировка бин.вставками модифицирован.");
	}

	// сортировка бинарными вставками классическая
	public static void sortBin(int[] mas11) {
		int temp;
		int k;
		for (int i = 1; i < mas11.length; i++) {
			k = bSearch(mas11, 0, i - 1, mas11[i]);
			if (i == k + 1 && mas11[i] > mas11[k])
				mas11[i] = mas11[k + 1];
			else if (i == 1 && mas11[0] < mas11[1])
				mas11[i] = mas11[1];
			else {
				for (int j = i; j > k; j--) {
					temp = mas11[j - 1];
					mas11[j - 1] = mas11[j];
					mas11[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(mas11) + "сортировка бинарными вставками классич.");
	}

	static int bSearch(int[] mas111, int l, int r, int sElem) {
		int m = -1;
		if (sElem < mas111[l])
			return l;
		if (sElem > mas111[r])
			return r;
		while (l <= r) {
			m = (l + r) / 2;
			if (sElem >= mas111[m] && sElem < mas111[m + 1])
				return m + 1;
			if (sElem < mas111[m])
				r = m - 1;
			if (sElem > mas111[m])
				l = m + 1;
		}
		return m;
	}
}