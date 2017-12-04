package cxydmmszn.chapterOne.four;

/**
 * @Author hao
 * @Date 2017/12/1 11:33
 * @Description : 扩展宠物类加上时间戳作为判断入队顺序的标准
 */
public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return this.pet;
    }

    public long getCount() {
        return this.count;
    }

    public String getEnterPetType() {
        return this.pet.getPetType();
    }
}

