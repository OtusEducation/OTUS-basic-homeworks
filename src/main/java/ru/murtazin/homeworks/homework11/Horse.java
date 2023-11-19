package ru.murtazin.homeworks.homework11;

public class Horse extends Animal{
    public Horse(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public double swim(double distance) {
        if (distance > getEndurance() / 4.0) {
            return -1;
        } else {
            return distance / speedSwim;
        }
    }
}
