package fibonacci;

public class Ricle {
    public static void main(String[] args){
        // 随机生成圆上的三个点
        double PI = 3.14159;
        double r = 40.0;
        double a1 = Math.random() * 2;
        double a2 = Math.random() * 2;
        double a3 = Math.random() * 2;
        // 输出三个点的坐标
        System.out.printf("The three coordinate points randomly generated are：\n " +
                        "a1=(%1.2f %1.2f) \n a2=(%1.2f %1.2f) \n a3=(%1.2f %1.2f)\n",
                r*Math.cos(a1), r*Math.sin(a1),
                r*Math.cos(a2), r*Math.sin(a2),
                r*Math.cos(a3), r*Math.sin(a3));
        // 求出各边的距离
        double s1 = Math.sqrt(Math.pow(r*Math.cos(a1) - r*Math.cos(a2), 2) +
                Math.pow(r*Math.sin(a1) - r*Math.sin(a2), 2));
        double s2 = Math.sqrt(Math.pow(r*Math.cos(a1) - r*Math.cos(a3), 2) +
                Math.pow(r*Math.sin(a1) - r*Math.sin(a3), 2));
        double s3 = Math.sqrt(Math.pow(r*Math.cos(a2) - r*Math.cos(a3), 2) +
                Math.pow(r*Math.sin(a2) - r*Math.sin(a3), 2));
        // 带公式
        double A = Math.toDegrees(Math.acos((s1 * s1 - s2 * s2 - s3 * s3) / (-2 * s2 * s3)));
        double B = Math.toDegrees(Math.acos((s2 * s2 - s1 * s1 - s3 * s3) / (-2 * s1 * s3)));
        double C = Math.toDegrees(Math.acos((s3 * s3 - s2 * s2 - s1 * s1) / (-2 * s1 * s2)));
        // 输出角度值
        System.out.printf("The three angle values are：\n A=%1.2f B=%1.2f C=%1.2f", A, B, C);
    }
}
