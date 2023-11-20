package ru.murtazin.homeworks.homework13;

public class Car implements Transport {
    private final String name = "Автомобиль";
    private final double volumeTank = 50;

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public int consumption() {
        return 0;
    }
}
