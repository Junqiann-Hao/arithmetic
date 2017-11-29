package cxydmmszn.chapterOne.three;

import java.util.Stack;

/**
 * @Author hao
 * @Date 2017/11/29 17:31
 * @Description :使用俩个递归函数，一个是返回栈底元素，一个通过第一个函数实现栈的逆向
 *
 */
public class ReverseStack {

    /**
     * 将栈的栈底元素出栈返回
     * @param stack
     * @param <T>
     * @return
     */
    public static <T> T getAndRemoveLastElement(Stack<T> stack) {
        //讲一个值弹出栈
        T result = stack.pop();
        //栈空返回栈底元素
        if (stack.isEmpty()) {
            return result;
        } else {
            //在递归调用的过程中栈底元素始终保持在last里
            T last = getAndRemoveLastElement(stack);
            //调用返回，将非栈底元素重新压入栈中
            stack.push(result);
            return last;
        }
    }

    /**
     * 将栈逆序
     * @param stack
     * @param <T>
     */
    public static <T> void reverse(Stack<T> stack) {
        //递归调用的返回条件
        if (stack.isEmpty()) {
            return;
        }
        //返回栈中最后一个值
        T andRemoveLastElement = getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(andRemoveLastElement);
    }
}
