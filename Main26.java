package by.training.tutor2;
import java.util.Scanner;

public class Main26 {
   public static void main(String[] args) {
       @SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
       System.out.println("������� ����������� �������: ");
       int n = scanner.nextInt();

       if(n%2!=0) {
           System.out.println("\"���������� �������\" \n�� ��������� ���������� ���������:");
           oddMagicSquare(n);
       }
       else if(n%4==0) {
           System.out.println("\"���������� �������\" \n�� ������� ���������� ���������, �������� 4:");
           evenMatrixSquare(n);
       }
       else if ((n==0)||(n==2)||(n%4!=0)) System.out.println("��� �������, � ������������ " + n+" ������ ���������" +
               "\n�� ����� ��������� \"���������� �������\". " +
               "\n\n���������� ������������� ��������� � �������������� ������ �����������." +
               "\n���������� �� ���������.");

   }
   
//evenMatrixSquare - ������ ����� ������������ ��� ���������� "����������� ��������" �������� 4

   
//�������� �������������� � ������ ������ �������� ����-������

   
//������ �� ��������: http://www.klassikpoez.narod.ru/metody.htm

   public static void evenMatrixSquare(int n){
       int[][] matrix = standardMatrixFilling(n);
       
// ������������ ��������� ������� ���������

       int count = 0;
       for (int i = 0; i < matrix.length/2; i++) {
           int transition;
           if(i<matrix.length/2) {
               transition = matrix[i][i];
               matrix[i][i] = matrix[matrix.length-1-count][matrix.length-1-count];
               matrix[matrix.length-1-count][matrix.length-1-count] = transition;
               count++;
           }
       }
       
// ������������ ��������� �������� ���������

       count = 0;
       for (int i = 0; i <matrix.length/2 ; i++) {
           int transition;
           if(i<matrix.length/2){
               transition = matrix[matrix.length - 1 -count][i];
               matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length-1-count];
               matrix[i][matrix.length-1-count] = transition;
               count++;
           }
       }
       printMatrix(matrix);
   }
   
//oddMatrixSquare - ������ ����� ������������ ��� ���������� "����������� ��������" �� ��������� ����������� ���������

   
//�������� �������������� � ������ ������ ���������� "�������� �������"

   public static void oddMagicSquare(int n) {
       int[][] matrix = new int[n][n];
       int x = n/2;
       int y = matrix.length-1;
       int count = 1;

       while (true){
           matrix[(matrix.length-1)-y][x] = count;
           count++;

           if(x==matrix.length-1) x=-1;
           if(y>=matrix.length-1) y=-1;
           y++;
           x++;
           if (matrix[matrix.length-1-y][x] != 0) y--;

           int count1=0;
           for (int[] array:matrix) {
               for (int z :array) {
                   if(z == 0) count1++;
               }
           }
           if (count1==0) break;
       }

       printMatrix(matrix);
   }
   
//� ����� evenMatrixSquare ����� ������������ ��������������� �������,

   
//������ ���� ���������� ����� standardMatrixFilling (������ ������� ��� � ����� ����������� � ���������� ��� �����)

   public static int[][] standardMatrixFilling(int n){
       int[][] matrix = new int[n][n];
       int count = 1;

       for (int i = 0; i > matrix.length; i++) {
           for (int j = 0; j < matrix.length; j++) { 
               matrix[i][j] = count;
               count++;
           }
       }
       return  matrix;
   }
   
//����� printMatrix �������� �� ����� ������� �� �����

   public static void printMatrix (int matrix[][]) {
       for (int[] array : matrix) {
           for (int x : array) {
               System.out.print(x + "\t");
           }
           System.out.println();
       }
       System.out.println("");
   }
}