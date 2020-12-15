//9. ���� ����� X, Y, Z, � � ����� ������ ����������������. 
//�������� �����(������) ���������� ��� �������, ���� ���� ����� ��������� ������ X � Y� ������.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;

public class Main49 {
	public static void main(String args[]) {
		System.out.println("���� ����� X, Y, Z, � � ���� X, Y=90 ��. �-�� ������� 4-����������");
		square(args);

	}

	public static int[] enter(String args[]) {
		int[] mas = new int[4];
		for (int i = 0; i < mas.length; i++) {
			Random rand = new Random();
			mas[i] = rand.nextInt(100);
			if (mas[i] <= 0) {
				System.out.print("�������� ����");
				mas[i] = rand.nextInt(100);
			}
		}
		System.out.println(Arrays.toString(mas) + "������� 4-� ���������");
		return mas;
	}

	public static void square(String args[]) {
		int[] mas = new int[4];
		mas = enter(args);
		double g = Math.pow((Math.pow(mas[0], 2) + Math.pow(mas[1], 2)), 0.5);// ���������� XYg - 3-� ������� ZTg
		double s1 = mas[0] * mas[1] / 2;// ������� �������������� �����.-�� XYg
		double p = (mas[2] + mas[3] + g) / 2;// ������������ ZTg
		// ������� ������
		double s2 = Math.pow((p * (p - mas[2]) * (p - mas[3]) * (p - g)), 0.5);// ������� �������������� �����.-�� ZTg
		double s = s1 + s2;
		System.out.println(String.format("������� XYZT = %.3f", s));

	}
}
