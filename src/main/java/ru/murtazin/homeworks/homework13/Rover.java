package ru.murtazin.homeworks.homework13;

public class Rover implements Transport {
    private final String name = "Вездеход";
    private final double volumeTank = 200;

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public int consumption() {
        return 0;
    }
}
