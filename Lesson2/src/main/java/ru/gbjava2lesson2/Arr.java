package ru.gbjava2lesson2;

public class Arr {

    public static int sumArrElem(String[][] strArr) throws MyArraySizeException, MyArrayDataException {
        int countElemArr = 0;
        int sumElemArr = 0;
        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                countElemArr++;
            }
        }

        if (countElemArr != 16) {
            throw new MyArraySizeException("Неверный размер массива!");
        }

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < strArr[i].length; j++) {
                try {
                    sumElemArr += Integer.parseInt(strArr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректный элемент массива", i, j);
                }
            }
        }

        return sumElemArr;
    }
}
