package zyc.java.code;

import  static java.lang.Math.*; //Math 函数定义在java.lang包中
public class  Mathematics {
    public static void main(String[] args) {
        double x = 4;
        double y = sqrt(x);
        System.out.println(y);

        int a = 2;
        double b = pow(x, a);
        System.out.println(y);

        int c = 30;
        double d1 = toRadians(c); //转化弧度
        double d2 = toDegrees(d1); //转化角度
        double f = sin(d1);
        double g = cos(d1);
        System.out.println(f);
        System.out.println(g);
        System.out.println(d2);

        System.out.println("The square root of \u03C0 is:"+sqrt(PI));
    }
}
