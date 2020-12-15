
//12. ���� ����������� ����� � � N. �������� �����(������) ������������ ������� �,
//���������� �������� �������� �����, ����� ���� ������� ����� � � ������� �� ������� N.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main52 {
	public static void main(String args[]) {
	FinMas(args);
	
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {// ���� �����

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

	public static int Log(int m) {// ������ ����������� ��������� �����

		double k = Math.log10(m);
		int z = ((int) k) + 1;// ���-�� �������� �����
		//System.out.println("����� ��������: " + z);
		return z;
	}

	public static int[] Mas(int n) {// ��������� ������ ���� (�� ������ N, Ost)

		int z2 = Log(n);
		int MaxRangeN;// ������ ����� ������������� �������
		double z22 = z2;
		double z222 = Math.pow(10, (z22 - 1));
		int z2222 = (int) z222;
		MaxRangeN = n / z2222;

		int mas[] = new int[z2];// ��������� ������ �� ����, ����� N-1
		// ����. ��������� ��� ����� � �-�� ���� 9!!
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

	public static int SumMas(int[] mas1) {// ������ ����� ��������� �������� �� ����� N-1, Ost
		
		int sum = 0;
		for (int i = 0; i < mas1.length; i++) {
			sum = sum + mas1[i];
		}
		//System.out.println("����� = " + sum);
		return sum;
	}

	public static int Num(int[] masNew) {//�������� ����� �� ���� �������� masN � Ost 
		double Num=0;
		for (int i=masNew.length-1; i>=0;i--) {
			Num=Num+ masNew[masNew.length-1-i]*Math.pow(10, i);
			}
		int Num1 = (int) Num;
		//System.out.println("Num= "+Num);
 return Num1;
	}
	
	public static void FinMas(String args[]) {// ������ ���������� N-1 � ����� �������
	int k =  enter(args);// K
	int  n =  enter(args);
	
	int[] masN = Mas(n);
	System.out.println("������ ����� N-1 = "+Arrays.toString(masN));
	int NumN_1=Num(masN);
	System.out.println("�������� ����� = "+NumN_1);
	int   sumN = SumMas(masN);	
	System.out.println("����� ����� N-1 = "+sumN);
	
	
	int Div = k/sumN;// ������� k/���.����(N-1) � k 
	int Ost = k%sumN;// ������� �� Div
	System.out.println("������� = "+Ost);
	int[] masOst = Mas(Ost);
	masOst[0]=1;
	System.out.println("�������-������ = "+Arrays.toString(masOst));
	System.out.println("����� ��.-� �������-������� = "+masOst.length);
	
	int R = Div+masOst.length;  
	System.out.println("����� ��.-� ��������� ������� "+R);
	
	int[] fin = new int[R];//�������� ������ �����
	fin[0] = Ost;//
	for (int i=1; i<R; i++) {
	fin[i]=NumN_1;}
	System.out.println("�������� ������ �����, ����� ���� ������� - K= "+k);
	System.out.println("�������� ������ �����:"+Ost+", ["+NumN_1+"]*"+Div);
	System.out.println(Arrays.toString(fin)); 
	}

}