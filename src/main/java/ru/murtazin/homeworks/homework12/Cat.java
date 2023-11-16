package ru.murtazin.homeworks.homework12;

public class Cat {
    private String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = hunger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public String hunger() {
        if (isHunger()) {
            return "Кот голоден";
        } else {
            return "Кот сыт";
        }
    }

    public void eaten(int food) {
        if (food > getAppetite()) {
            System.out.println("Кот поел");
            setHunger(false);
        } else {
            System.out.println("Не хватило еды");
            setHunger(true);
        }
    }

    public void info() {
        System.out.println("Имя: " + name + "\n" + hunger());
    }
}
