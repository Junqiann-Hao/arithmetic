package cxydmmszn.chapterOne.five;

import java.util.Stack;

/**
 * @Author hao
 * @Date 2017/12/4 17:23
 * @Description :用一个栈实现另一个栈的排序
 * 一个栈中元素的类型为整型，现在想将该栈从顶到底按从大到小的顺序排序，只许申请一个栈。
 * 除此之外，可以申请新的变量，但不能申请额外的数据结构。如何完成排序？
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        for (int p = 0; p < 5; p++) {
            int i = (int) (Math.random() * 1000);
            integers.push(i);
            System.out.println(i + "入队" );
        }

        sortStackByStack(integers);
        System.out.println(integers);
        Integer peek = integers.peek();
        System.out.println(peek);

    }
    public static void sortStackByStack(Stack<Integer> stack) {
        //用于帮助排序的栈
        Stack<Integer> help = new Stack<Integer>();
        System.out.println(stack);
        while (! stack.isEmpty()) {
            //弹出一个元素
            int cur = stack.pop();
            //在帮助栈不为空并且弹出的元素小于帮助栈栈顶的元素就将帮助栈栈顶的元素压会元素数据栈
            while (! help.isEmpty() && help.peek() > cur) {
                stack.push(help.pop());
            }
            //将弹出的元素放到帮助栈中
            help.push(cur);
        }
        //现在的元素全部在帮助栈中从栈顶到栈底从大到小排列
        System.out.println(help);
        //将帮助栈的元素倒出到原数据栈
        while (! help.isEmpty()) {
            stack.push(help.pop());
        }
    }
}
