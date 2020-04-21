//
//package mulArrays;
//
//import java.util.Scanner;
//
//public class CNNCalculation {
//	public static void main(String[] args) {
//		// 
//		int[][] img = {
//				{3,0,1,5,0,3,0,3},
//				{2,6,2,4,3,0,3,0},
//				{2,4,1,0,6,1,4,1},
//				{3,0,1,5,0,3,0,2},
//				{2,6,2,4,3,2,3,0},
//				{2,4,1,0,6,2,1,1},
//				{2,6,2,4,4,0,3,6},
//				{2,4,1,0,6,1,6,1}
//				};
//		int[][] kernel = {{-1,0,1},{-2,0,2},{-1,0,1}};
//		Scanner input = new Scanner(System.in);
//        System.out.print("���������Ҳ�����");
//        int k1 = input.nextInt();
//        System.out.print("���������²�����");
//        int k2 = input.nextInt();
//        input.close();
//
//        // 
//        //int[][] show = calculate(img, kernel, k1, k2);
//        
//        // 
//        //display (show);
//        
//	}
//
//	private static void display(int[][] show) {
//		/*
//		 * չʾ����
//		 */
//		
//	}
//
//	
//	private static void calculate(int[][] img, int[][] kernel,int l,int r) {
//		/*
//		 * ����������˺���
//		 */
//		//���������������������
//		int row_res = (img.length-kernel.length)/l+1;
//		int col_res = (img[0].length-kernel[0].length)/l+1;
//		int[][] result = new int[row_res][col_res];
//		
//		//������
//		//����rw��cl��Ϊimg��С���ƶ���λ�ã�ʹ�����������forѭ���ҵ��������ĵ�i��j��Ԫ�أ��ڲ�����forѭ�����о��
//		int rw=0;
//		for(int i = 0; i < row_res;i++) {
//			int cl=0;
//			for(int j = 0;j < col_res;j++) {
//				for(int i1 = 0;i1 < kernel.length;i1++) {
//					for(int j1 = 0;j1<kernel[0].length;j1++) {
//						result[i][j] += img[i1+rw][j1+cl]*kernel[i1][j1];
//					}
//				}
//				System.out.print(result[i][j]+" ");
//				cl+=l;
//			}
//			System.out.println(" ");
//			rw+=l;
//		}
//
//	}
//	
//
//}
//
