package cxydmmszn.chapterOne.one;

/**
 * @Author hao
 * @Date 2017/11/27 14:20
 * @Description :
 * 设计一个有getMin功能的栈
 * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。
 * 【要求】
 * 1.pop、push、getMin操作的时间复杂度都是O (1)。
 * 2．设计的栈类型可以使用现成的栈结构。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Mystack1 mystack1 = new Mystack1();
        Mystack2 mystack2 = new Mystack2();
        System.out.println("第一种实现测试");
        long l = System.currentTimeMillis();
        main.run(mystack1);
        long l1 = System.currentTimeMillis();
        System.out.println("第二种实现测试,第一种算法用时"+(l1-l));
        main.run(mystack2);
        long l2 = System.currentTimeMillis();
        System.out.println("第二种算法用时"+(l2-l1));

    }

    public void run(Mystack mystack) throws Exception {
        int min = 0;
        int p = 0;
        for (; p < 10000000; p++) {
            int i = (int) (Math.random() * 1000);
            mystack.push(i);
            min = mystack.getMin();
//            System.out.println(i + "入栈" + "栈中最小元素：" + min);
        }
        for (; p > 1; p--) {
            int pop = mystack.pop();
            min = mystack.getMin();
//            System.out.println("出栈元素:" + pop + "栈中最小元素：" + min);
        }
    }

}
