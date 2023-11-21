package ru.murtazin.homeworks.homework13;

public class Horse implements Transport {
    private final String name = "Лошадь";
    private double endurance;

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

    }
}
