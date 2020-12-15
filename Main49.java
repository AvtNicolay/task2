//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
//Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;

public class Main49 {
	public static void main(String args[]) {
		System.out.println("Даны числа X, Y, Z, Т и угол X, Y=90 гр. н-ти площать 4-хугольника");
		square(args);

	}

	public static int[] enter(String args[]) {
		int[] mas = new int[4];
		for (int i = 0; i < mas.length; i++) {
			Random rand = new Random();
			mas[i] = rand.nextInt(100);
			if (mas[i] <= 0) {
				System.out.print("неверный ввод");
				mas[i] = rand.nextInt(100);
			}
		}
		System.out.println(Arrays.toString(mas) + "стороны 4-х угольника");
		return mas;
	}

	public static void square(String args[]) {
		int[] mas = new int[4];
		mas = enter(args);
		double g = Math.pow((Math.pow(mas[0], 2) + Math.pow(mas[1], 2)), 0.5);// гипотенуза XYg - 3-я сторона ZTg
		double s1 = mas[0] * mas[1] / 2;// площадь прямлугольного треуг.-ка XYg
		double p = (mas[2] + mas[3] + g) / 2;// полупериметр ZTg
		// формула Герона
		double s2 = Math.pow((p * (p - mas[2]) * (p - mas[3]) * (p - g)), 0.5);// площадь прямлугольного треуг.-ка ZTg
		double s = s1 + s2;
		System.out.println(String.format("площадь XYZT = %.3f", s));

	}
}
