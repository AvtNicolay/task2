//8. в числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main18 {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		Scanner enter = new Scanner(System.in);

		int n;
		System.out.print("enter the matrix range n = ");
		n = enter.nextInt();

		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				
				mas[i][j] = (i*mas.length+j+1);
				
				if (mas[i][j]<10) {
				System.out.print("  "+mas[i][j] + " ");}
				if (mas[i][j]>=10 & mas[i][j]<=100) {
					System.out.print(" "+mas[i][j] + " ");}
			}
			System.out.println();
		}
		
		//меняем местами 2 строки
		
		System.out.println();
		System.out.println("swap any 2 columns to each other");
		System.out.print("enter number of first column. m1 =");
		int m1 = enter.nextInt();
		System.out.print("enter number of second column. m2 =");
		int m2 = enter.nextInt();
		
		int [] a = new int [n];
		int [] b = new int [n];
		a = mas[m1];
		b = mas[m2];
		//mas[m1]=mas[m2];
		//mas[m2]=a;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		mas[m1]=b;
		mas[m2]=a;
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				
				if (mas[i][j]<10) {
				System.out.print("  "+mas[i][j] + " ");}
				if (mas[i][j]>=10 & mas[i][j]<=100) {
					System.out.print(" "+mas[i][j] + " ");}
			}
			System.out.println();
		}  
	//меняем местами 2 столбца
	System.out.println("swap any 2 rows to each other");
		System.out.print("enter number of first row. k1 =");
		int k1 = enter.nextInt();
		System.out.print("enter number of second row. k2 =");
		int k2 = enter.nextInt();
	
	
	for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j==k1) {
				int temp=mas[i][k1];
				mas[i][k1]=mas[i][k2];
				mas[i][k2]=temp;
		}
				if (mas[i][j]<10) {
				System.out.print("  "+mas[i][j] + " ");}
				if (mas[i][j]>=10 & mas[i][j]<=100) {
					System.out.print(" "+mas[i][j] + " ");}
			}
		System.out.println();
		}
		
	} 
}
