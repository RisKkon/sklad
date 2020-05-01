import java.util.Scanner;

public class Game {





    static final int SIZE_OF_BOARD = 6;
    static final int BLACK_PLAYER_ID = 2;
    static final int WHITE_PLAYER_ID = 1;

    static final double wDwarf = 1.1;
    static final double wMachineGun = 1.2;
    static final double wDonkey = 1.3;
    static final double wKing = 1.4;
    static final double wQueen = 1.5;

    static final double bDwarf = 2.1;
    static final double bMachineGun = 2.2;
    static final double bDonkey = 2.3;
    static final double bKing = 2.4;
    static final double bQueen = 2.5;



    public static void main(String[] args) {

        boolean isGameRunning = true;
        double[][] gameBoard = new double[SIZE_OF_BOARD][SIZE_OF_BOARD];
        int currentPlayerId = 1;

        Scanner scanner = new Scanner(System.in);
       while(isGameRunning) {


           gameBoard[0] [0] = wDwarf;
           gameBoard[0] [1] = wMachineGun;
           gameBoard[0] [2] = wDonkey;
           gameBoard[0] [3] = wKing;
           gameBoard[0] [4] = wQueen;
           gameBoard[0] [5] = wDwarf;
           gameBoard[5] [0] = bDwarf;
           gameBoard[5] [1] = bMachineGun;
           gameBoard[5] [2] = bDonkey;
           gameBoard[5] [3] = bKing;
           gameBoard[5] [4] = bQueen;
           gameBoard[5] [5] = bDwarf;
           printGameBoard(gameBoard);

           continue;
       }
    }


    public static void printGameBoard(double[][] gameBoard) {

        for (int row = 0; row < SIZE_OF_BOARD; row++) {
            for (int col = 0; col < SIZE_OF_BOARD; col++) {
                System.out.print(printPiecesToBoard(gameBoard));
            }
            System.out.println();
        }
    }






        public static double getCurrentPlayerId (int currentId) {

        return (currentId == WHITE_PLAYER_ID) ? BLACK_PLAYER_ID :
                                                WHITE_PLAYER_ID;
    }

    public static String printPiecesToBoard(double[][] gameBoard) {
        for (int row = 0; row < SIZE_OF_BOARD; row++) {

            for (int col = 0; col < SIZE_OF_BOARD; col++ ) {
                if (gameBoard[row][col] == 1.1) return "wDw ";
                if (gameBoard[row][col] == 1.2) return "wM  ";
                if (gameBoard[row][col] == 1.3) return "wD  ";
                if (gameBoard[row][col] == 1.4) return "wK  ";
                if (gameBoard[row][col] == 1.5) return "wQ  ";
                if (gameBoard[row][col] == 2.1) return "dWd  ";
                if (gameBoard[row][col] == 2.2) return "dM  ";
                if (gameBoard[row][col] == 2.3) return "dD  ";
                if (gameBoard[row][col] == 2.4) return "dK  ";
                if (gameBoard[row][col] == 2.5) return "dQ  ";
            }
        }
        return "X";
    }
}

