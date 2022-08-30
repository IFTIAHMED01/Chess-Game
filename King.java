package Project;
//Name=IFTI AHMED
//Student ID = 6559348
//COSC-3P71 and Project

//Name=ANWAR HASHMI
//Student ID = 6584957
//COSC-3P71 and Project
public class King {
    public void Castling(char eri[][], int x, int y, int steps, int turns, int a, int b) {
        if (turns == 0) {
            if (a == 0 && b == 0 && eri[0][5] == '-' && eri[0][6] == '-') {
                eri[0][6] = eri[0][4]; //Shifting king 2 units on the right
                eri[0][4] = '-';

                eri[0][5] = eri[0][7];//Shifting rook 2 units on the left
                eri[0][7] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (a == 0 && b == 0 && eri[7][5] == '-' && eri[7][6] == '-') {
                eri[7][6] = eri[7][4]; //Shifting king 2 units on the right
                eri[7][4] = '-';

                eri[7][5] = eri[7][7];//Shifting rook 2 units on the left
                eri[7][7] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public void MoveDiagonalForwardLEFT(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((x + steps) < eri.length && (y - steps) >= 0) && eri[x + steps][y - steps] != 'P' && eri[x + steps][y - steps] != 'R' && eri[x + steps][y - steps] != 'K'
                    && eri[x + steps][y - steps] != 'B' && eri[x + steps][y - steps] != 'Q') {

                eri[x + steps][y - steps] = eri[x][y];
                eri[x][y] = '-';
            }

            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((x - steps) >= 0 && (y - steps) >= 0) && eri[x - steps][y - steps] != 'p' && eri[x - steps][y - steps] != 'r' &&
                    eri[x - steps][y - steps] != 'k' && eri[x - steps][y - steps] != 'b' && eri[x - steps][y - steps] != 'q') {
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

    public void MoveDiagonalForwardRIGHT(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((x + steps) < eri.length && (y + steps) < eri.length) && eri[x + steps][y + steps] != 'P' && eri[x + steps][y + steps] != 'R' && eri[x + steps][y + steps] != 'K' &&
                    eri[x + steps][y + steps] != 'B' && eri[x + steps][y + steps] != 'Q') {
                eri[x + steps][y + steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((x - steps) >= 0 && (y + steps) < eri.length) && eri[x - steps][y + steps] != 'p' && eri[x - steps][y + steps] != 'r' && eri[x - steps][y + steps] != 'k' &&
                    eri[x - steps][y + steps] != 'b' && eri[x - steps][y + steps] != 'q') {
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

    public void MoveDiagonalBackwardLEFT(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((x - steps) >= 0 && (y - steps) >= 0) && eri[x - steps][y - steps] != 'P' && eri[x - steps][y - steps] != 'R' && eri[x - steps][y - steps] != 'K' &&
                    eri[x - steps][y - steps] != 'B' && eri[x - steps][y - steps] != 'Q') {
                eri[x - steps][y - steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((x + steps) < eri.length && (y - steps) >= 0) && eri[x + steps][y - steps] != 'p' && eri[x + steps][y - steps] != 'r' && eri[x + steps][y - steps] != 'k' &&
                    eri[x + steps][y - steps] != 'b' && eri[x + steps][y - steps] != 'q') {
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

    public void MoveDiagonalBackwardRIGHT(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if (((x - steps) >= 0 && (y + steps) < eri.length) && eri[x - steps][y + steps] != 'P' && eri[x - steps][y + steps] != 'R' && eri[x - steps][y + steps] != 'K' &&
                    eri[x - steps][y + steps] != 'B' && eri[x - steps][y + steps] != 'Q') {
                eri[x - steps][y + steps] = eri[x][y];
                eri[x][y] = '-';
            }
            for (int i = 0; i < eri.length; i++) {
                for (int j = 0; j < eri.length; j++) {
                    System.out.print(eri[i][j] + " ");
                }
                System.out.println();
            }
        } else if (turns == 1) {
            if (((x + steps) < eri.length && (y + steps) < eri.length) && eri[x + steps][y + steps] != 'p' && eri[x + steps][y + steps] != 'r' && eri[x + steps][y + steps] != 'k' &&
                    eri[x + steps][y + steps] != 'b' && eri[x + steps][y + steps] != 'q') {
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

    public void MoveForward(char eri[][], int x, int y, int steps, int turns) {
        if (turns == 0) {
            if ((x + steps) < eri.length && eri[x + steps][y] != 'P' && eri[x + steps][y] != 'R' && eri[x + steps][y] != 'K' &&
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
            if ((x - steps) >= 0 && eri[x - steps][y] != 'p' && eri[x - steps][y] != 'r' && eri[x - steps][y] != 'k' &&
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

            if ((x - steps) >= 0 && eri[x - steps][y] != 'P' && eri[x - steps][y] != 'R' && eri[x - steps][y] != 'K' &&
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
            if ((x + steps) < eri.length && eri[x + steps][y] != 'p' && eri[x + steps][y] != 'r' && eri[x + steps][y] != 'k' &&
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
            if ((y - steps) >= 0 && eri[x][y - steps] != 'P' && eri[x][y - steps] != 'R' && eri[x][y - steps] != 'K' &&
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
            if ((y - steps) >= 0 && eri[x][y - steps] != 'p' && eri[x][y - steps] != 'r' && eri[x][y - steps] != 'k' &&
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
            if ((y + steps) < eri.length && eri[x][y + steps] != 'P' && eri[x][y + steps] != 'R' && eri[x][y + steps] != 'K' &&
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
            if ((y + steps) < eri.length && eri[x][y + steps] != 'p' && eri[x][y + steps] != 'r' && eri[x][y + steps] != 'k' && eri[x][y + steps] != 'b' &&
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