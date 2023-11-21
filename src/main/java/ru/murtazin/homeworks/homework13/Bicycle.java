package ru.murtazin.homeworks.homework13;

public class Bicycle implements Transport {
    private final String name = "Велосипед";

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public int consumption() {
        return 0;
    }

    @Override
    public void test(Terrain terrain) {

    }
}
