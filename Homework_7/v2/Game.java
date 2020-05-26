import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mine mine = new Mine();
        GameBoard game = new GameBoard();
        BattleStation battleStation = new BattleStation();
        int[][] gameBoard = new int[6][6];
        int userInput;
        boolean isgameRunning = true;
        ArrayList<Integer> nextmove = new ArrayList<>();

        System.out.println("Welcome to the game.");

        game.setStartingValues(gameBoard);
        mine.spawnMines(gameBoard);
        game.loadGameBoard(gameBoard);
        System.out.println("Press 1 to start the game");
        userInput = scanner.nextInt();
        while(userInput != 1) {
            System.out.println("Invalid input, try again");
            userInput = scanner.nextInt();
        }
        battleStation.setStartingPos(gameBoard);
        while (isgameRunning) {
            game.loadGameBoard(gameBoard);
            game.printTurnMenu();
            userInput = scanner.nextInt();
            if(userInput == 1) {


            }


            if(userInput == 3) {
                System.out.println("Enter row");
                int row = scanner.nextInt();
                nextmove.add(row);
                System.out.println("Enter col");
                int col = scanner.nextInt();
                nextmove.add(col);
                if(!battleStation.isMoveValid(gameBoard, nextmove)) {

                    System.out.println("Invalid input, try again");
                    continue;
                }
                battleStation.moveApplyer(nextmove, gameBoard);

                game.loadGameBoard(gameBoard);
            }

        }

        System.out.println();
    }

}

