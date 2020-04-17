//
//package mulArrays;
//
//import java.util.Scanner;
//
//public class CNNCalculation {
//	public static void main(String[] args) {
//		// 导入img二维数组、卷积核二维数组；输入步长
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
//        System.out.print("请输入左右步长：");
//        int k1 = input.nextInt();
//        System.out.print("请输入上下步长：");
//        int k2 = input.nextInt();
//        input.close();
//
//        // 计算函数
//        //int[][] show = calculate(img, kernel, k1, k2);
//        
//        // 输出函数
//        //display (show);
//        
//	}
//
//	private static void display(int[][] show) {
//		/*
//		 * 展示函数
//		 */
//		
//	}
//
//	
//	private static void calculate(int[][] img, int[][] kernel,int l,int r) {
//		/*
//		 * 两个矩阵相乘函数
//		 */
//		//定义结果数组的行数和列数
//		int row_res = (img.length-kernel.length)/l+1;
//		int col_res = (img[0].length-kernel[0].length)/l+1;
//		int[][] result = new int[row_res][col_res];
//		
//		//计算卷积
//		//定义rw和cl作为img中小块移动的位置，使用最外层两个for循环找到结果数组的第i、j个元素，内层两个for循环进行卷积
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
