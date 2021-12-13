package ru.gbjava2lesson2;

public class Main {

    public static void main (String[] args) {

        int sumArr = 0;

        String[][] strArr = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}
        };

        try {
            sumArr = Arr.sumArrElem(strArr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("Элемент массива с индексом " + "[" + e.getI() + "]" + " [" + e.getJ() + "]" + " некорректен!");
        } finally {
            System.out.println("Сумма элементов массива = " + sumArr);
        }
    }
}
