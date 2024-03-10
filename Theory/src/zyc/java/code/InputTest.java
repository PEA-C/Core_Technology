package zyc.java.code;

import javax.xml.xpath.XPath;
import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.*;  //Scanner类在java.util包中定义
public class InputTest {
    public static void main(String[] args) throws IOException { //可能出现异常 使用throws IOException 标记main方法
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine(); //nextLine方法 读取一行输入
        System.out.println("How old are you?");
        int age = in.nextInt(); //nextInt方法 读取一个整数 （nextDouble 读取浮点数）
        System.out.println("name: "+name);
        System.out.println("age: "+age);

/*     //无法获取控制台
        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password:");
        System.out.println(username);
        System.out.println(passwd);
 */

      //格式化输出
      double x = 10000.0 / 3.0;
      System.out.print(x); //x类型所允许的最大非0位数打印x
      System.out.println();
      System.out.printf("%,8.2f\n",x); //%,2f ','为分组分隔符
      System.out.printf("%8.2e",x);

        //  文件输入和输出
        //Scanner in1 = new Scanner(Path.of("myfile.txt"), StandardCharsets.UTF_8);
        //PrintWriter out = new Pr intWriter("myfile.txt", StandardCharsets.UTF_8);
    }
}





