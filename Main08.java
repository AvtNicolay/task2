//8. Дана последовательность целых чисел a1, a2, ...,an. 
// Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1, a2, ...,an).
 
package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main08 {
	public static void main(String args[]) {
		int mas[] = new int[0];
		int mas2[] = new int[0];
		int min;
		int minNum;
		mas = entermas(args);
		System.out.println(Arrays.toString(mas));
		min = minmas(mas);
		System.out.println("min value massive= " + min);
		minNum = minNumMas(min, mas);
		mas2 = exclmin(minNum, min, mas);
		System.out.println(Arrays.toString(mas2));
	}

	 @SuppressWarnings("resource")
	public static int[] entermas(String args[]) {
		//int mas[] = new int[] { 1, 2, 3, 0, 4, 5, 6, 0, 7, 8, 9, 0 }- тестовый режим вместо рандом;
		 Scanner enter = new Scanner(System.in);
		 int N;
		 System.out.println("N= ");
		 N = enter.nextInt();
		 int mas[] = new int[N];

		 Random rand = new Random();// Random - генератор случ.чисел

		 for (int i = 0; i < mas.length; i++) {
		 mas[i] = rand.nextInt(10);// возвращает случайное 0-10
		 }
		return mas;
	}

	public static int minmas(int mas1[]) {
		int minM = 1000;
		int i;
		//System.out.println(Arrays.toString(mas1));
		for (i = 0; i < mas1.length; i++) {
			if (minM > mas1[i]) {
				minM = mas1[i];
			}
		}
		//System.out.println("min value massive=" + minM);
		return minM;
	}

	public static int minNumMas(int minM, int mas1[]) {
		int minNum = 0;
		int i;
		//System.out.println(Arrays.toString(mas1));
		for (i = 0; i < mas1.length; i++) {
			if (minM == mas1[i]) {
				minNum++;
			}
		}
		System.out.println("Number of min Value =" + minNum);
		return minNum;
	}

	public static int[] exclmin(int minNum1, int minM1, int mas11[]) {
		int N1 = mas11.length - minNum1;
		int[] mas2 = new int[N1];
		int temp;
		int j = 0;
		int i;

		for (i = mas11.length - 1; i > 0; i--) {
			for (j = 0; j < i; j++) {
				if (mas11[j] == minM1) {
					temp = mas11[j];
					mas11[j] = mas11[j + 1];
					mas11[j + 1] = temp;
					//System.out.println(Arrays.toString(mas11));
				}
			}
		}
		for (j = 0; j < N1; j++) {
			mas2[j] = mas11[j];
		}
		//System.out.println(Arrays.toString(mas2));
		return mas2;
	}
}
