package ru.murtazin.homeworks.homework12;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Snowball1", 20, true),
                new Cat("Snowball2", 20, true)};
        for (Cat cat : cats) {
            cat.info();
        }
    }
}
