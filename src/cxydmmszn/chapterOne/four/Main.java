package cxydmmszn.chapterOne.four;

/**
 * @Author hao
 * @Date 2017/12/1 11:29
 * @Description :猫狗队列
 */
public class Main {
    public static void main(String[] args) {
        DogCatQueue dogCatQueue = new DogCatQueue();
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Dog());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Cat());
        dogCatQueue.add(new Cat());
        Pet pet = dogCatQueue.pollAll();
        boolean catQueueEmpty = dogCatQueue.isCatQueueEmpty();
        System.out.println(catQueueEmpty);
        boolean dogQueueEmpty = dogCatQueue.isDogQueueEmpty();
        System.out.println(dogQueueEmpty);
        Cat cat = dogCatQueue.pollCat();
        System.out.println(cat);
        Dog dog = dogCatQueue.pollDog();
        System.out.println(dog);
    }
}
