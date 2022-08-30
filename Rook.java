package Project;
//Name=IFTI AHMED
//Student ID = 6559348
//COSC-3P71 and Project

//Name=ANWAR HASHMI
//Student ID = 6584957
//COSC-3P71 and Project
////
import java.util.Scanner;

public class Rook {
    public void MoveForward(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((x + steps) < eri.length) && eri[x + steps][y] != 'P' && eri[x + steps][y] != 'I' && eri[x + steps][y] != 'K' &&
                    eri[x + steps][y] != 'B' && eri[x + steps][y] != 'Q') {
                eri[x + steps][y] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((x - steps) >= 0) && eri[x - steps][y] != 'p' && eri[x - steps][y] != 'i' && eri[x - steps][y] != 'k' &&
                    eri[x - steps][y] != 'b' && eri[x - steps][y] != 'q') {
                eri[x - steps][y] = eri[x][y];
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

    public void MoveDownward(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((x - steps) >= 0) && eri[x - steps][y] != 'P' && eri[x - steps][y] != 'I' && eri[x - steps][y] != 'K' &&
                    eri[x - steps][y] != 'B' && eri[x - steps][y] != 'Q') {
                eri[x - steps][y] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((x + steps) < eri.length) && eri[x + steps][y] != 'p' && eri[x + steps][y] != 'i' && eri[x + steps][y] != 'k' &&
                    eri[x + steps][y] != 'b' && eri[x + steps][y] != 'q') {
                eri[x + steps][y] = eri[x][y];
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

    public void MoveLeft(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((y - steps) >= 0) && eri[x][y - steps] != 'P' && eri[x][y - steps] != 'I' && eri[x][y - steps] != 'K' &&
                    eri[x][y - steps] != 'B' && eri[x][y - steps] != 'Q') {
                eri[x][y - steps] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((y - steps) >= 0) && eri[x][y - steps] != 'p' && eri[x][y - steps] != 'i' && eri[x][y - steps] != 'k' &&
                    eri[x][y - steps] != 'b' && eri[x][y - steps] != 'q') {
                eri[x][y - steps] = eri[x][y];
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

    public void MoveRight(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((y + steps) < eri.length) && eri[x][y + steps] != 'P' && eri[x][y + steps] != 'I' && eri[x][y + steps] != 'K' &&
                    eri[x][y + steps] != 'B' && eri[x][y + steps] != 'Q') {
                eri[x][y + steps] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((y + steps) < eri.length) && eri[x][y + steps] != 'p' && eri[x][y + steps] != 'i' && eri[x][y + steps] != 'k' && eri[x][y + steps] != 'b' &&
                    eri[x][y + steps] != 'q') {
                eri[x][y + steps] = eri[x][y];
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

