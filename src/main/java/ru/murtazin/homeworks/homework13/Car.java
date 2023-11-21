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

    @Override
    public void test(Terrain terrain) {
        if (terrain.getPassability() >= 2 && terrain.getPassability() <= 4) {
            System.out.println(this.name + " может передвигаться по " + terrain.getName());
        } else {
            System.out.println(this.name + " не может передвигаться по " + terrain.getName());
        }
    }
}
