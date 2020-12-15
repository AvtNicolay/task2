//Декомпозиция с исп-м методов. 
//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел: НОК(А,В)=А*В/НОД(А,В)
//НОК-наибольшее общее кратное; НОД-наибольший общий делитель;
//Алгоритм Евклида 
//https://habr.com/ru/sandbox/60131/

package by.training.tutor2;

import java.util.Scanner;

public class Main41_1 {
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

		int[] mas1 = new int[2];
		int m;
		for (int i = 0; i < mas1.length; i++) {
			m = enterNum(args);
			mas1[i] = m;
		}
		return mas1;
	}

	public static void Calc(String args[]) {// расчет множителей в числе

		int[] mas2 = new int[2];
		mas2 = INtro(args);
		int a = mas2[0];
		int b = mas2[1];
		
		int Max=1;
		int Min=1;
		int NOD=1;
		int Ost;
		
			if      (a > b) { Max = a; Min = b; }
			else if (b > a) { Max = b; Min = a; }
			else NOD = 1;
						
		Ost = Max % Min; // остаток от деления
		//System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);
		while (Ost != 0 & Max!=1 & Min!=1) {
			Max = Min;
			Min = Ost;
			Ost = Max % Min;
			//System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);
			if (Ost==0) {NOD=Min; break;}
			if (Ost==1) break; 
		}
		
		Min = NOD;
		int NOK = a*b/NOD;

		System.out.println("a*b= " + a * b);
		System.out.println("NOD= " + NOD);
		System.out.println("NOK= " + NOK);

	}
}