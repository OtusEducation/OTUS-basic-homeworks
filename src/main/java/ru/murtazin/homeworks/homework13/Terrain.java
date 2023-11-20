package ru.murtazin.homeworks.homework13;

public enum Terrain {
    PEDESTRIAN(1, "Пешеходная зона", false),
    HIGHWAY(2, "Автодорога", false),
    TRACK(3, "Гоночная трасса", true),
    PLAIN(4, "Равнина", false),
    FOREST(5, "Лес", true),
    DENSEFOREST(6, "Густой лес", true),
    SWAMP(7, "Болото", true);

    private int passability;
    private String name;
    private boolean extreme;

    Terrain(int passability, String name, boolean extreme) {
        this.passability = passability;
        this.name = name;
        this.extreme = extreme;
    }

    public int getPassability() {
        return passability;
    }

    public String getName() {
        return name;
    }

    public boolean isExtreme() {
        return extreme;
    }
}
