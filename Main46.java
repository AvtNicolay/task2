//6. Ќаписать метод(методы), провер€ющий, €вл€ютс€ ли данные три числа взаимно простыми.
//¬заимно простые числа Ч целые числа, не имеющие никаких общих делителей, кроме ±1. или Ќќƒ =1.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main46 {
	public static void main(String args[]) {
		Calc(args);

	}

	@SuppressWarnings("resource")
	public static int enterNum(String args[]) {//вводит числа
		
			System.out.print("¬ведите число = ");
			Scanner ent = new Scanner(System.in);
			int n = ent.nextInt();
	
		return n;
	}

	public static int[] INtro(String args[]) {// формируем массив из A&B&C

		int[] mas1 = new int[3];
		int m;
		for (int i = 0; i < mas1.length; i++) {
			m = enterNum(args);
			mas1[i] = m;
		}
		return mas1;
	}

	public static int[] Sorti(String args[]) {// сортировка, макс--мин
		int[] mas2 = new int[3];
		mas2 = INtro(args);
		for (int i = 1; i < mas2.length; i++) {
			int temp = mas2[i];
			int j = i - 1;
			while (j >= 0 && temp > mas2[j]) {
				mas2[j + 1] = mas2[j];
				j--;
			}
			mas2[j + 1] = temp;
		}
		System.out.println(Arrays.toString(mas2) + "сортировка вставками+");
		return mas2;
}
		
	public static int Find(int Max, int Min) {//€вл€ютс€ ли пары 1и2, 2и3, 1и3 взаимно простыми 
	
	//далее сравнить 1и2, затем если Ќќƒ=1, то 1и2, 2и3 т.е. по циклу (отсюда и до конца новый метод)!  	
	//сделать на нод не нод - отдельный метод, передовать попарно массив, результат в свод в виде или 1,
	//далее если все 1 - взаимнопростые, люба€ пара не вз.постые - все не вз простые!
	
		//int NOD=1;
		int Ost;
		int s=0;
		
		Ost = Max % Min; // остаток от делени€
	//	System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);
		while (Ost != 0 & Max!=1 & Min!=1) {
			Max = Min;
			Min = Ost;
			Ost = Max % Min;
		//System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);
			if (Ost==1) {
				//System.out.println("„исла €вл€ютс€ взаимно простыми");
				s=1; break;}
			if (Ost==0) 
			{//NOD=Min; 
			//System.out.println("„исла Ќ≈ €вл€ютс€ взаимно простыми");
				s=0; break;}
			//NOD=Min;
			//int NOK = a*b/NOD;
			//System.out.println("a*b= " + a * b);
			//System.out.println("NOD= " + NOD);
			//System.out.println("NOK= " + NOK);}
			
		}
		return s;
	}
		
	public static void Calc(String args[]) {// свод по парам
		int s;
		int s1;
		int s2;
		int s3;
		int[] mas2 = new int[3];
		mas2 = Sorti(args);
		
		int Max = mas2[0];
		int Min = mas2[1];
		s1=Find(Max, Min);
		
		Max = mas2[1];
		Min = mas2[2];
		s2=Find(Max, Min);
		
		Max = mas2[0];
		Min = mas2[2];
		s3=Find(Max, Min);
		
		s=s1*s2*s3;
		if (s==0) {System.out.println("„исла Ќ≈ €вл€ютс€ взаимно простыми");} 
		if (s==1) {System.out.println("„исла €вл€ютс€ взаимно простыми");}
	
		}
}