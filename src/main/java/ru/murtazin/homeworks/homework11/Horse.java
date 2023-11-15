package ru.murtazin.homeworks.homework11;

public class Horse extends Animal{
    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void run(float distance) {
        super.run(distance);
    }

    @Override
    public void swim(float distance) {
        if (distance > super.getEndurance() / 4.0) {
            System.out.println(super.getName() + " не сможет преодолеть дистанцию плавания");
        } else {
            System.out.println(super.getName() + " затратил " + distance / super.getSpeedSwim() + " с " +
                    "на преодоление дистанции плавания");
            super.setEndurance(super.getEndurance() - (int) distance * 2);
            System.out.println("Остаток выносливости " + super.getEndurance());
        }
        super.swim(distance);
    }

    @Override
    public void info() {
        super.info();
    }
}
