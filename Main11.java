//1. ���� �������. ������� �� ����� ��� �������� �������, � ������� ������ ������� ������ ����������.
package by.training.tutor2;

public class Main11 {
public static void main(String args[]) {
	
	int[][] mas = new int[][] {{8, 9, 5, 4, 8, 7}, {2, 4, 6, 8, 9, 3}, {7, 4, 3, 7, 4, 6}, {3, 5, 9, 3, 1, 8}, {9, 9, 5, 8, 2, 9}, {7, 4, 8, 2, 6, 3}};
	System.out.println(mas);//������ ������ ��� �������� ������ �� ���. 
	System.out.println(mas[4][4]);//�������� � ������ ������ �4 ������� 4 (���� 0-4).
	for (int i=0; i<mas.length; i++) {
		for (int j=0; j<mas[i].length; j++) {
			System.out.print(mas[i][j]+" ");//������ ������ ��� �������� ������ �� ���.
		}
		System.out.println();
	}

	System.out.println("������� ������ ������");
	
	for (int i=0; i<mas.length; i++) {
		for (int j=0; j<mas[i].length; j++) {
			if (j%2==0)
			System.out.print(mas[i][j+1]+" ");
		}
		System.out.println();
	}

System.out.println("������� �������� ������ ��� ������ ��.������� ������ ���������");
	for (int i=0; i<mas.length; i++) {
		for (int j=0; j<mas[i].length; j++) {
			if (j%2==0 & mas[mas.length-1][j]<mas[0][j])
			
			System.out.print(mas[i][j]+" ");
			}
		System.out.println();
		}
	}
}

