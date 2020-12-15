//5. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
package by.training.tutor2;

import java.util.Scanner;

public class Main15 {

@SuppressWarnings("resource")
public static void main (String args[]) {
	
	
	Scanner enter = new Scanner(System.in);
	
	int n;
	
	System.out.print("enter the matrix range n = ");
	while (!enter.hasNextInt())// пока в потоке не int - запрос на ввод!
	{
	System.out.print("enter the matrix range n = ");
	enter.next();// смотрим значение в потоке
	}
	n=enter.nextInt();
	
	int[][] mas = new int [n][n]; 
	
	for(int i=0; i<mas.length; i++) {
		for(int j=0; j<mas[i].length; j++) {
		if (j>=n-1-i) {mas[i][j]=0;}	
		else {mas[i][j]=i+1;}
		System.out.print(mas[i][j]+" ");
		}
		System.out.println();
		}
	}
}

