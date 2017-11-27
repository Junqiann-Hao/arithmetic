package javatest;

/**
 * @Author hao
 * @Date 2017/11/16 16:45
 * @Description :如下Java语句 double x=2.0; int y=4; x/=++y; 执行后，x的值是（）
 */
public class test1 {
    public static void main(String[] args) {
        double x = 2.0;
        int y = 4;
        x /= ++y;
        System.out.println(x);
    }
}
