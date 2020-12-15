//6. ���������� �����. ��� ������ n �������������� �����. ��������� ����������� ��� �� �����������.
//��������: ������������ 2 �������� �������� a[i] � a[i+1]. ���� a[i]<=a[i+1], �� ������������
//�� ���� ������� ������. ���� a[i]>a[i+1] �� ������������ ������������ � ���������� �� ���� ������� �����.

package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main36 {
	public static void main(String args[]) {

		int[] mas1 = new int[0];
		mas1 = entermas1(args);
		sort(mas1);
	}

	@SuppressWarnings("resource")
	public static int[] entermas1(String args[]) {
		// int[] mas1 = new int[] { 15, 7, 8, 2, 1, 12, 9, 7, 9, 0, 3, 1 };
		Scanner ent = new Scanner(System.in);
		System.out.print("Enter range massive1= ");
		int n = ent.nextInt();
		int[] mas1 = new int[n];
		for (int i = 0; i < mas1.length; i++) {
			Random rand = new Random();
			mas1[i] = rand.nextInt(20);
		}
		System.out.println(Arrays.toString(mas1) + "�������� ������");
		return mas1;
	}

	public static void sort(int[] mas11) {

		int j;
		int step = mas11.length / 2;

		while (step > 0) {
			for (int i = 0; i < (mas11.length - step); i++) {
				j = i;
				while ((j >= 0) && (mas11[j] > mas11[j + step])) {
					int temp = mas11[j];
					mas11[j] = mas11[j + step];
					mas11[j + step] = temp;
					j -= step;
				}
			}
			step = step / 2;
		}
		System.out.println(Arrays.toString(mas11) + "����������");
	}
}