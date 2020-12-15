//5. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
package by.training.tutor2;

import java.util.Scanner;

public class Main16 {

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
	
	if ((n+1)%2==0) {n=n+1;} System.out.println("n = "+n);//если ввели нечетное, то округл€ем до ближайшего большего
	
	int[][] mas = new int [n][n]; 
	
	String[] mas1 = new String[n]; 
	for (int i=0; i<mas.length; i++) {
		mas1[i]="*";
		System.out.print(mas1[i]+" ");	
		} System.out.println();
		
	
	for(int i=0; i<n/2; i++) {
		for(int j=0; j<mas[i].length; j++) {
		if (j<i || j>=n-i) {mas[i][j]=0;}	
		else {mas[i][j]=1;}
		System.out.print(mas[i][j]+" ");
		}
		System.out.println();
		}
		
	for(int i=n/2+1; i<n; i++) {
		for(int j=0; j<mas[i].length; j++) {
		if (j>=i+1 || j<n-i-1) {mas[i][j]=0;}	
		else {mas[i][j]=1;}
		System.out.print(mas[i][j]+" ");
		}
		System.out.println();
		}
	
	for (int i=0; i<mas1.length; i++) {
		mas1[i]="*";
		System.out.print(mas1[i]+" ");	
		} System.out.println();
}
}

