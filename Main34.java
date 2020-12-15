//ЭТО СОРТИРОВКА ПУЗЫРЬКОМ 
//4. Сортировка обменами. Дана последовательность чисел a1<=a2<=a3...an. Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа a[i] и a[i+1]. Если a[i] > a[i+1], то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main34 {
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
			mas1[i] = mas1.length-i;
		}
		System.out.println(Arrays.toString(mas1));
		return mas1;
	}
		
		public static void sort(int[] mas11) {
			for (int i=0; i<mas11.length; i++) {
				int temp=mas11[i];
				for (int j=0; j<mas11.length-1; j++) {
					if (mas11[j]>mas11[j+1]) {
					temp=mas11[j];
					mas11[j]=mas11[j+1];
					mas11[j+1]=temp;
					//System.out.println(Arrays.toString(mas11));
					}
				}
			}
			System.out.print(Arrays.toString(mas11));
			}
	 }