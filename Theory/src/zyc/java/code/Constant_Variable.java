package zyc.java.code;

public class Constant_Variable {
    //final 只能被赋值一次
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
            + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/*
//类常量（其他类均可使用） Constant_Variable.CM_PER_INCH
public class Constant_Variable {
    public static final double CM_PER_INCH=2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters:"
            + paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);

    }
}
*/

