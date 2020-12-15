//Составить программу, которая в массиве A[N] находит второе по величине число
//(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main45 {
	public static void main(String args[]) {
		choice(args);
	}

	public static int[] enter(String args[]) {

		@SuppressWarnings("resource")
		Scanner ent = new Scanner(System.in);
		System.out.print("Enter massive range =");

		int n;
		while (!ent.hasNextInt()) {
			ent.next();
			System.out.print("неверный ввод");

		}
		n = ent.nextInt();
		//System.out.println("n=" + n);

		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			Random rand = new Random();
			mas[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(mas) + "исходный массив");
		return mas;
	}
//сортировка выбором
	public static void choice(String args[]) {
		int[] mas = new int[0];
		mas = enter(args);
		
		for (int i=0; i<mas.length; i++) {
			int minNum=mas[i];
			int minIndex=i;
			for (int j=i+1; j<mas.length; j++) {
									
				if (minNum<mas[j]) {
					minNum=mas[j];
					minIndex=j;
				}
				}

				if (i!=minIndex) {
					int temp = mas[i];
					mas[i] = mas[minIndex];
					mas[minIndex] = temp;
					
				}
				}
	System.out.println(Arrays.toString(mas));	
	if (mas[0]==mas[1]) 
		System.out.println("Второе по величине число: "+mas[2]);
	else System.out.println("Второе по величине число: "+mas[1]);
		
	}
}
