package ru.murtazin.homeworks.homework12;

public class Plate {
    private int maxAmountFood;
    private int curAmountFood;

    public Plate(int maxAmountFood, int curAmountFood) {
        this.maxAmountFood = maxAmountFood;
        this.curAmountFood = curAmountFood;
    }

    public int getMaxAmountFood() {
        return maxAmountFood;
    }

    public void setMaxAmountFood(int maxAmountFood) {
        this.maxAmountFood = maxAmountFood;
    }

    public int getCurAmountFood() {
        return curAmountFood;
    }

    public void setCurAmountFood(int curAmountFood) {
        this.curAmountFood = curAmountFood;
    }
}
