//3. ��� ������ �������������� �����, ����������� �������� N. 
//����������, ������� � ��� �������������, ������������� � ������� ���������.
package by.training.tutor2;

public class Main03 {
	public static void main(String args[]) {
		double [] mas = new double [] {-27.3, 17.2, 0, 99, 37.4, -46.2, 0, 78.9};
		System.out.println("����� ��������� �������" + mas.length);
	resultZero(mas);
	resultPlus(mas);
	resultMinus(mas);
	}
		public static void resultZero(double mas[]) {
			int a=0;
		for (int i=0; i<mas.length; i++) {
			if (mas[i]==0) a++;
		} 
		System.out.println("����� ����� - " + a);
		}
		
		public static void resultPlus(double mas[]) {
			int b=0;
			for (int i=0; i<mas.length; i++) {
				if (mas[i]>0) b++;
			} 
			System.out.println("����� ������������� ����� - " + b);
		}
		
		public static void resultMinus(double mas[]) {
		int c=0;
		for (int i=0; i<mas.length; i++) {
			if (mas[i]<0) c=c+1;
			}
	System.out.println("����� ������������� ����� - " + c);
	}

}