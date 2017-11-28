package cxydmmszn.chapterOne.two;

/**
 * @Author hao
 * @Date 2017/11/28 16:25
 * @Description :
 * 【题目】
 * 编写一个类，用两个栈实现队列，支持队列的基本操作（add、poll、peek）
 */
public class Main {
    public static void main(String[] args) throws Exception {
        TwoStacksQueue twoStacksQueue = new TwoStacksQueue();
        int p = 0;
        for (; p < 100; p++) {
            int i = (int) (Math.random() * 1000);
            twoStacksQueue.push(i);
            System.out.println(i + "入队" );
        }
        for (; p > 1; p--) {
            int pop = twoStacksQueue.poll();
            System.out.println("出队元素:" + pop );
        }
    }
}
