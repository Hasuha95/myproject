package lesson4;

import java.util.Random;
import java.util.Scanner;
/*
выиграть компьютер можно так же как и человека.
но есть один ньюанс - у компьютера приоритет на элемент по порядку.
тоесть, если в верхней строке не хватает одного "x" для победы человека, а в нижней
одного "0"  для победы компьютера, то компьютер выберет поставть "0" в
верхней строке "иксов", тем самым упустив возможность досрочной победы.

x o x
. . .
o . o


 */
public class Main {

    static final int SIZE = 3;

    static final char DOT_X = 'x';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        for (int i = 0; i <= (SIZE * SIZE); ) {
            humanTurrn();
            if (whoISwiner(map)) {
                System.out.println("human wins");
                printMap();
                break;
            } else {
                i++;
                if (i == (SIZE * SIZE)) {
                    System.out.println("нечья");
                    printMap();
                    break;
                }
            }
            aiTurrn();
            if (whoISwiner(map)) {
                System.out.println("AI wins");
                printMap();
                break;
            } else {
                i++;
            }
            printMap();
        }
    }



    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
//                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }



    public static void printMap() {
        System.out.println("   "+"1"+" "+"2"+" " +"3");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1)+"  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }



    public static char humanTurrn() {
        int x, y;
        do {
            System.out.println("введите координаты X, Y");
            x = scan.nextInt() - 1;
            y = scan.nextInt() - 1;
        } while (uslovie(x, y) != true);
            return map[y][x] = DOT_X;
    }



    public static boolean uslovie(int x, int y) {
        if (x >= SIZE || y >= SIZE || x < 0 || y < 0) {
            return false;
        } else {
            return map[y][x] == DOT_EMPTY;
        }
    }






//                             ход компьютера.
    public static char aiTurrn() {
        int x, y;
        int iter=0;

        for (int i=0; i<SIZE; i++) {
            for (int g = 0; g < SIZE; g++) {
                iter++;
                if ((map[i][g] == DOT_X) || (map[i][g] == DOT_O)) {
                    if (aiBrains(i, g, 'i') != 0 || aiBrains(i, g, 'g') != 0) {
                        map[i + aiBrains(i, g, 'i')][g + aiBrains(i, g, 'g')] = DOT_O;
                        return map[i + aiBrains(i, g, 'i')][g + aiBrains(i, g, 'g')];
                    }
                }
                if (iter == SIZE * SIZE) {
                        do {
                            x = random.nextInt(SIZE);
                            y = random.nextInt(SIZE);
                        } while (map[x][y] != DOT_EMPTY);
                    System.out.println("randoom");
                        return map[x][y] = DOT_O;
                }
            }
        }
        return 0;
    }

    public  static int aiBrains(int I, int G, char index) {
        int oneStep = 1;
        int twoStep = 2;
        int oneStepMinus= -1;
        int twoStepMinus = -2;

        // HORIZONTAL
        if (G < SIZE - 2 & index == 'g') {
            if (map[I][G] == map[I][G + 1] & map[I][G + 2] == DOT_EMPTY) {
                return twoStep;
            }
            if (map[I][G] == map[I][G + 2] & map[I][G + 1] == DOT_EMPTY) {
                return oneStep;
            }
        }
        if (G >1 & index == 'g') {
            if (map[I][G] == map[I][G - 1] & map[I][G - 2] == DOT_EMPTY) {
                return twoStepMinus;
            }
        }

        // VERTICAL
        if (I < SIZE - 2 & index == 'i') {
            if (map[I][G] == map[I + 1][G] & map[I + 2][G] == DOT_EMPTY) {
                return twoStep;
            }
            if (map[I][G] == map[I + 2][G] & map[I + 1][G] == DOT_EMPTY) {
                return oneStep;
            }
        }
        if (I > SIZE-2 & index == 'i') {
            if (map[I][G] == map[I - 1][G] & map[I - 2][G] == DOT_EMPTY) {
                return twoStepMinus;
            }
        }

        // DIAGONAL
        if (I < SIZE - 2 & G < SIZE - 2) {
            if (map[I][G] == map[I + 1][G + 1] & map[I + 2][G + 2] == DOT_EMPTY) {
                return twoStep;
            }
            if (map[I][G] == map[I + 2][G + 2] & map[I + 1][G + 1] == DOT_EMPTY) {
                return oneStep;
            }
        }
        if (I > SIZE - 2 & G > SIZE - 2) {
            if (map[I][G] == map[I - 1][G - 1] & map[I - 2][G - 2] == DOT_EMPTY) {
                return twoStepMinus;
            }
            if (map[I][G] == map[I - 2][G - 2] & map[I - 1][G - 1] == DOT_EMPTY) {
                return oneStep;
            }
        }
        if (I < SIZE - 2 & G > SIZE - 2) {
            if (map[I][G] == map[I + 1][G - 1] & map[I + 2][G - 2] == DOT_EMPTY) {
                if (index == 'g') {
                    return twoStepMinus;
                }
                if (index == 'i') {
                    return twoStep;
                }
            }
            if (map[I][G] == map[I + 2][G - 2] & map[I + 1][G - 1] == DOT_EMPTY) {
                if (index == 'g') {
                    return oneStepMinus;
                }
                if (index == 'i') {
                    return oneStep;
                }
            }
        }
        if (I > SIZE - 2 & G < SIZE - 2) {
            if (map[I][G] == map[I - 1][G + 1] & map[I - 2][G + 2] == DOT_EMPTY) {
                if (index == 'g') {
                    return twoStep;
                }
                if (index == 'i') {
                    return twoStepMinus;
                }
            }
        }
        return 0;
    }





    public static boolean whoISwiner(char[][] map) {
        for (int i = 0; i < SIZE; i++) {
            for (int g = 1; g <= SIZE - 2; g++) {
                if (map[i][g] != DOT_EMPTY) {
                    if (map[i][g] == map[i][g + 1] & map[i][g] == map[i][g - 1] & map[i][g] != DOT_EMPTY) {
                        return true;
                    }
                }
                if (map[g][i] != DOT_EMPTY) {
                    if (map[g][i] == map[g - 1][i] & map[g][i] == map[g + 1][i]) {
                        return true;
                    }
                }
                }
            for (int I=1; I<SIZE-1; I++){
                for (int G=1; G<SIZE-1; G++){
                    if (map[I][G] != DOT_EMPTY) {
                        if (map[I][G]==map[I-1][G-1] & map[I][G]==map[I+1][G+1]){
                            return true;
                    }
                        if (map[I][G]==map[I+1][G-1] & map[I][G]==map[I-1][G+1]){
                            return true;
                        }
                    }
                }
            }
            }

        return false;
    }
}