
//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
//элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main52 {
	public static void main(String args[]) {
	FinMas(args);
	
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {// ввод чисел

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter number =");

		int n;
		while (!ent.hasNextInt()) {
			ent.next();
			System.out.print("incorrect input");
		}
		n = ent.nextInt();

		return n;
	}

	public static int Log(int m) {// расчет разрядности введенных чисел

		double k = Math.log10(m);
		int z = ((int) k) + 1;// кол-во разрядов числа
		//System.out.println("число разрядов: " + z);
		return z;
	}

	public static int[] Mas(int n) {// формируем массив цифр (от числел N, Ost)

		int z2 = Log(n);
		int MaxRangeN;// расчет цифры максимального разрядв
		double z22 = z2;
		double z222 = Math.pow(10, (z22 - 1));
		int z2222 = (int) z222;
		MaxRangeN = n / z2222;

		int mas[] = new int[z2];// формируем массив из цифр, числа N-1
		// макс. результат это когда в ф-ле есть 9!!
		if (n < 10) {
			mas[0] = n - 1;
		}

		if (n >= 10) {
			mas[0] = MaxRangeN - 1;
			for (int i = 1; i < z2; i++) {
				mas[i] = 9;
			}
		//System.out.println(Arrays.toString(mas));
		}
		return mas;
	}

	public static int SumMas(int[] mas1) {// расчет суммы элементов массивов от чисел N-1, Ost
		
		int sum = 0;
		for (int i = 0; i < mas1.length; i++) {
			sum = sum + mas1[i];
		}
		//System.out.println("Сумма = " + sum);
		return sum;
	}

	public static int Num(int[] masNew) {//получаем число из цифр массивов masN и Ost 
		double Num=0;
		for (int i=masNew.length-1; i>=0;i--) {
			Num=Num+ masNew[masNew.length-1-i]*Math.pow(10, i);
			}
		int Num1 = (int) Num;
		//System.out.println("Num= "+Num);
 return Num1;
	}
	
	public static void FinMas(String args[]) {// расчет количества N-1 и числа остатка
	int k =  enter(args);// K
	int  n =  enter(args);
	
	int[] masN = Mas(n);
	System.out.println("массив чисел N-1 = "+Arrays.toString(masN));
	int NumN_1=Num(masN);
	System.out.println("получено число = "+NumN_1);
	int   sumN = SumMas(masN);	
	System.out.println("сумма чисел N-1 = "+sumN);
	
	
	int Div = k/sumN;// сколько k/сум.цифр(N-1) в k 
	int Ost = k%sumN;// остаток от Div
	System.out.println("остаток = "+Ost);
	int[] masOst = Mas(Ost);
	masOst[0]=1;
	System.out.println("остаток-массив = "+Arrays.toString(masOst));
	System.out.println("число эл.-в остаток-массива = "+masOst.length);
	
	int R = Div+masOst.length;  
	System.out.println("число эл.-в итогового массива "+R);
	
	int[] fin = new int[R];//итоговый массив чисел
	fin[0] = Ost;//
	for (int i=1; i<R; i++) {
	fin[i]=NumN_1;}
	System.out.println("итоговый массив чисел, сумма цифр которых - K= "+k);
	System.out.println("итоговый массив чисел:"+Ost+", ["+NumN_1+"]*"+Div);
	System.out.println(Arrays.toString(fin)); 
	}

}