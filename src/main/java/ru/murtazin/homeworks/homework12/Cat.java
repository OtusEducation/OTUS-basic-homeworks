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

    public boolean eaten(Plate plate) {
        if (!this.hunger) {
            System.out.println(this.name + " уже поел");
            return false;
        } else {
            if (plate.getCurAmountFood() >= this.appetite) {
                plate.setCurAmountFood(plate.getCurAmountFood() - this.appetite);
                System.out.println(this.name + " покушал");
                this.hunger = false;
                return true;
            } else {
                System.out.println(this.name + " не хватило еды");
                return false;
            }
        }
    }

    public void info() {
        System.out.println("Имя: " + this.name + "\n" + (this.hunger ? "Кот голоден" : "Кот поел"));
    }
}
