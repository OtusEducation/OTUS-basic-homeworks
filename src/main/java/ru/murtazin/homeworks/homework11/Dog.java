package ru.murtazin.homeworks.homework11;

public class Dog extends Animal {
    public Dog(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }


    @Override
    public void swim(float distance) {
        if (distance > this.endurance / 2.0) {
            System.out.println(this.name + " не сможет преодолеть дистанцию плавания");
        } else {
            System.out.println(this.name + " затратил " + distance / super.getSpeedSwim() + " с " +
                    "на преодоление дистанции плавания");
            super.setEndurance(this.endurance - (int) distance * 2);
            System.out.println("Остаток выносливости " + this.endurance);
        }
    }
}
