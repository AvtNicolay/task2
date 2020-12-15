//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, 
//если сумма его цифр, возведенная в степень n, равна самому числу. 
//Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main54 {
	public static void main(String args[]) {
		find(args);
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {// ввести число

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter number =");

		int n = 0;

		while (!ent.hasNextInt()) {
			System.out.println("incorrect input");
			System.out.print("Enter number =");
			ent.next();
		}

		n = ent.nextInt();
		return n;
	}

	public static int enter1(String args[]) {// ввести число
		int n = enter(args);
		if (n < 1) {
			System.out.println("incorrect input");
			n = enter(args);
		}
		System.out.println("n= " + n);
		return n;
	}

	public static int Log(int m) {// расчет разрядности чисел

		double k = Math.log10(m);
		int z = ((int) k) + 1;// кол-во разрядов числа
		// System.out.println("число разрядов: " + z);
		return z;
	}

	public static int[] INtr(int n) {// формируем массив из числа

		int z = Log(n);
		int[] mas = new int[z];
	//	System.out.println("число разрядов: " + (z));

		double sum = 0;
		for (int i = z - 1; i >= 0; i--) {

			double Dec = Math.pow(10, i);
			mas[z - 1 - i] = (int) (n / Dec) - (int) sum;
			n = n - ((int) Dec) * mas[z - 1 - i];
			// System.out.println("mas[i] = " +mas[i]);
		}
		//System.out.println(Arrays.toString(mas));
		return mas;
	}

	public static void find(String args[]) {

		int n = enter1(args);
		int z1 = Log(n);
		int[] mas1 = new int[z1];
		mas1 = INtr(n);
		System.out.println(Arrays.toString(mas1));
		
		int s =0;//признак отсутствия иском.чисел
		int s2=0;//признак присутствия иском.чисел
		int i;
		
		int sum = 0;
		int sumFin=0;
		
		for (i = 1; i <= n; i++) {
		int z = Log(i);
			int[] mas = new int[z];
			mas = INtr(i);
			for (int j = 0; j < z; j++) {
				
				double sum1 = Math.pow(mas[j], z);
				sum = (int) sum1; //System.out.println("*******sum= "+ sum); 
				sumFin = sumFin + sum;
			//	System.out.println("SumFin= "+ sumFin); 
			}
		if (sumFin == i) {
			System.out.println("Число Армстронга " + Arrays.toString(mas));
			s2=0;		
		}
		else s=1;
			sumFin=0;
		}
		s=s*s2;
		if (s==1) System.out.println("No Numbers");	
	}

}