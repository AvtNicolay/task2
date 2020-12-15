//2. 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
package by.training.tutor2;

import java.util.Scanner;

public class Main13 {
	@SuppressWarnings("resource")
	public static void main(String args[]) {

		int[][] mas = new int[][] { { 5, 9, 5, 4, 8, 7 }, { 2, 5, 6, 8, 9, 3 }, { 7, 4, 5, 7, 4, 6 },
				{ 3, 5, 9, 5, 1, 8 }, { 9, 9, 5, 8, 5, 9 }, { 7, 4, 8, 2, 6, 5 } };
		
		System.out.println("Задана матрица 6 (0-5) Х 6 (0-5)");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		
		Scanner enter = new Scanner (System.in);
		
				int k;
				do { 
				System.out.print("Введите № строки для вывода на консоль k= ");
		        k=enter.nextInt();
		        }while (k>5);
				
				int p;
		        do {
		        System.out.print("Введите № столбца для вывода на консоль р= ");
				p=enter.nextInt();
		        }while (p>5);
		        
		        System.out.print("строка ["+k+"]= ");
		        for (int i=0; i<mas.length ;i++) {
		        System.out.print(mas[k-1][i]+" ");
		        }
		        System.out.println();
	
		        System.out.println("столбец ["+p+"]= ");
		        for (int i=0; i<mas.length ;i++) {
		        System.out.println(mas[i][p-1]+" ");
		        }
		        System.out.println();
	
	 }
//Учимся ставить метки
//	public class Main14 {
//		public static void main (String args[]) {
//			lab1: for (int i=0; i<10; i++) {
//				lab2: for (int j=0; j<10; j++) {
//						for (int k=0; k<10; k++) {
//						if (j==2) continue lab1;
//						if (k!=4) break lab2;
//						System.out.println("hello");
//						}
//				}
//			}
//		}
//	}


}
	
