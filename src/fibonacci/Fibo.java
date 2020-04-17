package fibonacci;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        // 输入整数n
        System.out.println("Please enter an integer greater than 3：");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // 构造数组
        int[] arr = new int[n];
        arr[0] = arr[1] = 1;
        // 进行斐波那契地推公式求算；同时判断输出斐波那契值
        for (int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2];
            if (i>n-2){
                System.out.println("Fibonacci value：" + arr[i]);
            }
            
        }
    }
}