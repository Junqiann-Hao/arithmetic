package cxydmmszn.chapterOne.one;

import java.util.Stack;

/**
 * @Author hao
 * @Date 2017/11/27 14:29
 * @Description :
 * 第一种设计方案如下。
 * ●　压入数据规则
 * 假设当前数据为newNum，先将其压入stackData。然后判断stackMin是否为空。
 * 如果为空，则newNum也压入stackMin；如果不为空，则比较newNum和stackMin的栈顶元素中哪一个更小：
 * 如果newNum更小或两者相等，则newNum也压入stackMin；如果stackMin中栈顶元素小，则把stackMin的栈顶元素重复压入stackMin，即在栈顶元素上再压入一个栈顶元素。
 * ●　弹出数据规则
 * 在stackData中弹出数据，弹出的数据记为value；弹出stackMin中的栈顶；返回value。
 * 很明显可以看出，压入与弹出规则是对应的
 * ●　查询当前栈中的最小值操作
 * 由上文的压入数据规则和弹出数据规则可知，stackMin始终记录着stackData中的最小值，所以stackMin的栈顶元素始终是当前stackData中的最小值。
 *
 *
 */
public class Mystack1 implements Mystack{
    private Stack<Integer> stackData;//存储数据的栈与正常栈功能相同
    private Stack<Integer> stackMin;//保存每一步的最小值

    public Mystack1() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    /**
     * 压栈操作
     *
     * @param newNum
     */
    public void push(int newNum) {
        if (this.stackMin.isEmpty()) {
            //最小值的栈是空的直接压入
            this.stackMin.push(newNum);
        } else if (newNum <= stackMin.peek()) {
            //插入元素小于等于当前栈顶元素,也压入栈中
            this.stackMin.push(newNum);
        }
        //数据压入数据栈
        this.stackData.push(newNum);
    }

    /**
     * 弹栈操作
     *
     * @return
     * @throws Exception
     */
    public int pop() throws Exception {
        //栈空报错
        if (this.stackData.isEmpty()) {
            throw new Exception("栈空，无数据返回");
        }
        int pop = this.stackData.pop();
        //如果弹栈元素大小等于最小值栈顶元素，同时从最小值栈中弹出
        if (pop == this.stackMin.peek()) {
            this.stackMin.pop();
        }
        return pop;
    }

    /**
     * 返回栈中最小的元素的值
     *
     * @return
     * @throws Exception
     */
    public int getMin() throws Exception {
        if (this.stackMin.isEmpty()) {
            //最小值栈空报错
            throw new Exception("栈空");
        }
        return this.stackMin.peek();
    }
}
