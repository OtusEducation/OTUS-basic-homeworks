package ru.murtazin.homeworks.homework14;

public class AppArraySizeException extends Exception{
    String msg;

    public AppArraySizeException(String msg) {
        super(msg);
    }
}
