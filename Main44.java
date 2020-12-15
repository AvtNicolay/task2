//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, 
//между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
package by.training.tutor2;

//import java.util.Arrays;
import java.util.Scanner;

public class Main44 {
	public static void main(String args[]) {
		section(args);

	}

	public static int enter(String args[]) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print("неверный ввод");

		}
		a = sc.nextInt();
		// System.out.println("a="+a);

		return a;
	}

	public static int[][] enter1(String args[]) {
		int n;
		System.out.print("Введите количество точек: ");
		n = enter(args);

		int[][] point = new int[n][3];

		System.out.println("Введите координаты точек");
		for (int i = 0; i < n; i++) {
			point[i][0] = i;
			System.out.print("[" + i + "] X=");
			point[i][1] = enter(args);
			System.out.print("[" + i + "] Y=");
			point[i][2] = enter(args);
		}

		System.out.println("   №   X   Y");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%4d", point[i][j]);
			}
			System.out.println();
		}

		return point;
	}

	public static void section(String args[]) {
		int[][] point = new int[1][3];
		point = enter1(args);

		double Sec1 = 1.0;
		double MaxLength = 0;
		int Maxi=-1;
		int Maxj=-1;
		for (int i = 0; i < point.length; i++) {
			int j = i + 1;
			for (j = 1; j < point.length; j++) {
				//расчет длины отрезка - A(a1,a2), B(b1,b2) AB=корень((a1-b1)^2+(a2-b2)^2);
				Sec1 = Math.pow((Math.pow((point[i][1] - point[j][1]), 2) + (Math.pow((point[i][2] - point[j][2]), 2))),0.5);
				//System.out.println(point[i][0] + " " + point[i][1] + " " + point[i][2] + " / " + point[j][0] + " "
				//		+ point[j][1] + " " + point[j][2] + " / " + (String.format("%.3f", Sec1)));
				if (MaxLength<Sec1) {MaxLength =Sec1; Maxi=i; Maxj=j;}   
			}
		}
System.out.println("MaxLength ["+Maxi+"]["+Maxj+"] ="+(String.format("%.3f", MaxLength)));
	}
}
