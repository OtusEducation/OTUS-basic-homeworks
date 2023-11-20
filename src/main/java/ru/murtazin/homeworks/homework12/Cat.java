package ru.murtazin.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger = true;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }


    public int getAppetite() {
        return appetite;
    }


    public boolean isHunger() {
        return hunger;
    }

    public boolean eaten(Plate plate) {
        if (plate.getCurAmountFood() >= getAppetite()) {
            this.hunger = false;
            return true;
        } else {
            this.hunger = true;
            return false;
        }
    }

    public void info() {
        System.out.println("Имя: " + this.name + "\n" + (this.hunger ? "Кот поел" : "Кот голоден"));
    }
}
