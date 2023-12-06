package ru.murtazin.homeworks.homework12;

public class Plate {
    private final int maxAmountFood;
    private int curAmountFood;

    public Plate(int maxAmountFood) {
        this.maxAmountFood = maxAmountFood;
    }

    public int getMaxAmountFood() {
        return maxAmountFood;
    }

    public int getCurAmountFood() {
        return curAmountFood;
    }

    public void setCurAmountFood(int curAmountFood) {
        this.curAmountFood = curAmountFood;
    }
}
