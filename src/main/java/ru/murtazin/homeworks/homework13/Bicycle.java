package ru.murtazin.homeworks.homework13;

public class Bicycle implements Transport {
    private final String name = "Велосипед";

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
