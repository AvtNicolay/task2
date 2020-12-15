//3. Сортировка выбором. Дана последовательность чисел a1<=a2<=a3...an .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main33 {
	public static void main(String args[]) {

		int[] mas1 = new int[0];
		mas1 = entermas1(args);
		sort(mas1);
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

		public static void sort(int[] mas11) {
			for (int i=0; i<mas11.length; i++) {
				int maxNum=mas11[i];
				int maxIndex=i;
				for (int j=i+1; j<mas11.length; j++) {
										
					if (maxNum<mas11[j]) {
						maxNum=mas11[j];
						maxIndex=j;
					}
					}

					if (i!=maxIndex) {
						int temp = mas11[i];
						mas11[i] = mas11[maxIndex];
						mas11[maxIndex] = temp;
						System.out.println(Arrays.toString(mas11));		
					}
					}
		System.out.println(Arrays.toString(mas11));	
		}
	 }
