package ru.murtazin.homeworks.homework11;

public class Horse extends Animal{
    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void swim(float distance) {
        if (distance > this.endurance / 4.0) {
            System.out.println(this.name + " не сможет преодолеть дистанцию плавания");
        } else {
            System.out.println(this.name + " затратил " + distance / super.getSpeedSwim() + " с " +
                    "на преодоление дистанции плавания");
            super.setEndurance(this.endurance - (int) distance * 2);
            System.out.println("Остаток выносливости " + this.endurance);
        }
    }
}
