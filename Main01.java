//1. � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, ������� ������ ������� �.
package by.training.tutor2;

import java.util.Arrays;

public class Main01 {
	public static void main(String[] args) {
		int[] A = new int[] { 1, 5, 7, 6, 12, 30, 67, 90 };
		int N = 3;
		//int s1;
		System.out.println(Arrays.toString(A));
		System.out.println("����� ��������� �������" + A.length);
		sum(A, N);
	}
		//System.out.println("����� ����� " +s1);
//---------------------------------------------------------------
//int s = 0;
//int b = 0;
//int c = 0;
//for (int i = 0; i < A.length; i++) {
//int b=A[i]/N;
//c = A[i] - b * N;
//if (c == 0)
//{s = s + A[i];
//System.out.println("������� � [" + i + "] = " + A[i] + " ������ " + N);}
//	}
//System.out.println("����� ����� " +s);
//}
//------------------------------------------------------------------
	public static int sum(int[] A, int N) {
		int s = 0;
		
		int c = 0;
		for (int i = 0; i < A.length; i++) {
			int b = A[i]/N;
			c = A[i] - b * N;
			{
				if (c == 0)
					{s = s + A[i];
				System.out.println("������� � [" + i + "] = " + A[i] + " ������ " + N);}

			}
		} 
		System.out.println("����� ����� "+s);return s;
		 
	
	}

}
