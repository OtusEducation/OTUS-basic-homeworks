package ru.murtazin.homeworks.homework11;

public abstract class Animal {
    public String name;
    public int speedRun;
    public int speedSwim;
    public int endurance;

    public Animal(String name, int speedRun, int speedSwim, int endurance) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.endurance = endurance;
    }

    public void run(float distance) {
        if (distance > this.endurance) {
            System.out.println(name + " не сможет преодолеть дистанцию бега");
        } else {
            System.out.println(name + " затратил " + distance / speedRun + " с на преодоление дистанции бега");
            this.endurance -= distance;
            System.out.println("Остаток выносливости " + this.endurance);
        }
    }

    public abstract void swim(float distance);

    public void info() {
        System.out.println("Имя: " + this.name + "\n" +
                "Скорость бега: " + this.speedRun + " м/с\n" +
                "Скорость плавания: " + this.speedSwim + " м/с\n" +
                "Выносливость: " + this.endurance + " ед. выносливости\n");
    }

    public String getName() {
        return name;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public int getSpeedSwim() {
        return speedSwim;
    }

    public int getEndurance() {
        return endurance;
    }
}
