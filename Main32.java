//2. ƒаны две последовательности a1<=a2<+a3<=...an & b1<=b2<+b3<=bm. ќбразовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. ѕримечание. ƒополнительный массив не использовать.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main32 {
	public static void main(String args[]) {

		int[] mas1 = new int[0];
		int[] mas2 = new int[0];
		int[] mas3 = new int[0];
		mas1 = entermas1(args);
		mas2 = entermas2(args);
		mas3 = mixmas(mas1, mas2);
		sort1(mas3);
		sort2(mas3);
	}

	@SuppressWarnings("resource")
	public static int[] entermas1(String args[]) {

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive1= ");
		int n = ent.nextInt();
		int[] mas1 = new int[n];

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = i;
		}
		System.out.print(Arrays.toString(mas1));
		System.out.println();
		return mas1;
	}

	@SuppressWarnings("resource")
	public static int[] entermas2(String args[]) {

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive2= ");

		int m = ent.nextInt();
		int[] mas2 = new int[m];

		for (int j = 0; j < mas2.length; j++) {
			mas2[j] = 2 * j;
		}
		System.out.println(Arrays.toString(mas2));
		return mas2;
	}

	public static int[] mixmas(int[] mas11, int[] mas12) {

		int h = mas11.length + mas12.length;
		int[] mas22 = new int[h];

		for (int i = 0; i < mas11.length; i++) {
			if (i < mas11.length) {
				mas22[i] = mas11[i];
			}
		}
		// System.out.println(Arrays.toString(mas22));
		// System.out.println("!!");

		for (int i = mas11.length; i < mas22.length; i++) {
			mas22[i] = mas12[i - mas11.length];
		}
		System.out.println(Arrays.toString(mas22));
		return mas22;
	}

	public static void sort1(int[] mas33) {
		Arrays.sort(mas33);
		System.out.println(Arrays.toString(mas33));
	}
//сортировка пузырьком
	public static void sort2(int[] mas33) {
		int temp;
		for (int i=mas33.length-1; i>=0; i--) {
			for (int j = 0; j < i; j++) {
				if (mas33[j] > mas33[j+1]) {
					temp = mas33[j];
					mas33[j] = mas33[j+1];
					mas33[j+1] = temp;
					//System.out.println(Arrays.toString(mas33));
				}
			}
		}
		System.out.println(Arrays.toString(mas33));
	}
 }
