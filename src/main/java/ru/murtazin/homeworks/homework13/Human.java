package ru.murtazin.homeworks.homework13;

public class Human {

    public void move(Transport transport) {
        System.out.println("Передвижение на " + transport.getName());
    }

    public void move() {
        System.out.println("Передвижение пешком");
    }
}
