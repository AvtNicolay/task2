//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

package by.training.tutor2;

import java.util.Scanner;

public class Main43 {
	public static void main(String args[]) {
		calc(args);
	}
	
		@SuppressWarnings("unused")
		public static double enter(String args[]) {
		@SuppressWarnings("resource")
				Scanner scan = new Scanner (System.in);	
				double a;
				String str;
				System.out.print("введите длину грани:  ");
		
			while (!scan.hasNextDouble()) {
				str = scan.nextLine();//считываем данные в строку
				System.out.print("введите длину грани:  ");
						}
				a = scan.nextInt();
				return a;
		}
		
		public static void calc(String args[]) {
		double a=enter(args);
		
		double engCos= Math.cos(Math.PI/3);
		 //System.out.println(String.format("%.1f", engCos));
		double gip = a*engCos;
		double Sq6eng = 0.5*a*gip*6;
		System.out.println(String.format("%.1f", Sq6eng));
		}
}
