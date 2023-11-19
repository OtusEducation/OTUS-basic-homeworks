package ru.murtazin.homeworks.homework11;

public class Dog extends Animal {
    public Dog(String name, double speedRun, double speedSwim, double endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public double swim(double distance) {
        if (distance > getEndurance() / 2.0) {
            return -1;
        } else {
            return distance / speedSwim;
        }
    }
}
