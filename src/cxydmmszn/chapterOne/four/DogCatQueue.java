package cxydmmszn.chapterOne.four;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author hao
 * @Date 2017/12/1 11:35
 * @Description :猫狗队列的具体实现
 */
public class DogCatQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public DogCatQueue() {
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.catQ = new LinkedList<PetEnterQueue>();
        this.count = 0;//计数器
    }

    /**
     * 添加操作
     * @param pet
     */
    public void add(Pet pet) {
        if (pet.getPetType().equals("dog")) {
            this.dogQ.add(new PetEnterQueue(pet, this.count++));
        } else if (pet.getPetType().equals("cat")) {
            this.catQ.add(new PetEnterQueue(pet, this.count++));
        } else {
            throw new RuntimeException("添加的既不是猫也不是狗");
        }
    }

    /**
     * 返回队头对象
     * @return
     */
    public Pet pollAll() {
        if (! this.dogQ.isEmpty() && ! this.catQ.isEmpty()) {
            if(this.dogQ.peek().getCount()  <  this.catQ.peek().getCount()) {
                return this.dogQ.poll().getPet();
            } else {
                return this.catQ.poll().getPet();


            }
        } else if (! this.dogQ.isEmpty()) {
            return this.dogQ.poll().getPet();
        } else if (! this.catQ.isEmpty()) {
            return this.catQ.poll().getPet();
        } else {
            throw new RuntimeException("队列是空的");
        }
    }

    /**
     * 返回队头的狗
     * @return
     */
    public Dog pollDog() {
        if (! this.isDogQueueEmpty()) {
            return (Dog) this.dogQ.poll().getPet();
        } else {
            throw new RuntimeException("狗队列为空");
        }
    }

    public Cat pollCat() {
        if (! this.isCatQueueEmpty()) {
            return (Cat) this.catQ.poll().getPet();
        } else
            throw new RuntimeException("猫队列为空");
    }

    public boolean isEmpty() {
        return this.dogQ.isEmpty() && this.catQ.isEmpty();
    }

    public boolean isDogQueueEmpty() {
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty() {
        return this.catQ.isEmpty();
    }
}
