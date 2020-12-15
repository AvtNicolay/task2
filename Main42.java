//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
//Алгоритм Евклида рабоает последовательно НОД1=НОД(1и2), НОД2=НОД1=(НОД и3), НОД3=НОД2=НОД1=(НОД, 4)   
//https://habr.com/ru/sandbox/60131/

package by.training.tutor2;

import java.util.Scanner;

public class Main42 {
	public static void main(String args[]) {
		Calc(args);

	}

	@SuppressWarnings("resource")
	public static int enterNum(String args[]) {
		
			System.out.print("Введите число = ");
			Scanner ent = new Scanner(System.in);
			int n = ent.nextInt();
	
		return n;
	}

	public static int[] INtro(String args[]) {// формируем массив из A&B

		int[] mas1 = new int[4];
		int m;
		for (int i = 0; i < mas1.length; i++) {
			m = enterNum(args);
			mas1[i] = m;
		}
		return mas1;
	}

	public static void Calc(String args[]) {// расчет множителей в числе

		int[] mas2 = new int[4];
		mas2 = INtro(args);
		int a = mas2[0];
		int b = mas2[1];
		int c = mas2[2];
		int d = mas2[3];
		
		int Max=1;
		int Min=1;
		int NOD=1;
		int Ost;
		
			if      (a > b) { Max = a; Min = b; }
			else if (b > a) { Max = b; Min = a; }
			else NOD = 1;
						
		Ost = Max % Min; // остаток от деления
		if (Ost==0) {NOD=Min;
		System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);}
		
		while (Ost != 0 && Max!=1 && Min!=1) {
			Max = Min;
			Min = Ost;
			Ost = Max % Min;
			System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);
			if (Ost==0) {NOD=Min; break;}
			if (Ost==1) break; 
		}
		
		Min = NOD;
		System.out.println("NOD("+a+", "+b+")= "+NOD);
		
		if (c%NOD==0) System.out.println("NOD("+a+", "+b+" ,"+c+")= "+NOD);
		else NOD=1;
		
		if (d%NOD==0) System.out.println("NOD("+a+", "+b+" ,"+c+" ,"+d+")= "+NOD);
		else NOD=1;

	}
}