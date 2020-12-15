//7. Сформировать квадратную матрицу порядка N по правилу: A[I,J]=sin((I^2-J^2)/N)
// и подсчитать количество положительных элементов в ней.
package by.training.tutor2;

import java.util.Scanner;

public class Main17 {

	@SuppressWarnings("resource")
	public static void main(String args[]) {

		Scanner enter = new Scanner(System.in);

		int n;

		System.out.print("enter the matrix range n = ");
		while (!enter.hasNextInt())// пока в потоке не int - запрос на ввод!
		{
			System.out.print("enter the matrix range n = ");
			enter.next();// смотрим значение в потоке
		}
		n = enter.nextInt();

		double[][] mas = new double[n][n];

		double I = 0; // (0 - 360гр) -> (0-2Pi)
		double J = 0; // (0 - 360гр) -> (0-2Pi)
		double h = 2 * (Math.PI) / n; // делим 360 град на n частей
		// double A;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == 0 & j == 0) {
					mas[i][j] = 0;
					System.out.print(" " + String.format("%.2f", mas[i][j]));
				} else {
					I = h * i;
					J = h * j;
					double AA;
					AA = (Math.pow(I, 2) - Math.pow(J, 2)) / n;
					mas[i][j] = Math.sin(AA); // A[I,J]=sin((I^2-J^2)/N)

					if (mas[i][j] < 0) {
						System.out.print(String.format("%.2f", mas[i][j]));// вывод с 2-мя знаками после запятой;
					} else {
						System.out.print(" " + String.format("%.2f", mas[i][j]));
					}

				}

			}
			System.out.println();
			System.out.println();
		}
	}
}
