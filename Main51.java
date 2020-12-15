//11. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����.
package by.training.tutor2;

import java.util.Scanner;

public class Main51 {
	public static void main(String args[]) {

		Compare(args);
	}

	@SuppressWarnings("resource")
	public static int enter(String args[]) {

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

	public static int Log(int m) {// ��������� ������ �� A&B

		double k = Math.log10(m);
		int z = ((int) k) + 1;// ���-�� �������� �����
		System.out.println("����� ��������: " + z);
		return z;
	}

	public static void Compare(String args[]) {// ��������� ������ �� A&B

		int m = enter(args);
		int n = enter(args);
		int z1 = Log(m);
		int z2 = Log(n);
		if (z1 > z2) {
			System.out.println("numeral[" + m + "] > numeral[" + n + "]");
		} else if (z1 < z2) {
			System.out.println("numeral[" + n + "] > numeral[" + m + "]");
		} else {
			System.out.println("numeral[" + m + "] = numeral[" + n + "]");
		}
	}
}