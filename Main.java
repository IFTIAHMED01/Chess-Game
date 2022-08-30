package Project;
//Name=IFTI AHMED
//Student ID = 6559348
//COSC-3P71 and Project

//Name=ANWAR HASHMI
//Student ID = 6584957
//COSC-3P71 and Project

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        //So, firstly I will create the chess board
        System.out.println("Please choose the dimension of chess board");
        System.out.println("Note: The dimension can only be 8 as per chess rules.");
        int d = input.nextInt();

        if (d == 8) {
            System.out.println("Game Starts");
        } else {
            System.out.println("Note: invalid dimension.");
            System.exit(0);
        }

        System.out.println("Please choose the depth of search you want to do for minimax algorithm in AI class");
        System.out.println("Note: The depth value should be greater than 15 for human vs AI Game");
        int depth = input.nextInt();

        System.out.println("Please choose the Ply Level in our AI class");
        System.out.println("0:Easy");
        System.out.println("1:Medium");
        System.out.println("2:Hard");
        int ply = input.nextInt();
        char[][] eri = new char[d][d];


        //This code is designing a empty chess board
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                eri[i][j] = '-';
            }
        }

        //This code is designing a chess board with chess pieces of each player

        //This will represent White Pieces
        eri[0][0] = 'R';
        eri[0][1] = 'K';
        eri[0][2] = 'B';
        eri[0][3] = 'Q';
        eri[0][4] = 'I';
        eri[0][5] = 'B';
        eri[0][6] = 'K';
        eri[0][7] = 'R';
        for (int i = 0; i < eri.length; i++) {
            eri[1][i] = 'P';
        }

        //This will represent Black Pieces
        for (int i = 0; i < eri.length; i++) {
            eri[d - 2][i] = 'p';
        }
        eri[d - 1][0] = 'r';
        eri[d - 1][1] = 'k';
        eri[d - 1][2] = 'b';
        eri[d - 1][3] = 'q';
        eri[d - 1][4] = 'i';
        eri[d - 1][5] = 'b';
        eri[d - 1][6] = 'k';
        eri[d - 1][7] = 'r';

        //Printing the whole chess board
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                System.out.print(eri[i][j] + " ");
            }
            System.out.println();
        }

        for (; ; ) {
            System.out.println("Please choose whether do you want to play with human or computer");
            System.out.println("0:Human Vs. Human");
            System.out.println("1:Human Vs. Computer");
            System.out.println("Any Other Number:Exit");
            int count = input.nextInt();
            if (count == 0) {
                Player p = new Player();
                p.switchPlayer(eri);
            } else if (count == 1) {
                if (depth <= 15) {
                    System.out.println("Invalid Depth, so the game will exit");
                    System.exit(0);
                }
                AI ai = new AI(depth, ply);
                ai.switchPlayer(eri);
            } else {
                break;
            }
        }
    }
}