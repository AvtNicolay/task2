//6. �������� �����(������), �����������, �������� �� ������ ��� ����� ������� ��������.
//������� ������� ����� � ����� �����, �� ������� ������� ����� ���������, ����� �1. ��� ��� =1.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main46 {
	public static void main(String args[]) {
		Calc(args);

	}

	@SuppressWarnings("resource")
	public static int enterNum(String args[]) {//������ �����
		
			System.out.print("������� ����� = ");
			Scanner ent = new Scanner(System.in);
			int n = ent.nextInt();
	
		return n;
	}

	public static int[] INtro(String args[]) {// ��������� ������ �� A&B&C

		int[] mas1 = new int[3];
		int m;
		for (int i = 0; i < mas1.length; i++) {
			m = enterNum(args);
			mas1[i] = m;
		}
		return mas1;
	}

	public static int[] Sorti(String args[]) {// ����������, ����--���
		int[] mas2 = new int[3];
		mas2 = INtro(args);
		for (int i = 1; i < mas2.length; i++) {
			int temp = mas2[i];
			int j = i - 1;
			while (j >= 0 && temp > mas2[j]) {
				mas2[j + 1] = mas2[j];
				j--;
			}
			mas2[j + 1] = temp;
		}
		System.out.println(Arrays.toString(mas2) + "���������� ���������+");
		return mas2;
}
		
	public static int Find(int Max, int Min) {//�������� �� ���� 1�2, 2�3, 1�3 ������� �������� 
	
	//����� �������� 1�2, ����� ���� ���=1, �� 1�2, 2�3 �.�. �� ����� (������ � �� ����� ����� �����)!  	
	//������� �� ��� �� ��� - ��������� �����, ���������� ������� ������, ��������� � ���� � ���� ��� 1,
	//����� ���� ��� 1 - ��������������, ����� ���� �� ��.������ - ��� �� �� �������!
	
		//int NOD=1;
		int Ost;
		int s=0;
		
		Ost = Max % Min; // ������� �� �������
	//	System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);
		while (Ost != 0 & Max!=1 & Min!=1) {
			Max = Min;
			Min = Ost;
			Ost = Max % Min;
		//System.out.println("Max= "+Max+" Min= "+Min+" Ost= "+Ost);
			if (Ost==1) {
				//System.out.println("����� �������� ������� ��������");
				s=1; break;}
			if (Ost==0) 
			{//NOD=Min; 
			//System.out.println("����� �� �������� ������� ��������");
				s=0; break;}
			//NOD=Min;
			//int NOK = a*b/NOD;
			//System.out.println("a*b= " + a * b);
			//System.out.println("NOD= " + NOD);
			//System.out.println("NOK= " + NOK);}
			
		}
		return s;
	}
		
	public static void Calc(String args[]) {// ���� �� �����
		int s;
		int s1;
		int s2;
		int s3;
		int[] mas2 = new int[3];
		mas2 = Sorti(args);
		
		int Max = mas2[0];
		int Min = mas2[1];
		s1=Find(Max, Min);
		
		Max = mas2[1];
		Min = mas2[2];
		s2=Find(Max, Min);
		
		Max = mas2[0];
		Min = mas2[2];
		s3=Find(Max, Min);
		
		s=s1*s2*s3;
		if (s==0) {System.out.println("����� �� �������� ������� ��������");} 
		if (s==1) {System.out.println("����� �������� ������� ��������");}
	
		}
}