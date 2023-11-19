package ru.murtazin.homeworks.homework14;

public class AppArrayDataException extends NumberFormatException{
    String msg;
    int line;
    int column;

    public AppArrayDataException(String msg, int line, int column) {
        super(msg);
        this.line = line;
        this.column = column;
    }
}
