//4. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
//� ������� �������� � ������ ������ �������������. 1-� ������ ������������ ������������������ 1, 2, 3,..
package by.training.tutor2;

import java.util.Scanner;

public class Main14 {

@SuppressWarnings("resource")
public static void main (String args[]) {
	
	
	Scanner enter = new Scanner(System.in);
	
	int n;
	
	System.out.print("enter the matrix range n = ");
	while (!enter.hasNextInt())// ���� � ������ �� int - ������ �� ����!
	{
	System.out.print("enter the matrix range n = ");
	enter.next();// ������� �������� � ������
	}
	n=enter.nextInt();
	
	
	int[][] mas = new int [n][n]; 
	
	for(int i=0; i<mas.length; i++) {
		if (i%2==0)
		{for(int j=0; j<mas[i].length; j++) {
			mas[i][j]=j;
		System.out.print(mas[i][j]+" ");
		}}
		else {
			for (int j=mas[i].length-1; j>=0; j--) {
			mas[i][j]=j;
		System.out.print(mas[i][j]+" ");
												  }
			}
		System.out.println();
	}
		
}
}
