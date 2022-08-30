package Project;
//Name=IFTI AHMED
//Student ID = 6559348
//COSC-3P71 and Project

//Name=ANWAR HASHMI
//Student ID = 6584957
//COSC-3P71 and Project

import java.util.Scanner;

public class Knight {
    public void MoveDiagonalForwardLEFT(char eri[][], int x, int y, int steps, int turn) {

        if (turn == 0) {//if it is white move turn = 0
            if (((x + 2) < eri.length && (y - 1) >= 0) && eri[x + 2][y - 1] != 'P' && eri[x + 2][y - 1] != 'R' && eri[x + 2][y - 1] != 'I' && eri[x + 2][y - 1] != 'B' && eri[x + 2][y - 1] != 'Q') {
                //if(x>=0 && y>=0 && x<eri.length && y<eri.length){
                eri[x + 2][y - 1] = eri[x][y];
                eri[x][y] = '-';
                // }
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {//if it is black move turn =1
            if (((x - 2) >= 0 && (y - 1) >= 0) && eri[x - 2][y - 1] != 'p' && eri[x - 2][y - 1] != 'r' && eri[x - 2][y - 1] != 'i' &&
                    eri[x - 2][y - 1] != 'b' && eri[x - 2][y - 1] != 'q') {
                //if (x >= 0 && y >= 0 && x < eri.length && y < eri.length) {
                eri[x - 2][y - 1] = eri[x][y];
                eri[x][y] = '-';
                // }
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
        if (turn == 0) {//if it is white move turn = 0
            if (((x + 2) < eri.length && (y + 1) < eri.length) && eri[x + 2][y + 1] != 'P' && eri[x + 2][y + 1] != 'R' && eri[x + 2][y + 1] != 'I' &&
                    eri[x + 2][y + 1] != 'B' && eri[x + 2][y + 1] != 'Q') {
                //if (x > 0 && y > 0 && x < eri.length && y < eri.length) {
                eri[x + 2][y + 1] = eri[x][y];
                eri[x][y] = '-';
                // }
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {//if it is black move turn =1 constraints for black move
            if (((x - 2) >= 0 && (y + 1) < eri.length) && eri[x - 2][y + 1] != 'p' && eri[x - 2][y + 1] != 'r' && eri[x - 2][y + 1] != 'i' &&
                    eri[x - 2][y + 1] != 'b' && eri[x - 2][y + 1] != 'q') {
                // if (x > 0 && y > 0 && x < eri.length && y < eri.length) {
                eri[x - 2][y + 1] = eri[x][y];
                eri[x][y] = '-';
                // }
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
        if (turn == 0) { //if it is white move turn = 0
            if (((x - 2) >= 0 && (y - 1) >= 0) && eri[x - 2][y - 1] != 'P' && eri[x - 2][y - 1] != 'R' && eri[x - 2][y - 1] != 'I' &&
                    eri[x - 2][y - 1] != 'B' && eri[x - 2][y - 1] != 'Q') {
                eri[x - 2][y - 1] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x + 2) < eri.length && (y - 1) >= 0) && eri[x + 2][y - 1] != 'p' && eri[x + 2][y - 1] != 'r' && eri[x + 2][y - 1] != 'i' &&
                    eri[x + 2][y - 1] != 'b' && eri[x + 2][y - 1] != 'q') {
                eri[x + 2][y - 1] = eri[x][y];
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
        if (turn == 0) {//if it is white move turn = 0
            if (((x - 2) >= 0 && (y + 1) < eri.length) && eri[x - 2][y + 1] != 'P' && eri[x - 2][y + 1] != 'R' && eri[x - 2][y + 1] != 'I' && eri[x - 2][y + 1] != 'B' && eri[x - 2][y + 1] != 'Q') {
                // if (x > 0 && y > 0) {
                eri[x - 2][y + 1] = eri[x][y];
                eri[x][y] = '-';
                // }
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turn == 1) {
            if (((x + 2) < eri.length && (y + 1) < eri.length) && eri[x + 2][y + 1] != 'p' && eri[x + 2][y + 1] != 'r' && eri[x + 2][y + 1] != 'i' &&
                    eri[x + 2][y + 1] != 'b' && eri[x + 2][y + 1] != 'q') {
                eri[x + 2][y + 1] = eri[x][y];
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