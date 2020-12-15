//13. ��� ������� ����� ���������� �����������, ���� ��� ���������� 
//���� �� ����� �� 2 (��������, 41 � 43). ����� � ���������� ��� ���� ���������� �� ������� [n,2n], 
//��� n - �������� ����������� ����� ������ 2. ��� ������� ������ ������������ ������������.
package by.training.tutor2;

import java.util.Scanner;

public class Main53 {
	public static void main(String args[]) {
		find(args);
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {

		Scanner ent = new Scanner(System.in);
		System.out.print("Enter number =");

		int n = 0;

		while (!ent.hasNextInt()) {
			System.out.println("incorrect input");
			System.out.print("Enter number =");
			ent.next();
		}

		n = ent.nextInt();
		return n;
	}

	public static int enter1(String args[]) {
		int n = enter(args);
		if (n < 3) {
			System.out.println("incorrect input");
			n = enter(args);
		}
		System.out.println("n= " + n + ", 2n= " + 2 * n);
		return n;
	}

	public static void find(String args[]) {

		int n = enter1(args);
		int b = 0;
		while (b < 2 * n - 1) {
			for (int i = n; i < 2 * n - 1; i++) {
				int a = i;
				b = i + 2;
				System.out.print("[" + a + "], [" + b + "]; ");
				if ((i - n) % 10 == 0)
					System.out.println();
			}
		}
	}
}