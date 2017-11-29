package cxydmmszn.chapterOne.three;

import java.util.Stack;

/**
 * @Author hao
 * @Date 2017/11/29 17:33
 * @Description :如何仅用递归函数和栈操作逆序一个栈
 * 一个栈依次压入1、2、3、4、5，那么从栈顶到栈底分别为5、4、3、2、1。
 * 将这个栈转置后，从栈顶到栈底为1、2、3、4、5，也就是实现栈中元素的逆序，
 * 但是只能用递归函数来实现，不能用其他数据结构。
 */
public class Main {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        int p = 0;
        for (; p < 3; p++) {
            integers.push(p);
        }

        ReverseStack.reverse(integers);

        System.out.println(integers);

        Integer andRemoveLastElement = ReverseStack.getAndRemoveLastElement(integers);
        System.out.println(andRemoveLastElement);
    }
}
