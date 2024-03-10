package zyc.java.code;

import static java.lang.Math.*;
public class Operation {
    public static void main(String[] args) {
        double x = 9.9997;
        int nx = (int) x; //丢失数据
        System.out.println(nx);

        int ny = (int) round(x); //round 返回值为long型
        System.out.println(ny);

        int a = 1;
        int b = 2;
        int c = 3;
        int d = a += b += c; //+=是右结合运算符 a+=（b+=c）
        System.out.println(d);



    }
}
