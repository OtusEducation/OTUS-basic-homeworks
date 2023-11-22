package ru.murtazin.homeworks.homework13;

public class Rover implements Transport {
    private final String name = "Вездеход";
    private final double volumeTank = 200;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean move(int passability) {
        return false;
    }

    @Override
    public int consumption() {
        return 0;
    }

    @Override
    public void info() {

    }
}
