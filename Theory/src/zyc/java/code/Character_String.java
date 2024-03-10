package zyc.java.code;

public class Character_String {
    private static String t;

    public static void main(String[] args) {
        String greeting = "Hello";
        String s = greeting.substring(0, 3); //substring 方法提取字串
        System.out.println(s);
        greeting = greeting.substring(0, 3) + "p!"; //创建新字符
        System.out.println(greeting);

        //C：
        //char* greeting ="Hello";
        //char* temp = malloc(6);
        //strncpy(temp,greeting,3);
        //strncpy(temp +3, "p!",3)
        //greeting =temp;

        String all = String.join("/","s","m","l","xl"); //静态join方法 界定符分隔
        System.out.println(all);

        String repeated = "java".repeat(3); //repeat方法 重复打印字符串
        System.out.println(repeated);

        boolean b1 = s.equals(t); //equals方法 检测字符串是否相等（区分大小写）  private static String t;
        System.out.println(b1);

        boolean b2 = "Hello".equalsIgnoreCase("hello"); //equalsIgnoreCase方法 检测字符串是否相等（不区分大小写）
        System.out.println(b2);

        String  string = "hello";
        int n = string.length(); //length方法 给定代码单元个数
        int cpCount = string.codePointCount(0,string.length()); //codePointCount方法 码点个数
        char first = string.charAt(0); //调用s.charAt(n) 返回代码位置为n的代码单元
        char last = string.charAt(4); //n介于 [0,s.length()-1]
        System.out.println(n);
        System.out.println(cpCount);
        System.out.println(first);
        System.out.println(last);

        StringBuilder builder = new StringBuilder(); //StringBuilder类 构建空的字符串构建器
        builder.append("ch"); //append方法 添加字符碎片
        builder.append("str");
        String completedString = builder.toString(); //toString方法 包含添加的所有内容
        System.out.println(completedString);

        //文本块
        String string1 = """
                hello
                world
                """;
        System.out.println(string1);

        String string2 = """
                Hello,my name is hal.\
                please enter your name:
                """;
        System.out.println(string2); //  '\' 连接上一行和下一行
    }
}
