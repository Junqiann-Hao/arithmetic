package cxydmmszn.chapterOne.two;

import java.util.Stack;

/**
 * @Author hao
 * @Date 2017/11/28 16:24
 * @Description :
 * 一个栈作为压入栈，在压入数据时只往这个栈中压入，记为stackPush；
 * 另一个栈只作为弹出栈，在弹出数据时只从这个栈弹出，记为stackPop。
 * 实现这个有俩个关键点
 * 1．如果stackPush要往stackPop中压入数据，那么必须一次性把stackPush中的数据全部压入。
 * 2．如果stackPop不为空，stackPush绝对不能向stackPop中压入数据。
 */
public class TwoStacksQueue {
    private Stack<Integer> stackPush;//压入数据栈
    private Stack<Integer> stackPop; //弹出数据栈

    public TwoStacksQueue() {
        this.stackPop = new Stack<>();
        this.stackPush = new Stack<>();
    }

    /**
     * 入队操作
     * 直接将数据压入压入数据栈
     * @param push
     */
    public void push(int push) {
        this.stackPush.push(push);
    }


    /**
     * 出队操作
     * @return
     */
    public int poll() throws Exception {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new Exception("队列中没有数据");
        } else if (stackPop.isEmpty()) {
            //弹出数据栈为空，可以将整个压入数据栈中的数据倒入弹出数据栈
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    /**
     * 返回队头元素
     * @return
     * @throws Exception
     */
    public int peek() throws Exception {
        if (stackPush.isEmpty() && stackPop.isEmpty()) {
            throw new Exception("队列中没有数据");
        }else if (stackPop.isEmpty()) {
            //弹出数据栈为空，可以将整个压入数据栈中的数据倒入弹出数据栈
            while (!stackPush.isEmpty()) {
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
