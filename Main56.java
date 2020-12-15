//16. Написать программу, определяющую сумму n - значных чисел,
//содержащих только нечетные цифры. Определить также, сколько четных
//цифр в найденной сумме. Для решения задачи использовать декомпозицию.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main56 {
	
	
	public static void main(String args[]) {
		
		fin(args);
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {// ввести число
		Scanner ent = new Scanner(System.in);
	
		int n;
		while (!ent.hasNextInt()) {
			System.out.println("incorrect input");
			System.out.print("Enter range number =");
			ent.next();
		}
		n = ent.nextInt();
		return n;
	}
	
	public static int Range(String args[]) {//вводим разрядность чисел
	int z = enter(args);
	return z;
	}
	
	public static int RangeNum(int m) {// расчет разрядности числа
		double k = Math.log10(m);
		int z1 = (int) k;// кол-во разрядов числа
		z1=z1+1;
		return z1;
		}
	
	public static int[] MasNum(int n) {// формируем массив из цифр заданного числа
		int z1=RangeNum(n);  
		
		int[] mas = new int[z1];
		
		for (int i = z1-1; i >= 0; i--) {

			double Dec = Math.pow(10, i);
			mas[z1-1 - i] = (int) (n / Dec);
			n = n - ((int) Dec) * mas[z1-1 - i];
		}
		return mas;
	}

	public static int AnalisMas(int[] mas) {// проверяем массив из цифр заданного числа на наличие четных цифр
		int mult=1;
		int ind=1; 
				
		for (int i=0; i<mas.length; i++) {
			if (mas[i]%2==0) ind=0;
			else ind =1;
			mult = mult*ind; 
			}
	if (mult==1) {System.out.println("Число содержит только нечетные цифры");}
	else {System.out.println("Число содержит только одно или несколько четных цифры");} 
	return mult; 
	}
	
	public static int[] verifiNum(String args[]) {
	int z = Range(args);
	System.out.println("Enter Num one more ");//!!!!!!!!!!!!!!!!!!!!!!!!(2)
	int num = enter(args);
	
	int z1 = RangeNum(num);
	
	int[] mas = MasNum(num);

	int mult1 = AnalisMas(mas);
	
	while (z!=z1 & mult1!=1){
	System.out.println("incorrect input");
	System.out.println("Enter Num=");
	
	//num = enter(args);
	System.out.println("num="+num);
	z1 = RangeNum(num);
	mas = MasNum(num);
	mult1 = AnalisMas(mas);
	}
	System.out.println(Arrays.toString(mas));
	
	int[] masN = new int[z1+1];
		
	for (int i=0;i<mas.length; i++){
	masN[i]=mas[i];}
	masN[mas.length]=num;

	return masN;
	}
	
		
	public static void fin(String args[]) {
	System.out.println("Введите разрядность чисел");
	System.out.print("n= ");
	int z = Range(args);
	System.out.println("Range="+z);
	
	
	System.out.print("Enter Num1=");//!!!!!!!!!!!!!!!!!(1)
	int[] masN1=verifiNum(args);
	int n1 = masN1[z];
	System.out.println("n1="+n1);
	
	
	System.out.print("Enter Num2=");
	int[] masN2=verifiNum(args);
	int n2 = masN2[z];
	System.out.println("n2="+n2);
	
	int res = n1+n2;
	int[] masRes = new int[z];  
	masRes = MasNum(res);
	System.out.println("Summa= "+res);	
  //System.out.println("Result -"+Arrays.toString(masRes));
  int ind=0;
  for (int j=0; j<masRes.length; j++){
  if (masRes[j]%2==0) ind=ind+1; 
    }
   System.out.println("even numbers = " +ind); 
 }
}