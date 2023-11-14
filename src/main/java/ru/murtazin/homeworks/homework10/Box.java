package ru.murtazin.homeworks.homework10;

import java.util.Objects;

public class Box {
    private String content;
    private String color;
    private final double length;
    private final double width;
    private final double height;
    private boolean coverPosition;
    private boolean isEmpty;

    public Box(String color, double length, double width, double height, boolean coverPosition, boolean isEmpty) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.coverPosition = coverPosition;
        this.isEmpty = isEmpty;
    }

    public String getInfo() {
        return "Цвет: " + getColor() + "\n" +
                "Размеры Д x Ш x В: " + getLength() + " x " + getWidth() + " x " + getHeight() + "\n" +
                "Содержимое: " + getContent() + "\n" +
                "Положение крышки: " + getCoverPosition() + "\n";
    }

    public String getContent() {
        return Objects.requireNonNullElse(this.content, "пустая");
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getLength() {
        return length;
    }


    public double getWidth() {
        return width;
    }


    public double getHeight() {
        return height;
    }

    public String getCoverPosition() {
        if (this.coverPosition) {
            return "открыта";
        } else {
            return "закрыта";
        }
    }

    public void setCoverPosition(boolean coverPosition) {
        this.coverPosition = coverPosition;
    }

    public void setEmpty(boolean empty) {
        this.isEmpty = empty;
    }

}
