//1. ������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. ���������� �� �
//���� ������, ������� ������ ������ ����� k-� � (k+1) - � ���������� �������, ��� ���� �� ���������
//�������������� ������.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Scanner;

public class Main31 {
	public static void main(String args[]) {
		
		
		
		int[] mas1=new int[0];
		int[] mas2=new int[0];
		mas1=entermas1(args);
		mas2=entermas2(args);
		mixmas(mas1, mas2);
	}
	@SuppressWarnings("resource")
	public static int[] entermas1(String args[]) {

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive1= ");

		while (!ent.hasNextInt())// ���� � ������ �� int - ������ �� ����!
		{
			System.out.print("Enter range massive1= ");
			ent.next();// ������� �������� � ������
		}
		int n = ent.nextInt();
		int[] mas1 = new int[n];

		for (int i = 0; i < mas1.length; i++) {
			mas1[i] = mas1.length-i;
		}
		System.out.print(Arrays.toString(mas1));
		System.out.println();
	return mas1;
	}
	
	@SuppressWarnings("resource")
	public static int[] entermas2(String args[]) {

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive2= ");

		while (!ent.hasNextInt())// ���� � ������ �� int - ������ �� ����!
		{
			System.out.print("Enter range massive2= ");
			ent.next();// ������� �������� � ������
		}
		int m = ent.nextInt();
		int[] mas2 = new int[m];

		for (int j = 0; j < mas2.length; j++) {
			mas2[j] = 2*j;
		}
		System.out.println(Arrays.toString(mas2));
	return mas2;
	}
	
	@SuppressWarnings("resource")
	public static void mixmas(int[] mas11, int[] mas12) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Element k= ");
		while (!ent.hasNextInt())// ���� � ������ �� int - ������ �� ����!
		{
			System.out.print("Enter range massive2= ");
			ent.next();// ������� �������� � ������
		}
		int k = ent.nextInt();
		int h= mas11.length + mas12.length;
		int[] mas22 = new int[h];
//		System.out.println(Arrays.toString(mas22));
//Arrays.sort(mas11);//-������ �����, ����� ������ ���!!!!
//System.out.println(Arrays.toString(mas11));
//mas22=Arrays.copyOf(mas11, mas11.length); - �� �������� �.�. �������� ����� ��������� �� �����������!! 
//System.out.println(Arrays.toString(mas22));
		
		for (int i=0; i<mas11.length; i++) {
		if (i<mas11.length) {
			mas22[i]=mas11[i];}
		}
		System.out.println(Arrays.toString(mas22));
		System.out.println("!!");
		
		int delta = mas11.length-1-k;
		for (int j=0; j<delta+1; j++) {
			
			mas22[mas22.length-1-j]=mas22[mas11.length-1-j];
			mas22[mas11.length-1-j]=0;
		}
		System.out.println(Arrays.toString(mas22));
		
		for (int i=k; i<mas12.length+k; i++)
			mas22[i]=mas12[i-k];
		System.out.println(Arrays.toString(mas22));
			
	   }
}



