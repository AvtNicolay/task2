//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
package by.training.tutor2;

import java.util.Arrays;

public class Main05 {
	public static void main(String args[]) {
		int[] mas = new int[] { 12, 1, 4, 3, 99, 33, 1, 45, 2, 93};
		sort(mas);
	}
	public static void sort(int[] mas1) {
		System.out.println(Arrays.toString(mas1));
		for (int i=0; i<mas1.length; i++) {
		if (mas1[i]>i) {
			System.out.println("a["+i+"]="+mas1[i]+">["+i+"]");
		}
		}
		
}
}