
import java.io.IOException;
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


    public static void main(String[] args) throws IOException {
        boolean kingnotdead = true;
        boolean isGameRunning = true;
        int row = 0;
        int col = 0;
        double[][] newGameboard = new double[0][];
        double[][] gameBoard = new double[SIZE_OF_BOARD][SIZE_OF_BOARD];
        int currentPlayerId = 1;

        Scanner scanner = new Scanner(System.in);
        while (isGameRunning) {
            setStartingValues(gameBoard);
            renderPiecesToBoard(gameBoard);
            while (kingnotdead) {
                getCurrentPlayerId(currentPlayerId);
                turnDetermination(currentPlayerId);
                selectedPieceToMove(currentPlayerId);
                nextMovePosition(gameBoard);
                while(!isMovePossible(gameBoard, row, col)) {
                    continue;
                }
                moveApplyer(gameBoard, row, col, currentPlayerId);
                renderPiecesToBoard(gameBoard);
                currentPlayerId++;
                continue;
            }
            break;
        }
    }


    public static double selectedPieceToMove(int currentPlayerId) {

        String selectedPiece;
        double selectedPieceId = 0;

        if (currentPlayerId == 1) {

            for (int i = 0; i < 100; i++) {
                System.out.println("Select witch piece to move");
                Scanner scanner = new Scanner(System.in);
                selectedPiece = scanner.nextLine();

                if (selectedPiece.equals("wDw")) {
                    selectedPieceId = 1.1;
                    break;
                } else if (selectedPiece.equals("wM")) {
                    selectedPieceId = 1.2;
                    break;
                } else if (selectedPiece.equals("wD")) {
                    selectedPieceId = 1.3;
                    break;
                } else if (selectedPiece.equals("wK")) {
                    selectedPieceId = 1.4;
                    break;
                } else if (selectedPiece.equals("wQ")) {
                    selectedPieceId = 1.5;
                    break;
                } else {
                    System.out.println("Invalid input");
                    continue;
                }
            }

        } else {

            for (int i = 0; i < 100; i++) {
                System.out.println("Select witch piece to move");
                Scanner scanner = new Scanner(System.in);
                selectedPiece = scanner.nextLine();

                if (selectedPiece.equals("bDw")) {
                    selectedPieceId = 2.1;
                    break;
                } else if (selectedPiece.equals("bM")) {
                    selectedPieceId = 2.2;
                    break;
                } else if (selectedPiece.equals("bD")) {
                    selectedPieceId = 2.3;
                    break;
                } else if (selectedPiece.equals("bK")) {
                    selectedPieceId = 2.4;
                    break;
                } else if (selectedPiece.equals("bQ")) {
                    selectedPieceId = 2.5;
                    break;
                }
                System.out.println("Invalid input");
                continue;
            }
        }
        return selectedPieceId;
    }


    public static void moveApplyer(double[][] gameBoard, int row, int col, int currentPlayerId) {

        gameBoard[row][col] = selectedPieceToMove(currentPlayerId);
    }

    public static double nextMovePosition(double[][] gameBoard) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row");
        int row = scanner.nextInt();
        System.out.println("Enter col");
        int col = scanner.nextInt();
        double g = gameBoard[row][col];
        return g;
    }

    public static boolean isMovePossible(double[][] gameBoard, int row, int col) {

        if (nextMovePosition(gameBoard) == 0) {
            return true;
        }
        System.out.println("There is a piece over there, try again");
        return false;

    }

    public static int getCurrentPlayerId (int currentPlayerId) {
        if (currentPlayerId % 2 == 0) {
            return BLACK_PLAYER_ID;
        }
        return WHITE_PLAYER_ID;
    }

    public static void turnDetermination(int currentPlayerId) {

        if (getCurrentPlayerId(currentPlayerId) % 2 == 0) {

            System.out.println("Black player's turn");
        } else {
            System.out.println("White player's turn");
        }
    }

    public static void setStartingValues(double [][] gameBoard) {

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
    }

    public static void renderPiecesToBoard(double[][]  gameBoard) {

        System.out.println("========================");

        for (int row = 0; row < gameBoard.length; row++) {


            for (int col = 0; col < gameBoard.length; col++) {
                if (gameBoard[row][col] == 1.1) {
                    System.out.print("wDw ");
                } else if (gameBoard[row][col] == 1.2) {
                    System.out.print("wM  ");
                } else if (gameBoard[row][col] == 1.3) {
                    System.out.print("wD  ");
                } else if (gameBoard[row][col] == 1.4) {
                    System.out.print("wK  ");
                } else if (gameBoard[row][col] == 1.5) {
                    System.out.print("wQ  ");
                } else if (gameBoard[row][col] == 2.1) {
                    System.out.print("bDw ");
                } else if (gameBoard[row][col] == 2.2) {
                    System.out.print("bM  ");
                } else if (gameBoard[row][col] == 2.3) {
                    System.out.print("bD  ");
                } else if (gameBoard[row][col] == 2.4) {
                    System.out.print("bK  ");
                } else if (gameBoard[row][col] == 2.5) {
                    System.out.print("bQ  ");
                } else {
                    System.out.print("X   ");
                }
            }
            System.out.println();
            System.out.println("========================");
        }
    }


}

