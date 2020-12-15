//4. Даны действительные числа а1 ,а2 ,..., аn .
//Поменять местами наибольший и наименьший элементы.
package by.training.tutor2;

import java.util.Arrays;

public class Main04 {
	public static void main(String args[]) {
		int[] mas = new int[] { 12, 17, 4, 3, 99, 33, 1, 45, 2, 93};
		
		sort(mas);
	}

		public static void sort(int[] mas1) {
		System.out.println(Arrays.toString(mas1));
		int min=mas1[0]; 
		int minId=0; 
		
		int max=mas1[0]; 
		int maxId=0; 
		
		for (int i=0; i<mas1.length; i++) {
	if (mas1[i] < min) {
		min = mas1[i]; 
		minId=i;}
	
	if (mas1[i] > max) {
		max = mas1[i]; 
		maxId=i;}
		}
		System.out.println("!!Min - mas[" + minId + "]= " + min);
		System.out.println("!!Max - mas[" + maxId + "]= " + max);
		System.out.println();
	
	mas1[minId]=max;
	mas1[maxId]=min;
	System.out.println(Arrays.toString(mas1));
	System.out.println("!!Min - mas[" + minId + "]= " + min);
	System.out.println("!!Max - mas[" + maxId + "]= " + max);
	}
}
