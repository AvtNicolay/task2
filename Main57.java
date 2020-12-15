//17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
//Сколько таких действий надо произвести, чтобы получился нуль? 
//Для решения задачи использовать декомпозицию.

package by.training.tutor2;

//import java.util.Arrays;
import java.util.Scanner;

public class Main57 {
	
	
	public static void main(String args[]) {

		finish(args);
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {// ввести число
		Scanner ent = new Scanner(System.in);
		System.out.print("Enter number =");
		int n;
		while (!ent.hasNextInt()) {
			System.out.println("incorrect input");
			System.out.print("Enter number =");
			ent.next();
		}
		n = ent.nextInt();
		return n;
	}
	
	public static int MasNum(int q) {// формируем массив из цифр заданного числа, считаем сумму цифр 
		double k = Math.log10(q);
		int z1 = (int) k;// кол-во разрядов числа
		z1=z1+1;
		
		int[] mas = new int[z1];
		for (int i = z1-1; i >= 0; i--) {
			double Dec = Math.pow(10, i);
			mas[z1-1 - i] = (int) (q / Dec);
			q = q - ((int) Dec) * mas[z1-1 - i];
		}
		//System.out.println(Arrays.toString(mas));	

		int sum=0;
			for (int j=0; j<mas.length; j++) {
			sum = sum+mas[j];
		}
		//System.out.println("sum="+sum);
		return sum;
		}
	
	
	public static int Subtract(int m) {
		
		int sum = MasNum(m);
		int Minus = m-sum;
		
		return Minus;
	}

	public static void finish(String args[]) {
		int n  = enter(args);
		int res = Subtract(n);
		int index = 1;
	while (res!=0) {
		res = Subtract(res);
		index++;
		}
		
	System.out.println("number cycles= "+index);	
		
	}

}
