//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.
package by.training.tutor2;

import java.util.Arrays;

public class main091 {
	public static void main(String args[]) {
		int[] mas = new int[] {1, 2, 3, 0, 4, 2, 5, 3, 6, 0, 7, 3, 8, 3, 9, 0, 3, 2, 2, 2}; 
		System.out.println(Arrays.toString(mas));
		find(mas);
	}


public static void find(int mas1[]) {
	int Count=0;//число повторов
	int MaxCount=0;//макс. число повторов
	int num=0; //текущее значение mas1[i]
	int Maxnum=0;	
	
	for (int i=0; i<mas1.length; i++) {
		
		Count=1;
		num=mas1[i];
		
		for (int j=i+1; j<mas1.length; j++)
		if (num==mas1[j]) {
		Count++;
		}
		 
		if (MaxCount<Count){
		 MaxCount=Count; Maxnum=num;}
		
		if (MaxCount==Count){
			 MaxCount=Count;  
		if (Maxnum>num) {Maxnum=num;}
			
		}
	}

	System.out.println(Arrays.toString(mas1));
	System.out.println("искомое число  = "+Maxnum);
	System.out.println("число повторов = "+MaxCount);
	
	} 
}

