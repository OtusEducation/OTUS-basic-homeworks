package ru.murtazin.homeworks.homework13;

public class Human {
    private String meansOfTransport;

    public void move (Transport transport) {
        if (transport == null) {
            System.out.println("Передвижение пешком");
        } else {
            System.out.println("Передвижение на " + transport.toString());
        }
    }
}
