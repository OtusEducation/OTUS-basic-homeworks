package ru.murtazin.homeworks.homework11;


public class Cat extends Animal {
    public Cat(String name, int speedRun, int speedSwim, int endurance) {
        super(name, speedRun, speedSwim, endurance);
    }

    @Override
    public void swim(float distance) {
        System.out.println("Кот не умеет плавать");
    }
}
