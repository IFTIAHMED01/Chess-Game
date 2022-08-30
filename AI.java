package Project;
//Name=IFTI AHMED
//Student ID = 6559348
//COSC-3P71 and Project

//Name=ANWAR HASHMI
//Student ID = 6584957
//COSC-3P71 and Project

import java.util.Scanner;
import java.util.Random;

public class AI {
    int depth, ply;

    public AI(int depth, int ply) {
        this.depth = depth;
        this.ply = ply;
    }

    Scanner input = new Scanner(System.in);
    //initializing piece classes
    Rook rook = new Rook();
    King k = new King();
    Queen queen = new Queen();
    Bishop bishop = new Bishop();
    Knight knight = new Knight();
    Pawn pawn = new Pawn();

    //All count variables are for enpassant of White Pieces
    int countp1 = 0;//This is used for EnPassant. If count=1, then only enpassant will happen. Else, it will not happen
    int countp2 = 0;
    int countp3 = 0;
    int countp4 = 0;
    int countp5 = 0;
    int countp6 = 0;
    int countp7 = 0;
    int countp8 = 0;

    //All count variables are for enpassant of Black Pieces
    int countP1 = 0;// Use this for Black(Enpassant)
    int countP2 = 0;
    int countP3 = 0;
    int countP4 = 0;
    int countP5 = 0;
    int countP6 = 0;
    int countP7 = 0;
    int countP8 = 0;

    int count1 = 0;//This is used for Castling for white player. If count1=1, then only castling will happen. Else, it will not happen
    int count11 = 0;//This is used for Castling for black player. If count11=1, then only castling will happen. Else, it will not happen

    int c1 = 0; // This will be used for king of white player
    int c2 = 0; // This will be used for rook of white player
    int c3 = 0;// This will be used for king of black player
    int c4 = 0;// This will be used for rook of black player


    int turns = 0;
    //For King coordinates
    int x1 = 0;
    int y1 = 4;
    int m1 = 7;
    int n1 = 4;
    //For queen coordinates
    int x2 = 0;
    int y2 = 3;
    int m2 = 7;
    int n2 = 3;
    //For knight coordinates
    //For Left Knight
    int x3 = 0;
    int y3 = 1;
    int m3 = 7;
    int n3 = 1;
    //For Right Knight
    int x33 = 0;
    int y33 = 6;
    int m33 = 7;
    int n33 = 6;
    //For bishop coordinates
    //For Left Bishop
    int x4 = 0;
    int y4 = 2;
    int m4 = 7;
    int n4 = 2;
    //For Right Bishop
    int x44 = 0;
    int y44 = 5;
    int m44 = 7;
    int n44 = 5;

    //For pawn coordinates
    //p1
    int x51 = 1;
    int y51 = 0;
    int m51 = 6;
    int n51 = 0;
    //p2
    int x52 = 1;
    int y52 = 1;
    int m52 = 6;
    int n52 = 1;
    //p3
    int x53 = 1;
    int y53 = 2;
    int m53 = 6;
    int n53 = 2;
    //p4
    int x54 = 1;
    int y54 = 3;
    int m54 = 6;
    int n54 = 3;
    //p5
    int x55 = 1;
    int y55 = 4;
    int m55 = 6;
    int n55 = 4;
    //p6
    int x56 = 1;
    int y56 = 5;
    int m56 = 6;
    int n56 = 5;
    //p7
    int x57 = 1;
    int y57 = 6;
    int m57 = 6;
    int n57 = 6;
    //p8
    int x58 = 1;
    int y58 = 7;
    int m58 = 6;
    int n58 = 7;


    // For Rook 
    //For Left Rook
    int x6 = 0;
    int y6 = 0;
    int x66 = 0;
    int y66 = 7;
    //For Right Rook
    int m6 = 7;
    int n6 = 0;
    int m66 = 7;
    int n66 = 7;

    public void switchPlayer(char[][] eri) {
        //If turns=0, this means the white player is playing
        //If turns=1, this means the black player is playing
        //if turns =2, put end condition
        if (turns == 0) {
            whiteTurn(eri);
        } else if (turns == 1) {
            blackTurn(eri);
        } else if (turns == 2) {
            //checkMate();
            System.exit(0);
        }
    }

    //if the king is killed the game ends 
    public boolean Checkmate(char[][] eri, int m1, int n1) {
        for (int i = 0; i < eri.length; i++) {
            for (int j = 0; j < eri.length; j++) {
                if (eri[i][j] == 'i') {
                    return false;
                }
            }
        }
        return true;
    }

    //heuristic func
    public boolean heuristicFunction(char[][] eri, int x1, int y1) {
        for (int i = 0; i < eri.length; i++) {
            for (int j = 0; j < eri.length; j++) {
                if (eri[i][j] == 'I') {
                    return false;
                }
            }
        }
        return true;
    }

    // The concept of Minimax is taken from https://en.wikipedia.org/wiki/Minimax
    //Here player is a maximizer and AI is a minimizer
    public int AlphaBeta(char[][] eri, int depth, boolean MaximizingPlayer, int alpha, int beta, int value) {
        int a = value;

        if (depth == 0) {
            if (heuristicFunction(eri, x1, y1) == true) {
                System.out.println("AI Wins");
                System.exit(0);
            }

            return value;
        }
        if (MaximizingPlayer == true) {

            if (a >= beta) {
                AlphaBeta(eri, depth - 1, false, 6, 0, value);
            }
        } else if (MaximizingPlayer == false) {

            if (a <= alpha) {
                AlphaBeta(eri, depth - 1, true, 6, 0, value);
            }
        }
        System.out.println(121);
        System.out.println(value);////////////////////////////////
        return value;
    }


    public void userGuide(char[][] eri) {
        System.out.println("To return to game enter 0 if you are white and 1 if black");

        System.out.println("************RULES OF CHESS**************");
        System.out.println("King-can move in any direction: 1 step-can not move to a piece with same colour piece");
        System.out.println("Queen-can move in any direction: any steps-can not move to a piece with same colour piece");
        System.out.println("Bishop-can move in any direction diagonally: any steps-can not move to a piece with same colour piece");
        System.out.println("Rook-can move UP,DOWn,LEFT,RIGHT: any step-can not move to a piece with same colour piece");
        System.out.println("Pawn-can move only UP: 1 step-can not move to a piece with same colour piece");
        System.out.println("Knight- can move in 2.5 steps UP,DOWN,RIGHT,LEFT-can not move to a piece with same colour piece");
        System.out.println("*******Special Moves*******");
        System.out.println("En-passant-Pawn can move UP 2 steps on first turn only");
        System.out.println("Castling-King and Rook can move places one if both have not moved originally");
        System.out.println("To return to game enter 0 if you are white and 1 if black");
        int exitguide = input.nextInt();


        if (exitguide == 0) {
            turns = 0;
            switchPlayer(eri);
        } else if (exitguide == 1) {
            turns = 1;
            switchPlayer(eri);
        }

    }

    //White turn-
    public void whiteTurn(char[][] eri) {


        System.out.println("Please choose one of the moves in chess board=white");
        System.out.println("0:King");
        System.out.println("1:Queen");
        System.out.println("2:Knight");
        System.out.println("3:Bishop");
        System.out.println("4:Pawn");
        System.out.println("5:Rook");
        System.out.println("6:Surrender");
        System.out.println("7:User guide");


        int choose = input.nextInt();


        if (choose == 0) {
            System.out.println("Please choose number of steps");
            int steps = input.nextInt();

            System.out.println("Please choose the direction in which you want the king piece to move");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally Downward on the Left");
            System.out.println("3:Move Diagonally Downward on the Right");
            System.out.println("4:Move Forward");
            System.out.println("5:Move Downward");
            System.out.println("6:Move Left");
            System.out.println("7:Move Right");
            System.out.println("8:Do Castling");
            int choice = input.nextInt();

            if (choice == 0) {
                c1++;
                if (steps == 1) {
                    k.MoveDiagonalForwardLEFT(eri, x1, y1, steps, 0);
                    x1 += steps;
                    y1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 1) {
                c1++;
                if (steps == 1) {
                    k.MoveDiagonalForwardRIGHT(eri, x1, y1, steps, 0);
                    x1 += steps;
                    y1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 2) {
                c1++;
                if (steps == 1) {
                    k.MoveDiagonalBackwardLEFT(eri, x1, y1, steps, 0);
                    x1 -= steps;
                    y1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 3) {
                c1++;
                if (steps == 1) {
                    k.MoveDiagonalBackwardRIGHT(eri, x1, y1, steps, 0);
                    x1 -= steps;
                    y1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 4) {
                c1++;
                if (steps == 1) {
                    k.MoveForward(eri, x1, y1, steps, 0);
                    x1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 5) {
                c1++;
                if (steps == 1) {
                    k.MoveDownward(eri, x1, y1, steps, 0);
                    x1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 6) {
                c1++;
                if (steps == 1) {
                    k.MoveLeft(eri, x1, y1, steps, 0);
                    y1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 7) {
                c1++;
                if (steps == 1) {
                    k.MoveRight(eri, x1, y1, steps, 0);
                    y1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            } else if (choice == 8) {
                count1++;
                if (steps == 1 && count1 == 1) {
                    k.Castling(eri, x1, y1, steps, 0, c1, c2);
                    y1 += 2;
                } else {
                    System.out.println("Invalid steps");
                    turns = 0;
                    switchPlayer(eri);
                }
            }

            if (Checkmate(eri, m1, n1) == false) {
                //System.out.println("1234567898765432");
                turns = 1;
                switchPlayer(eri);
            } else if (Checkmate(eri, m1, n1) == true) {
                System.out.println("heuristicFunction! White King wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }


        //queen starts here
        else if (choose == 1) {
            System.out.println("Please choose number of steps");
            int steps = input.nextInt();

            System.out.println("Please choose the direction in which you want the queen piece to move(white)");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally Downward on the Left");
            System.out.println("3:Move Diagonally Downward on the Right");
            System.out.println("4:Move Forward");
            System.out.println("5:Move Downward");
            System.out.println("6:Move Left");
            System.out.println("7:Move Right");
            int choice = input.nextInt();


            if (choice == 0) {
                queen.MoveDiagonalForwardLEFT(eri, x2, y2, steps, 0);
                x2 += steps;
                y2 -= steps;

            } else if (choice == 1) {
                queen.MoveDiagonalForwardRIGHT(eri, x2, y2, steps, 0);
                x2 += steps;
                y2 -= steps;
            } else if (choice == 2) {
                queen.MoveDiagonalBackwardLEFT(eri, x2, y2, steps, 0);
                x2 -= steps;
                y2 -= steps;
            } else if (choice == 3) {
                queen.MoveDiagonalBackwardRIGHT(eri, x2, y2, steps, 0);
                x2 -= steps;
                y2 += steps;
            } else if (choice == 4) {
                queen.MoveForward(eri, x2, y2, steps, 0);
                x2 += steps;

            } else if (choice == 5) {
                queen.MoveDownward(eri, x2, y2, steps, 0);
                x2 -= steps;

            } else if (choice == 6) {
                queen.MoveLeft(eri, x2, y2, steps, 0);
                y2 -= steps;

            } else if (choice == 7) {
                queen.MoveRight(eri, x2, y2, steps, 0);
                y2 += steps;

            } else {
                System.out.println("Invalid steps");
                turns = 0;
                switchPlayer(eri);
            }

            if (Checkmate(eri, m1, n1) == false) {
                // System.out.println("1234567898765432");
                turns = 1;
                switchPlayer(eri);
            } else if (Checkmate(eri, m1, n1) == true) {
                System.out.println("heuristicFunction! White King wins!!!");
                turns = 2;
                switchPlayer(eri);
            }

        }


        //white knight here

        else if (choose == 2) {
            System.out.println("Please choose number of steps");
            int steps = input.nextInt();

            System.out.println("Please decide which rook you want to choose");
            System.out.println("0:Left White Knight");
            System.out.println("1:Right White Knight");
            int k = input.nextInt();

            System.out.println("Please choose the direction in which you want the knight piece to move(white)");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally backward on the Left");
            System.out.println("3:Move Diagonally backward on the Right");


            int choice = input.nextInt();

            if (choice == 0 && k == 0) {
                knight.MoveDiagonalForwardLEFT(eri, x3, y3, steps, 0);
                x3 += 2;
                y3 -= 1;
            } else if (choice == 0 && k == 1) {
                knight.MoveDiagonalForwardLEFT(eri, x33, y33, steps, 0);
                x33 += 2;
                y33 -= 1;
            } else if (choice == 1 && k == 0) {
                knight.MoveDiagonalForwardRIGHT(eri, x3, y3, steps, 0);
                x3 += 2;
                y3 += 1;
            } else if (choice == 1 && k == 1) {
                knight.MoveDiagonalForwardRIGHT(eri, x33, y33, steps, 0);
                x33 += 2;
                y33 += 1;
            } else if (choice == 2 && k == 0) {
                knight.MoveDiagonalBackwardLEFT(eri, x3, y3, steps, 0);
                x3 -= 2;
                y3 -= 1;
            } else if (choice == 2 && k == 1) {
                knight.MoveDiagonalBackwardLEFT(eri, x33, y33, steps, 0);
                x33 -= 2;
                y33 -= 1;
            } else if (choice == 3 && k == 0) {
                knight.MoveDiagonalBackwardRIGHT(eri, x3, y3, steps, 0);
                x3 -= 2;
                y3 += 1;
            } else if (choice == 3 && k == 1) {
                knight.MoveDiagonalBackwardRIGHT(eri, x33, y33, steps, 0);
                x33 -= 2;
                y33 += 1;
            }


            if (Checkmate(eri, m1, n1) == false) {
                //System.out.println("1234567898765432");
                turns = 1;
                switchPlayer(eri);
            } else if (Checkmate(eri, m1, n1) == true) {
                System.out.println("heuristicFunction! White King wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }

        //white bishop
        else if (choose == 3) {
            System.out.println("Please choose number of steps");
            int steps = input.nextInt();

            System.out.println("Please decide which rook you want to choose");
            System.out.println("0:Left White Bishop");
            System.out.println("1:Right White Bishop");
            int b = input.nextInt();

            System.out.println("Please choose the direction in which you want the bishop piece to move(white)");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally backward on the Left");
            System.out.println("3:Move Diagonally backward on the Right");


            int choice = input.nextInt();

            if (choice == 0 && b == 0) {
                bishop.MoveDiagonalForwardLEFT(eri, x4, y4, steps, 0);
                x4 += steps;
                y4 -= steps;
            } else if (choice == 0 && b == 1) {
                bishop.MoveDiagonalForwardLEFT(eri, x44, y44, steps, 0);
                x44 += steps;
                y44 -= steps;
            } else if (choice == 1 && b == 0) {
                bishop.MoveDiagonalForwardRIGHT(eri, x4, y4, steps, 0);
                x4 += steps;
                y4 += steps;
            } else if (choice == 1 && b == 1) {
                bishop.MoveDiagonalForwardRIGHT(eri, x44, y44, steps, 0);
                x44 += steps;
                y44 += steps;
            } else if (choice == 2 && b == 0) {
                bishop.MoveDiagonalBackwardLEFT(eri, x4, y4, steps, 0);
                x4 -= steps;
                y4 -= steps;
            } else if (choice == 2 && b == 1) {
                bishop.MoveDiagonalBackwardLEFT(eri, x44, y44, steps, 0);
                x44 -= steps;
                y44 -= steps;
            } else if (choice == 3 && b == 0) {
                bishop.MoveDiagonalBackwardRIGHT(eri, x4, y4, steps, 0);
                x4 -= steps;
                y4 += steps;
            } else if (choice == 3 && b == 1) {
                bishop.MoveDiagonalBackwardRIGHT(eri, x44, y44, steps, 0);
                x44 -= steps;
                y44 += steps;
            }


            if (Checkmate(eri, m1, n1) == false) {
                //  System.out.println("1234567898765432");
                turns = 1;
                switchPlayer(eri);
            } else if (Checkmate(eri, m1, n1) == true) {
                System.out.println("heuristicFunction! White King wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }


        //pawn here
        else if (choose == 4) {
            System.out.println("Please choose number of steps");
            int steps = input.nextInt();

            System.out.println("Please choose which pawn piece to move(white)");
            System.out.println("1 2 3 4 5 6 7 8");
            int choosePawn = input.nextInt();

            if (choosePawn == 1) {//for pawn 1


                System.out.println("Please choose the direction in which you want the pawn 1 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");
                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x51, y51, steps, 0);
                    x51 += 1;
                    y51 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x51, y51, steps, 0);
                    x51 += 1;
                    y51 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x51, y51, steps, 0);
                    x51 += 1;
                } else if (choice == 3) {
                    countp1++;
                    if (countp1 == 1) {
                        pawn.EnPassant(eri, x51, y51, steps, 0);
                        x51 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }

                // turns=1;
                // switchPlayer(eri);
                if (Checkmate(eri, m1, n1) == false) {
                    //  System.out.println("1234567898765432");
                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 2) { //for pawn 2
                System.out.println("Please choose the direction in which you want the pawn 2 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x52, y52, steps, 0);
                    x52 += 1;
                    y52 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x52, y52, steps, 0);
                    x52 += 1;
                    y52 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x52, y52, steps, 0);
                    x52 += 1;

                } else if (choice == 3) {
                    countp2++;
                    if (countp2 == 1) {
                        pawn.EnPassant(eri, x52, y52, steps, 0);
                        x52 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }


                if (Checkmate(eri, m1, n1) == false) {
                    //System.out.println("1234567898765432");
                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 3) {
                System.out.println("Please choose the direction in which you want the pawn 3 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");

                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x53, y53, steps, 0);
                    x53 += 1;
                    y53 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x53, y53, steps, 0);
                    x53 += 1;
                    y53 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x53, y53, steps, 0);
                    x53 += 1;

                } else if (choice == 3) {
                    countp3++;
                    if (countp3 == 1) {
                        pawn.EnPassant(eri, x53, y53, steps, 0);
                        x53 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }


                if (Checkmate(eri, m1, n1) == false) {
                    //System.out.println("1234567898765432");
                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 4) {
                System.out.println("Please choose the direction in which you want the pawn 4 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");

                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x54, y54, steps, 0);
                    x54 += 1;
                    y54 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x54, y54, steps, 0);
                    x54 += 1;
                    y54 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x54, y54, steps, 0);
                    x54 += 1;

                } else if (choice == 3) {
                    countp4++;
                    if (countp4 == 1) {
                        pawn.EnPassant(eri, x54, y54, steps, 0);
                        x54 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }


                if (Checkmate(eri, m1, n1) == false) {

                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 5) {
                System.out.println("Please choose the direction in which you want the pawn 5 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");

                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x55, y55, steps, 0);
                    x55 += 1;
                    y55 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x55, y55, steps, 0);
                    x55 += 1;
                    y55 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x55, y55, steps, 0);
                    x55 += 1;

                } else if (choice == 3) {
                    countp5++;
                    if (countp5 == 1) {
                        pawn.EnPassant(eri, x55, y55, steps, 0);
                        x55 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }


                if (Checkmate(eri, m1, n1) == false) {
                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 6) {
                System.out.println("Please choose the direction in which you want the pawn 6 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");

                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x56, y56, steps, 0);
                    x56 += 1;
                    y56 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x56, y56, steps, 0);
                    x56 += 1;
                    y56 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x56, y56, steps, 0);
                    x56 += 1;

                } else if (choice == 3) {
                    countp6++;
                    if (countp6 == 1) {
                        pawn.EnPassant(eri, x56, y56, steps, 0);
                        x56 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }


                if (Checkmate(eri, m1, n1) == false) {
                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 7) {
                System.out.println("Please choose the direction in which you want the pawn 7 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");

                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x57, y57, steps, 0);
                    x57 += 1;
                    y57 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x57, y57, steps, 0);
                    x57 += 1;
                    y57 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x57, y57, steps, 0);
                    x57 += 1;

                } else if (choice == 3) {
                    countp7++;
                    if (countp7 == 1) {
                        pawn.EnPassant(eri, x57, y57, steps, 0);
                        x57 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }


                if (Checkmate(eri, m1, n1) == false) {
                    // System.out.println("1234567898765432");
                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 8) {
                System.out.println("Please choose the direction in which you want the pawn 8 to move(white)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");

                int choice = input.nextInt();

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, x58, y58, steps, 0);
                    x58 += 1;
                    y58 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, x58, y58, steps, 0);
                    x58 += 1;
                    y58 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, x58, y58, steps, 0);
                    x58 += 1;

                } else if (choice == 3) {
                    countp8++;
                    if (countp8 == 1) {
                        pawn.EnPassant(eri, x58, y58, steps, 0);
                        x58 += 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 0;
                        switchPlayer(eri);
                    }
                }

                // turns=1;
                // switchPlayer(eri);
                if (Checkmate(eri, m1, n1) == false) {
                    turns = 1;
                    switchPlayer(eri);
                } else if (Checkmate(eri, m1, n1) == true) {
                    System.out.println("heuristicFunction! White King wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            }
        }


        //Rook starts here
        else if (choose == 5) {
            System.out.println("Please choose number of steps");
            int steps = input.nextInt();

            System.out.println("Please decide which rook you want to choose");
            System.out.println("0:Left White Rook");
            System.out.println("1:Right White Rook");
            int r = input.nextInt();

            System.out.println("Please choose the direction in which you want the rook piece to move(white)");
            System.out.println("0:Move  Left");
            System.out.println("1:Move Forward ");
            System.out.println("2:Move backward ");
            System.out.println("3:Move Right");
            int choice = input.nextInt();
            if (choice == 0 && r == 0) {
                rook.MoveLeft(eri, x6, y6, steps, 0);
                y6 -= steps;
            } else if (choice == 0 && r == 1) {
                c2++;
                rook.MoveLeft(eri, x66, y66, steps, 0);
                y66 -= steps;
            } else if (choice == 1 && r == 0) {
                rook.MoveForward(eri, x6, y6, steps, 0);
                x6 += steps;
            } else if (choice == 1 && r == 1) {
                c2++;
                rook.MoveForward(eri, x66, y66, steps, 0);
                x66 += steps;
            } else if (choice == 2 && r == 0) {
                rook.MoveDownward(eri, x6, y6, steps, 0);
                x6 -= steps;
            } else if (choice == 2 && r == 1) {
                c2++;
                rook.MoveDownward(eri, x66, y66, steps, 0);
                x66 -= steps;
            } else if (choice == 3 && r == 0) {
                rook.MoveRight(eri, x6, y6, steps, 0);
                y6 += steps;
            } else if (choice == 3 && r == 1) {
                c2++;
                rook.MoveRight(eri, x66, y66, steps, 0);
                y66 += steps;
            }
            //Number of steps
            turns = 1;
            switchPlayer(eri);
        } else if (choose == 6) {
            System.out.println("White King has given up. Black king wins!!!");


            System.exit(0);
        }
        //user guide
        else if (choose == 7) {
            userGuide(eri);
        }
    }

    public void blackTurn(char[][] eri) {

        System.out.println("Please choose another move in chess board=black");
        System.out.println("0:King");
        System.out.println("1:Queen");
        System.out.println("2:Knight");
        System.out.println("3:Bishop");
        System.out.println("4:Pawn");
        System.out.println("5:Rook");
        System.out.println("6:Surrender");

        Random r1 = new Random();
        //Note 2: to test with minimax comment out below and refer Note 2.
        //I was facing testing issue with minimax as the value is passed correctly however it is not represented on the board
        int choose = r1.nextInt(6);

        int value = r1.nextInt(6);
        
       /* Note 2: To play with minimax uncomment below line and comment above
        int choose = AlphaBeta(eri,depth,false,6,0,value);
       */
        System.out.println(choose);
        System.out.println("-------------");


        if (choose == 0) {
            System.out.println("Please choose number of steps");
            int steps = 1;
            System.out.println("Please choose the direction in which you want the king piece to move");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally Downward on the Left");
            System.out.println("3:Move Diagonally Downward on the Right");
            System.out.println("4:Move Forward");
            System.out.println("5:Move Downward");
            System.out.println("6:Move Left");
            System.out.println("7:Move Right");
            System.out.println("8:Do Castling");
            int choice = r1.nextInt(8);

            if (choice == 0) {
                c3++;
                if (steps == 1) {
                    k.MoveDiagonalForwardLEFT(eri, m1, n1, steps, 1);
                    m1 -= steps;
                    n1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 1) {
                c3++;
                if (steps == 1) {
                    k.MoveDiagonalForwardRIGHT(eri, m1, n1, steps, 1);
                    m1 -= steps;
                    n1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 2) {
                c3++;
                if (steps == 1) {
                    k.MoveDiagonalBackwardLEFT(eri, m1, n1, steps, 1);
                    m1 += steps;
                    n1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 3) {
                c3++;
                if (steps == 1) {
                    k.MoveDiagonalBackwardRIGHT(eri, m1, n1, steps, 1);
                    m1 += steps;
                    n1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 4) {
                c3++;
                if (steps == 1) {
                    k.MoveForward(eri, m1, n1, steps, 1);
                    m1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 5) {
                c3++;
                if (steps == 1) {
                    k.MoveDownward(eri, m1, n1, steps, 1);
                    m1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 6) {
                c3++;
                if (steps == 1) {
                    k.MoveLeft(eri, m1, n1, steps, 1);
                    n1 -= steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 7) {
                c3++;
                if (steps == 1) {
                    k.MoveRight(eri, m1, n1, steps, 1);
                    n1 += steps;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            } else if (choice == 8) {
                count11++;
                if (steps == 1 && count11 == 1) {
                    k.Castling(eri, m1, n1, steps, 1, c3, c4);
                    n1 += 2;
                } else {
                    System.out.println("Invalid steps");
                    turns = 1;
                    switchPlayer(eri);
                }
            }
            //System.out.println("-------------");
            //      turns=0;
            //     switchPlayer(eri);

            if (heuristicFunction(eri, x1, y1) == false) {
                //System.out.println("1234567898765432");
                turns = 0;
                switchPlayer(eri);
            } else if (heuristicFunction(eri, x1, y1) == true) {
                System.out.println("heuristicFunction. Black king wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }

        //black queen here

        else if (choose == 1) {
            System.out.println("Please choose number of steps");
            int steps = r1.nextInt(3);

            System.out.println("Please choose the direction in which you want the queen piece to move(black)");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally Downward on the Left");
            System.out.println("3:Move Diagonally Downward on the Right");
            System.out.println("4:Move Forward");
            System.out.println("5:Move Downward");
            System.out.println("6:Move Left");
            System.out.println("7:Move Right");
            int choice = r1.nextInt(7);

            //taking number of steps
            // int steps = input.nextInt();

            if (choice == 0) {
                //System.out.println("How many step you like to take");


                queen.MoveDiagonalForwardLEFT(eri, m2, n2, steps, 1);
                m2 -= steps;
                n2 -= steps;

            } else if (choice == 1) {
                queen.MoveDiagonalForwardRIGHT(eri, m2, n2, steps, 1);
                m2 -= steps;
                n2 += steps;
            } else if (choice == 2) {
                queen.MoveDiagonalBackwardLEFT(eri, m2, n2, steps, 1);
                m2 += steps;
                n2 -= steps;
            } else if (choice == 3) {
                queen.MoveDiagonalBackwardRIGHT(eri, m2, n2, steps, 1);
                m2 += steps;
                n2 += steps;
            } else if (choice == 4) {
                queen.MoveForward(eri, m2, n2, steps, 1);
                m2 -= steps;


            } else if (choice == 5) {
                queen.MoveDownward(eri, m2, n2, steps, 1);
                m2 += steps;

            } else if (choice == 6) {
                queen.MoveLeft(eri, m2, n2, steps, 1);

                n2 -= steps;

            } else if (choice == 7) {
                queen.MoveRight(eri, m2, n2, steps, 1);
                n2 += steps;
            } else {
                System.out.println("Invalid steps");
                turns = 1;
                switchPlayer(eri);
            }

            //turns=0;
            // switchPlayer(eri);
            if (heuristicFunction(eri, x1, y1) == false) {
                // System.out.println("1234567898765432");
                turns = 0;
                switchPlayer(eri);
            } else if (heuristicFunction(eri, x1, y1) == true) {
                System.out.println("heuristicFunction. Black king wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }

        //black knight here

        else if (choose == 2) {
            System.out.println("Please choose number of steps");
            int steps = 3;

            System.out.println("Please decide which rook you want to choose");
            System.out.println("0:Left Black Knight");
            System.out.println("1:Right Black Knight");
            int k = r1.nextInt(1);

            System.out.println("Please choose the direction in which you want the knight piece to move(white)");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally backward on the Left");
            System.out.println("3:Move Diagonally backward on the Right");


            int choice = r1.nextInt(3);

            if (choice == 0 && k == 0) {
                knight.MoveDiagonalForwardLEFT(eri, m3, n3, steps, 1);
                m3 = m3 - 2;
                n3 = n3 - 1;
            }
            if (choice == 0 && k == 1) {
                knight.MoveDiagonalForwardLEFT(eri, m33, n33, steps, 1);
                m33 = m33 - 2;
                n33 = n33 - 1;
            } else if (choice == 1 && k == 0) {
                knight.MoveDiagonalForwardRIGHT(eri, m3, n3, steps, 1);
                m3 = m3 - 2;
                n3 = n3 + 1;
            } else if (choice == 1 && k == 1) {
                knight.MoveDiagonalForwardRIGHT(eri, m33, n33, steps, 1);
                m33 = m33 - 2;
                n33 = n33 + 1;
            } else if (choice == 2 && k == 0) {
                knight.MoveDiagonalBackwardLEFT(eri, m3, n3, steps, 1);
                m3 = m3 + 2;
                n3 = n3 - 1;
            } else if (choice == 2 && k == 1) {
                knight.MoveDiagonalBackwardLEFT(eri, m33, n33, steps, 1);
                m33 = m33 + 2;
                n33 = n33 - 1;
            } else if (choice == 3 && k == 0) {
                knight.MoveDiagonalBackwardRIGHT(eri, m3, n3, steps, 1);
                m3 = m3 + 2;
                n3 = n3 + 1;
            } else if (choice == 3 && k == 1) {
                knight.MoveDiagonalBackwardRIGHT(eri, m33, n33, steps, 1);
                m33 = m33 + 2;
                n33 = n33 + 1;
            }
            //  turns=0;
            //  switchPlayer(eri);
            if (heuristicFunction(eri, x1, y1) == false) {
                // System.out.println("1234567898765432");
                turns = 0;
                switchPlayer(eri);
            } else if (heuristicFunction(eri, x1, y1) == true) {
                System.out.println("heuristicFunction. Black king wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }
        //black bishop
        else if (choose == 3) {
            System.out.println("Please choose number of steps");
            int steps = r1.nextInt(3);

            System.out.println("Please decide which rook you want to choose");
            System.out.println("0:Left Black Bishop");
            System.out.println("1:Right Black Bishop");
            int b = r1.nextInt(1);

            System.out.println("Please choose the direction in which you want the bishop piece to move(white)");
            System.out.println("0:Move Diagonally Forward on the Left");
            System.out.println("1:Move Diagonally Forward on the Right");
            System.out.println("2:Move Diagonally backward on the Left");
            System.out.println("3:Move Diagonally backward on the Right");

            int choice = r1.nextInt(3);

            if (choice == 0 && b == 0) {
                bishop.MoveDiagonalForwardLEFT(eri, m4, n4, steps, 1);
                m4 -= steps;
                n4 -= steps;
            } else if (choice == 0 && b == 1) {
                bishop.MoveDiagonalForwardLEFT(eri, m44, n44, steps, 1);
                m44 -= steps;
                n44 -= steps;
            } else if (choice == 1 && b == 0) {
                bishop.MoveDiagonalForwardRIGHT(eri, m4, n4, steps, 1);
                m4 -= steps;
                n4 += steps;
            } else if (choice == 1 && b == 1) {
                bishop.MoveDiagonalForwardRIGHT(eri, m44, n44, steps, 1);
                m44 -= steps;
                n44 += steps;
            } else if (choice == 2 && b == 0) {
                bishop.MoveDiagonalBackwardLEFT(eri, m4, n4, steps, 1);
                m4 += steps;
                n4 -= steps;
            } else if (choice == 2 && b == 1) {
                bishop.MoveDiagonalBackwardLEFT(eri, m44, n44, steps, 1);
                m44 += steps;
                n44 -= steps;
            } else if (choice == 3 && b == 0) {
                bishop.MoveDiagonalBackwardRIGHT(eri, m4, n4, steps, 1);
                m4 += steps;
                n4 += steps;
            } else if (choice == 3 && b == 1) {
                bishop.MoveDiagonalBackwardRIGHT(eri, m44, n44, steps, 1);
                m44 += steps;
                n44 += steps;
            }

            //  turns=0;
            //  switchPlayer(eri);
            if (heuristicFunction(eri, x1, y1) == false) {
                // System.out.println("1234567898765432");
                turns = 0;
                switchPlayer(eri);
            } else if (heuristicFunction(eri, x1, y1) == true) {
                System.out.println("heuristicFunction. Black king wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }

        //pawn here
        else if (choose == 4) {
            System.out.println("Please choose number of steps");
            int steps = 1;

            System.out.println("Please choose which pawn piece to move(black)");
            System.out.println("1 2 3 4 5 6 7 8");
            int choosePawn = 1 + r1.nextInt(7);

            if (choosePawn == 1) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m51, n51, steps, 1);
                    m51 -= 1;
                    n51 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m51, n51, steps, 1);
                    m51 -= 1;
                    n51 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m51, n51, steps, 1);
                    m51 -= 1;
                    //n5-=1;
                } else if (choice == 3) {
                    countP1++;
                    if (countP1 == 1) {
                        pawn.EnPassant(eri, m51, n51, steps, 1);
                        m51 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }

//            turns=0;
//            switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    // System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("heuristicFunction. Black king wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 2) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m52, n52, steps, 1);
                    m52 -= 1;
                    n52 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m52, n52, steps, 1);
                    m52 -= 1;
                    n52 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m52, n52, steps, 1);
                    m52 -= 1;
                    //n5-=1;
                } else if (choice == 3) {
                    countP2++;
                    if (countP2 == 1) {
                        pawn.EnPassant(eri, m52, n52, steps, 1);
                        m52 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }
//            turns=0;
//            switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    // System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("\"heuristicFunction. Black king wins!!!\"");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 3) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);
                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m53, n53, steps, 1);
                    m53 -= 1;
                    n53 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m53, n53, steps, 1);
                    m53 -= 1;
                    n53 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m53, n53, steps, 1);
                    m53 -= 1;
                    //n5-=1;
                } else if (choice == 3) {
                    countP3++;
                    if (countP3 == 1) {
                        pawn.EnPassant(eri, m53, n53, steps, 1);
                        m53 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }
//            turns=0;
//            switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    //   System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("heuristicFunction. Black king wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 4) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m54, n54, steps, 1);
                    m54 -= 1;
                    n54 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m54, n54, steps, 1);
                    m54 -= 1;
                    n54 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m54, n54, steps, 1);
                    m54 -= 1;
                    //n5-=1;
                } else if (choice == 3) {
                    countP4++;
                    if (countP4 == 1) {
                        pawn.EnPassant(eri, m54, n54, steps, 1);
                        m54 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }
//            turns=0;
//            switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    //   System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("heuristicFunction. Black king wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 5) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m55, n55, steps, 1);
                    m55 -= 1;
                    n55 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m55, n55, steps, 1);
                    m55 -= 1;
                    n55 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m55, n55, steps, 1);
                    m55 -= 1;

                } else if (choice == 3) {
                    countP5++;
                    if (countP5 == 1) {
                        pawn.EnPassant(eri, m55, n55, steps, 1);
                        m55 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }
                // turns=0;
                // switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    // System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("heuristicFunction. Black king wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 6) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m56, n56, steps, 1);
                    m56 -= 1;
                    n56 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m56, n56, steps, 1);
                    m56 -= 1;
                    n56 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m56, n56, steps, 1);
                    m56 -= 1;
                    //n5-=1;
                } else if (choice == 3) {
                    countP6++;
                    if (countP6 == 1) {
                        pawn.EnPassant(eri, m56, n56, steps, 1);
                        m56 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }

                // turns=0;
                // switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    // System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("heuristicFunction. Black king wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 7) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m57, n57, steps, 1);
                    m57 -= 1;
                    n57 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m57, n57, steps, 1);
                    m57 -= 1;
                    n57 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m57, n57, steps, 1);
                    m57 -= 1;
                    //n5-=1;
                } else if (choice == 3) {
                    countP7++;
                    if (countP7 == 1) {
                        pawn.EnPassant(eri, m57, n57, steps, 1);
                        m57 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }

                // turns=0;
                // switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    // System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("heuristicFunction. Black king wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            } else if (choosePawn == 8) {
                System.out.println("Please choose the direction in which you want the pawn piece to move(black)");
                System.out.println("0:Move Diagonally Forward on the Left");
                System.out.println("1:Move Diagonally Forward on the Right");
                System.out.println("2:Move Forward");
                System.out.println("3:Enpassant");


                int choice = r1.nextInt(3);

                if (choice == 0) {
                    pawn.MoveDiagonalForwardLEFT(eri, m58, n58, steps, 1);
                    m58 -= 1;
                    n58 -= 1;
                } else if (choice == 1) {
                    pawn.MoveDiagonalForwardRIGHT(eri, m58, n58, steps, 1);
                    m58 -= 1;
                    n58 += 1;
                } else if (choice == 2) {
                    pawn.MoveForward(eri, m58, n58, steps, 1);
                    m58 -= 1;
                    //n5-=1;
                } else if (choice == 3) {
                    countP8++;
                    if (countP8 == 1) {
                        pawn.EnPassant(eri, m58, n58, steps, 1);
                        m58 -= 2;
                    } else {
                        System.out.println("Invalid Move");
                        turns = 1;
                        switchPlayer(eri);
                    }
                }


                // turns=0;
                // switchPlayer(eri);
                if (heuristicFunction(eri, x1, y1) == false) {
                    // System.out.println("1234567898765432");
                    turns = 0;
                    switchPlayer(eri);
                } else if (heuristicFunction(eri, x1, y1) == true) {
                    System.out.println("heuristicFunction. Black king wins!!!");
                    turns = 2;
                    switchPlayer(eri);
                }
            }

        }

        // Black Rook starts here
        else if (choose == 5) {
            System.out.println("Please choose number of steps");
            int steps = r1.nextInt(3);
            System.out.println("Please decide which rook you want to choose");
            System.out.println("0:Left Black Rook");
            System.out.println("1:Right Black Rook");
            int r = r1.nextInt(1);

            System.out.println("Please choose the direction in which you want the rook piece to move(black)");
            System.out.println("0:Move   Left");
            System.out.println("1:Move  Forward ");
            System.out.println("2:Move  backward ");
            System.out.println("3:Move  Right");
            int choice = r1.nextInt(3);

            if (choice == 0 && r == 0) {
                rook.MoveLeft(eri, m6, n6, steps, 1);
                n6 -= steps;
            } else if (choice == 0 && r == 1) {
                c4++;
                rook.MoveLeft(eri, m66, n66, steps, 1);
                n66 -= steps;
            } else if (choice == 1 && r == 0) {
                rook.MoveForward(eri, m6, n6, steps, 1);
                m6 -= steps;
            } else if (choice == 1 && r == 1) {
                c4++;
                rook.MoveForward(eri, m66, n66, steps, 1);
                m66 -= steps;
            } else if (choice == 2 && r == 0) {
                rook.MoveDownward(eri, m6, n6, steps, 1);
                m6 += steps;
            } else if (choice == 2 && r == 1) {
                c4++;
                rook.MoveDownward(eri, m66, n66, steps, 1);
                m66 += steps;
            } else if (choice == 3 && r == 0) {
                rook.MoveRight(eri, m6, n6, steps, 1);
                n6 += steps;
            } else if (choice == 3 && r == 1) {
                c4++;
                rook.MoveRight(eri, m66, n66, steps, 1);
                n66 += steps;
            }
            System.out.println("-------------");
            //    turns=0;
            //    switchPlayer(eri);
            if (heuristicFunction(eri, x1, y1) == false) {
                // System.out.println("1234567898765432");
                turns = 0;
                switchPlayer(eri);
            } else if (heuristicFunction(eri, x1, y1) == true) {
                System.out.println("heuristicFunction. Black king wins!!!");
                turns = 2;
                switchPlayer(eri);
            }
        }
        if (choose == 6) {
            System.out.println("White King has given up. Black king wins!!!");
//         turns=2;//draw
//         switchPlayer(eri);
            System.exit(0);
        }//user guide
        else if (choose == 7) {
            userGuide(eri);
        }

    }

}