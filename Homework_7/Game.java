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
                battleStation.getNextMove(scanner);
                while(!battleStation.isMoveValid(scanner, gameBoard)) {
                    System.out.println("Invalid input, try again");
                }
            }





        }

        System.out.println();
    }


}

