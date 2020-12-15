//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
package by.training.tutor2;

import java.util.Arrays;
import java.util.Random;


public class Main48 {
	public static void main(String args[]) {
		int[] mas = new int[7];
		mas = enter(args);
		System.out.println(Arrays.toString(mas) + "исходный массив");
		finish(mas);	
		}
		
	public static int[] enter(String args[]) {
		int[] mas = new int[7];
		for (int i = 0; i < mas.length; i++) {
			Random rand = new Random();
			mas[i] = rand.nextInt(100);
		}
		//System.out.println(Arrays.toString(mas) + "исходный массив");
		return mas;
	}
	
public static int calculate(int[] mas1, int i1) {

		int sum = 0;
		int i;
	for (i=i1; i<(i1+3); i++){
		sum=sum+mas1[i];
		}
	System.out.println("summa D["+i1+"] - D["+(i1+2)+"] = " +sum);
	return sum;
	}
		
	public static void finish(int[] mas) {
		int i1=1;
		calculate(mas, i1);
		i1 =3;  
		calculate(mas, i1);
		i1 =4;  
		calculate(mas, i1);
		}
}
