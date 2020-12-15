//8.Даны дроби p1/q1, p2/q2, p3/q3,..., pn/qn, (p[i] , q[i] - натуральные).
//Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main38 {
	public static void main(String args[]) {
		System.out.print("Enter range massive= ");
		int[] mas1 = new int[0];
		int[] mas2 = new int[0];
		int[] mas3 = new int[0];
		int n=enterrange(args);
		mas1 = numerator(n);
		mas2 = denominator(n);
		int CD = CommonDenom(mas2);
		mas3=NextNumerator(mas1, mas2, CD);
		sort(mas3, CD);
	}

	@SuppressWarnings("resource")
	public static int enterrange(String args[]) {
		Scanner ent = new Scanner(System.in);
		int n = ent.nextInt();
		return n;
	}
	
	public static int[] numerator(int m) {
		int[] mas1 = new int[m];
		for (int i = 0; i < mas1.length; i++) {
			while (mas1[i]==0)
			{Random rand = new Random();
			mas1[i] = rand.nextInt(20);}
		}
		//System.out.println(Arrays.toString(mas1) + "исходный числитель");
		return mas1;
	}

	public static int[] denominator(int m) {
		int[] mas2 = new int[m];
		for (int i = 0; i < mas2.length; i++) {
			while (mas2[i]==0)
			{Random rand = new Random();
			mas2[i] = rand.nextInt(20);}
		
		}
	//	System.out.println(Arrays.toString(mas2) + "исходный знаменатель");
		return mas2;
	 }

	public static int CommonDenom (int[] mas12) {
		int CD=1;
		for (int i=0; i<mas12.length; i++) {
		 if (CD%mas12[i]==0) CD=CD*1;
		 else CD=CD*mas12[i];
		}
	//	System.out.println("Общий знаменатель= "+CD);
	return CD;
	}
		 
	public static int[] NextNumerator (int[] mas21, int[] mas22, int CD1) {
		for (int s=0; s<mas21.length; s++)
			System.out.print(mas21[s]+"/"+mas22[s]+", ");
			System.out.println();
		
		int n=mas21.length;
		int[] mas3 = new int[n];	
		for (int i=0; i<n; i++) {
			mas3[i]=mas21[i]*(CD1/mas22[i]);
		}
		//System.out.println(Arrays.toString(mas3) + "новый числитель");
		return mas3;
	}

	//сортировка вставками
	public static void sort(int[] mas13, int CD1) {
		int i;
		for (i = 1; i < mas13.length; i++) {
			
			int temp = mas13[i];
			int j = i-1;
			while (j >= 0 && temp < mas13[j]) {
				mas13[j+1] = mas13[j];
				j--;
			}
			mas13[j + 1] = temp;
		}
		//System.out.println(Arrays.toString(mas13) + "сортировка");
		for (i=0; i<mas13.length; i++) 
		System.out.print(mas13[i]+"/"+CD1+", ");
	 }
}
