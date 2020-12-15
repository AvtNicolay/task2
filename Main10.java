//10. ƒан целочисленный массив с количеством элементов п. —жать массив, выбросив из него каждый второй
//элемент (освободившиес€ элементы заполнить нул€ми). ѕримечание. ƒополнительный массив не использовать.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main10 {
	public static void main(String args[]) {
		int mas[] = new int[0];
		mas = entermas(args);
		System.out.println(Arrays.toString(mas));
		int mas2[] = new int[0];
		mas2= exclnum(mas);
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

	public static int[] exclnum(int[] mas1) {
		for (int i = 0; i < mas1.length; i++) {
		if (i%2==0) mas1[i+1]=0;
		}
		System.out.println(Arrays.toString(mas1));
		return mas1;
	}

}
