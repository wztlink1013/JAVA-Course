package fibonacci;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        // ��������n
        System.out.println("Please enter an integer greater than 3��");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // ��������
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        // ����쳲��������ƹ�ʽ���㣻ͬʱ�ж����쳲�����ֵ
        for (int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
            if (i>n-2){
                System.out.println("Fibonacci value��" + arr[i]);
            }
            
        }
    }
}