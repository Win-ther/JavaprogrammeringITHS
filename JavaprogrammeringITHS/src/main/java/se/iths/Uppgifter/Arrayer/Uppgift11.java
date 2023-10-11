package se.iths.Uppgifter.Arrayer;

import java.util.Scanner;

public class Uppgift11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] array = createArray(5, 7);
        char direction;
        printArray(array);
        System.out.println("Vilken riktning vill du flytta @? (W, A, S eller D)(e to exit)");
        while (true) {
            direction = scanner.next().charAt(0);
            moveAt(array, direction);
            printArray(array);
        }
    }

    public static char[][] createArray(int rows, int cols) {
        char[][] array = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    array[i][j] = '#';
                } else {
                    array[i][j] = '-';
                }
            }
        }
        array[rows / 2][cols / 2] = '@';
        return array;
    }

    public static void printArray(char[][] array) {
        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println("");
        }
    }

    public static void moveAt(char[][] array, char direction) {
        int posRow = 0;
        int posCol = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == '@') {
                    posRow = i;
                    posCol = j;
                    break;
                }
            }
        }
        switch (direction) {
            case 'w' -> {
                if (posRow > 1) {
                    array[posRow][posCol] = '-';
                    array[posRow - 1][posCol] = '@';
                }
            }
            case 'a' -> {
                if (posCol > 1) {
                    array[posRow][posCol] = '-';
                    array[posRow][posCol - 1] = '@';
                }
            }
            case 's' -> {
                if (posRow < array.length - 2) {
                    array[posRow][posCol] = '-';
                    array[posRow + 1][posCol] = '@';
                }
            }
            case 'd' -> {
                if (posCol < array[posRow].length - 2) {
                    array[posRow][posCol] = '-';
                    array[posRow][posCol + 1] = '@';
                }
            }
            case 'e' -> System.exit(0);
            default -> System.out.println("Använd W, A, S eller D.");
        }
    }
}
