//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
package by.training.tutor2;

public class Main12 {
	public static void main(String args[]) {

		int[][] mas = new int[][] { { 5, 9, 5, 4, 8, 7 }, { 2, 5, 6, 8, 9, 3 }, { 7, 4, 5, 7, 4, 6 },
				{ 3, 5, 9, 5, 1, 8 }, { 9, 9, 5, 8, 5, 9 }, { 7, 4, 8, 2, 6, 5 } };

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");// ячейка памяти где хранится ссылка на мас.
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			// for (int i=0; i<mas[i].length; i++) {
			System.out.print(mas[i][i] + " ");// ячейка памяти где хранится ссылка на мас.
		}
		System.out.println();
	}

}
