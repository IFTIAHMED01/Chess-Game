package Project;

import java.util.Scanner;
//Name=IFTI AHMED
//Student ID = 6559348
//COSC-3P71 and Project

//Name=ANWAR HASHMI
//Student ID = 6584957
//COSC-3P71 and Project
public class Bishop {
    public void MoveDiagonalForwardLEFT(char eri[][], int x, int y, int steps, int turn) {

        if (turn == 0) {
            if (((x + steps) < eri.length && (y - steps) >= 0) && eri[x + steps][y - steps] != 'P' && eri[x + steps][y - steps] != 'R' && eri[x + steps][y - steps] != 'K'
                    && eri[x + steps][y - steps] != 'I' && eri[x + steps][y - steps] != 'Q') {
                eri[x + steps][y - steps] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x - steps) >= 0 && (y - steps) >= 0) && eri[x - steps][y - steps] != 'p' && eri[x - steps][y - steps] != 'r' &&
                    eri[x - steps][y - steps] != 'k' && eri[x - steps][y - steps] != 'i' && eri[x - steps][y - steps] != 'q') {
                eri[x - steps][y - steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    public void MoveDiagonalForwardRIGHT(char eri[][], int x, int y, int steps, int turn) {
        if (turn == 0) {
            if (((x + steps) < eri.length && (y + steps) < eri.length) && eri[x + steps][y + steps] != 'P' && eri[x + steps][y + steps] != 'R' && eri[x + steps][y + steps] != 'K' &&
                    eri[x + steps][y + steps] != 'I' && eri[x + steps][y + steps] != 'Q') {
                eri[x + steps][y + steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x - steps) >= 0 && (y + steps) < eri.length) && eri[x - steps][y + steps] != 'p' && eri[x - steps][y + steps] != 'r' && eri[x - steps][y + steps] != 'k' &&
                    eri[x - steps][y + steps] != 'i' && eri[x - steps][y + steps] != 'q') {
                eri[x - steps][y + steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


    public void MoveDiagonalBackwardLEFT(char eri[][], int x, int y, int steps, int turn) {
        if (turn == 0) {
            if (((x - steps) >= 0 && (y - steps) >= 0) && eri[x - steps][y - steps] != 'P' && eri[x - steps][y - steps] != 'R' && eri[x - steps][y - steps] != 'K' &&
                    eri[x - steps][y - steps] != 'I' && eri[x - steps][y - steps] != 'Q') {
                eri[x - steps][y - steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x + steps) < eri.length && (y - steps) >= 0) && eri[x + steps][y - steps] != 'p' && eri[x + steps][y - steps] != 'r' && eri[x + steps][y - steps] != 'k' &&
                    eri[x + steps][y - steps] != 'i' && eri[x + steps][y - steps] != 'q') {
                eri[x + steps][y - steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public void MoveDiagonalBackwardRIGHT(char eri[][], int x, int y, int steps, int turn) {
        if (turn == 0) {
            if (((x - steps) >= 0 && (y + steps) < eri.length) && eri[x - steps][y + steps] != 'P' && eri[x - steps][y + steps] != 'R' && eri[x - steps][y + steps] != 'K' &&
                    eri[x - steps][y + steps] != 'I' && eri[x - steps][y + steps] != 'Q') {
                eri[x - steps][y + steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x + steps) < eri.length && (y + steps) < eri.length) && eri[x + steps][y + steps] != 'p' && eri[x + steps][y + steps] != 'r' && eri[x + steps][y + steps] != 'k' &&
                    eri[x + steps][y + steps] != 'i' && eri[x + steps][y + steps] != 'q') {
                eri[x + steps][y + steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


}