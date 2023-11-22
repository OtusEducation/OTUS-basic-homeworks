package ru.murtazin.homeworks.homework13;

public class Car implements Transport {
    private final String name = "Автомобиль";
    private final double volumeTank = 50;
    @Override
    public String getName() {
        return name;
    }

    public double getVolumeTank() {
        return volumeTank;
    }

    @Override
    public boolean move(int passability) {
        if (passability >= 2 && passability <= 4) {
            System.out.println(this.name + " едет");
            return true;
        } else {
            System.out.println(this.name + " не проедет");
            return false;
        }
    }

    @Override
    public int consumption() {
        return 0;
    }

    @Override
    public void info() {
        System.out.println(this.name);
    }
}
