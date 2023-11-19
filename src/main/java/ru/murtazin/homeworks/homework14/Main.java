package ru.murtazin.homeworks.homework14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Домашнее задание 14.
 * Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
 * Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
 * Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
 * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст вместо числа),
 * должно быть брошено исключение AppArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 * В методе main() необходимо вызвать полученный метод, обработать возможные исключения AppArraySizeException и
 * AppArrayDataException и вывести результат расчета (сумму элементов, при условии, что подали на вход корректный массив).
 */
public class Main {

    public static void doSomething(String[][] array) throws AppArraySizeException {
        int el, sum = 0, line = 0, col = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    line = i;
                    col = j;
                    el = Integer.parseInt(array[i][j]);
                    sum += el;

                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат данных в ячейке " + line + " " + col);
            throw new AppArrayDataException("Неверный формат данных в ячейке ", line, col);
        }
//        catch (AppArraySizeException e) {
//            throw new AppArraySizeException("");
//        }
        System.out.println(sum);
    }

    public static void main(String[] args) throws AppArraySizeException {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String[][] array = new String[4][4];
        System.out.println("Введите первую строку массива");
        String firstLine = scan.nextLine();
        System.out.println("Введите вторую строку массива");
        String secondLine = scan.nextLine();
        System.out.println("Введите третью строку массива");
        String thirdLine = scan.nextLine();
        System.out.println("Введите четвертую строку массива");
        String fourthLine = scan.nextLine();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                switch (i){
                    case 0:
                        array[i][j] = firstLine;
                        break;
                    case 1:
                        array[i][j] = secondLine;
                        break;
                    case 2:
                        array[i][j] = thirdLine;
                        break;
                    case 3:
                        array[i][j] = fourthLine;
                        break;
                }
            }
        }
        System.out.println(Arrays.deepToString(array));
        doSomething(array);
    }
}
