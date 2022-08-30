package Project;
//Name=IFTI AHMED
//Student ID = 6559348
//COSC-3P71 and Project

//Name=ANWAR HASHMI
//Student ID = 6584957
//COSC-3P71 and Project

import java.util.Scanner;

public class Pawn {
    int count = 0;

    public void EnPassant(char eri[][], int x, int y, int steps, int turn) {
        if (turn == 0) {
            if ((x + 2) < eri.length && eri[x + 2][y] != 'I' && eri[x + 2][y] != 'R' && eri[x + 2][y] != 'K' &&
                    eri[x + 2][y] != 'B' && eri[x + 2][y] != 'Q') {
                eri[x + 2][y] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if ((x - 2) >= 0 && eri[x - 2][y] != 'i' && eri[x - 2][y] != 'r' && eri[x - 2][y] != 'k' &&
                    eri[x - 2][y] != 'b' && eri[x - 2][y] != 'q') {
                eri[x - 2][y] = eri[x][y];
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

    public void MoveDiagonalForwardLEFT(char eri[][], int x, int y, int steps, int turn) {
        if (turn == 0) {
            if (((x + 1) < eri.length && (y - 1) >= 0) && eri[x + 1][y - 1] != 'I' && eri[x + 1][y - 1] != 'R' && eri[x + 1][y - 1] != 'K'
                    && eri[x + steps][y - steps] != 'B' && eri[x + steps][y - steps] != 'Q' && eri[x + 1][y - 1] != '-') {


                eri[x + 1][y - 1] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x - 1) >= 0 && (y - 1) >= 0) && eri[x - 1][y - 1] != 'i' && eri[x - 1][y - 1] != 'r' &&
                    eri[x - 1][y - 1] != 'k' && eri[x - 1][y - 1] != 'b' && eri[x - 1][y - 1] != 'q' && eri[x - 1][y - 1] != '-') {
                eri[x - 1][y - 1] = eri[x][y];
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
            if (((x + 1) < eri.length && (y + 1) < eri.length) && eri[x + 1][y + 1] != 'I' && eri[x + 1][y + 1] != 'R' && eri[x + 1][y + 1] != 'K' &&
                    eri[x + 1][y + 1] != 'B' && eri[x + 1][y + 1] != 'Q' && eri[x + 1][y + 1] != '-') {
                eri[x + 1][y + 1] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x - 1) >= 0 && (y + 1) < eri.length) && eri[x - 1][y + 1] != 'i' && eri[x - 1][y + 1] != 'r' && eri[x - 1][y + 1] != 'k' &&
                    eri[x - 1][y + 1] != 'b' && eri[x - 1][y + 1] != 'q' && eri[x - 1][y + 1] != '-') {
                eri[x - 1][y + 1] = eri[x][y];
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

    public void MoveForward(char eri[][], int x, int y, int steps, int turn) {

        if (turn == 0) {
            if ((x + 1) < eri.length && eri[x + 1][y] != 'I' && eri[x + 1][y] != 'R' && eri[x + 1][y] != 'K' &&
                    eri[x + 1][y] != 'B' && eri[x + 1][y] != 'Q') {
                eri[x + 1][y] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if ((x - 1) >= 0 && eri[x - 1][y] != 'i' && eri[x - 1][y] != 'r' && eri[x - 1][y] != 'k' &&
                    eri[x - 1][y] != 'b' && eri[x - 1][y] != 'q') {
                eri[x - 1][y] = eri[x][y];
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