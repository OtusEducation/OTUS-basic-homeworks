package ru.murtazin.homeworks.homework13;

public class Horse implements Transport {
    private final String name = "Лошадь";
    private double endurance;

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public int consumption() {
        return 0;
    }
}
