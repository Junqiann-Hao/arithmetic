package cxydmmszn.chapterOne.one;

/**
 * @Author hao
 * @Date 2017/11/27 16:36
 * @Description :为了测试时方便写个接口
 */
public interface Mystack {
    void push(int newNum);

    public int pop() throws Exception;

    public int getMin() throws Exception;
}
