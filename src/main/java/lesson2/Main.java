package lesson2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] massive = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n;
        n = 2;
        exersizeSeven(massive, n);

    }


    //*1

    public static void exersizeOne() {

        short[] massive = new short[]{0, 1, 1, 0, 1, 0, 0, 0, 1};

        for (int i = 0; i < massive.length; i++) {

            if (massive[i] == 0) {
                massive[i] = 1;
            } else {
                massive[i] = 0;
            }

        }


    }


    // *2
    public static void exersizeTwo() {
        int[] massive = new int[8];
        for (int i = 1; i < massive.length; i++) {
            massive[i] = massive[i - 1] + 3;
        }
        for (int g = 0; g <= 8; g++) {


        }


    }


// 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void exersizeThree() {
        int[] massive = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < 6) {
                massive[i] *= 2;
            }

        }


    }


// 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//    заполнить его диагональные элементы единицами;

    public static void exersizeFour() {
        int[][] massive = new int[3][3];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {

                massive[i][i] = 1;
            }
        }

    }


    // 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void exersizeFive() {
        int[] massive = new int[]{9, 4, 11, 7, 2, 7, 3, 2};
        int min = massive[0];
        int max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
            } else if (massive[i] > max) {
                max = massive[i];
            }

        }

    }


    /*
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен
       вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
       Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
       граница показана символами ||, эти символы в массив не входят.
    */
    private static boolean exersizeSix(int[] mass) {
        int size = mass.length - 1;
        int left = 0;
        int right = 0;
        for (int i = 0; i < size; i++) {
            left = 0;
            right = 0;
            for (int j = 0; j < i; j++) {
                left = mass[j] + left;
            }
            for (int g = size; g >= i; g--) {
                right = mass[g] + right;
            }
            if (left == right) {
                break;
            }

        }


        if (left == right) {
            return true;
        } else {
            return false;
        }
    }

/*
7. **** Написать метод, которому на вход подается одномерный массив и число n
(может быть положительным, или отрицательным), при этом метод должен
сместить все элементымассива на n позиций. Для усложнения задачи нельзя
пользоваться вспомогательными массивами.
*/


    private static void exersizeSeven(int[] mass, int n) {
        int iter = 0;
        int size = mass.length - 1;
//    Если n положительное.
        if (n > 0) {
            int element = size;
            int ozu = mass[size];          //память, для временного хранения значения

            while (iter <= size) {

                if (element >= n) {
                    mass[element] = mass[element - n];
                    element = element - n;
                    iter++;
                } else {
                    mass[element] = mass[(size + 1) + (element - n)];
                    element = (size + 1) + (element - n);
                    iter++;
                }
            }
            mass[n - 1] = ozu;
        }

//    Если n отрицательное.

        if (n < 0) {
            int ozu;
            int element = 0;
            ozu = mass[0];          //память, для временного хранения значения из крайней ячейки
            n = Math.abs(n);
            while (iter <= size) {
                if (element > (size - n)) {
                    mass[element] = mass[0 + (element - n)];
                    element = (element - n);
                    iter++;
                } else {
                    mass[element] = mass[element + n];
                    element = element + n;
                    iter++;
                }
            }
            mass[size - n + 1] = ozu;   //возвращяем значение в необходимую ячейку
        }

        System.out.println(Arrays.toString(mass));

    }

}
