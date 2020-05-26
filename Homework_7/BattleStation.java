import java.util.ArrayList;
import java.util.Scanner;

public class BattleStation {

    public void setStartingPos(int[][] gameBoard) {

        gameBoard[5][5] = 4;
    }

    public ArrayList<Integer> getBattleStationPos(int[][] gameBoard) {
        int row = 0;
        int col = 0;
        ArrayList<Integer> battleStationPos = new ArrayList<>();
        for(int i = 0; i < gameBoard.length; i++) {

            for(int j = 0; j < gameBoard[i].length; j++) {

                if(gameBoard[i][j] == 4) {

                    i = row;
                    j = col;
                    battleStationPos.add(row);
                    battleStationPos.add(col);

                }
            }
        }
        return battleStationPos;
    }

    public ArrayList<Integer> getNextMove(Scanner scanner) {
        ArrayList<Integer> nextMove = new ArrayList<>();
        System.out.println("Enter row");
        int row = scanner.nextInt();
        System.out.println("Enter col");
        int col = scanner.nextInt();
        nextMove.add(row);
        nextMove.add(col);

        return nextMove;
    }



    public boolean isMoveValid(Scanner scanner, int[][] gameBoard) {
        GameBoard game = new GameBoard();
        int currentRow = getBattleStationPos(gameBoard).get(0);
        int currentCol = getBattleStationPos(gameBoard).get(1);
        int nextRow    = getNextMove(scanner).get(0);
        int nextCol    = getNextMove(scanner).get(1);

        if((nextRow == currentRow && nextCol == currentCol) || (nextRow > 6 || nextCol > 6)) {
            return false;
        }
        return true;

    }
}
