import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.Scanner;

public class GameBoard {

    final private int START = 1;
    final private int FINISH = 2;
    final private int MINE = 3;
    final private int BATTLE_STATION = 4;
    final private int EMPTY_SPACE = 0;

    int width;
    int height;
    int[][] gameBoard;

    public GameBoard() {

        width = 6;
        height = 6;
        gameBoard = new int[width][height];

    }
    /*public int[] getGameBoardDimensions() {

        String[] dimensionIdCollection;
        String dimensionId;
        int dimensionValue;
        File fileReference                 = new File("resources/DimensionsOfBoard");
        try {
            FileReader fileReferenceReader = new FileReader(fileReference);
            BufferedReader bufferedReader  = new BufferedReader(fileReferenceReader);

            String lineReference;

            while((lineReference = bufferedReader.readLine()) != null) {

                dimensionIdCollection        = lineReference.split("=");
                dimensionId    = dimensionIdCollection[0];
                dimensionValue = Integer.parseInt(dimensionIdCollection[1]);
                
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dimensionValuesCollection;
    }
*/


    public void setStartingValues(int[][] gameBoard) {

        gameBoard[0][0] = FINISH;
        gameBoard[5][5] = START;

    }

    public void loadGameBoard(int[][] gameBoard) {
        Mine mine = new Mine();
        for (int i = 0; i < gameBoard.length; i++) {

            for (int j = 0; j < gameBoard[i].length; j++) {

                if (gameBoard[i][j] == EMPTY_SPACE) {
                    if (j != gameBoard[i].length - 1) {
                        System.out.print('X' + " - ");
                    } else {
                        System.out.print('X');
                    }
                }
                if (gameBoard[i][j] == START) {
                    if (j != gameBoard[i].length - 1) {
                        System.out.print('S' + " - ");
                    } else {
                        System.out.print('S');
                    }
                }
                if (gameBoard[i][j] == FINISH) {
                    if (j != gameBoard[i].length - 1) {
                        System.out.print('F' + " - ");
                    } else {
                        System.out.print('F');
                    }
                }
                if (gameBoard[i][j] == MINE) {
                    if(mine.isMinesVissable()) {

                        if (j != gameBoard[i].length - 1) {
                            System.out.print('Y' + " - ");
                        } else {
                            System.out.print('Y');
                        }
                    } else {
                        if (j != gameBoard[i].length - 1) {
                            System.out.print('X' + " - ");
                        } else {
                            System.out.print('X');
                        }
                    }
                }
                if (gameBoard[i][j] == BATTLE_STATION) {
                    if (j != gameBoard[i].length - 1) {
                        System.out.print('*' + " - ");
                    } else {
                        System.out.print('*');
                    }

                }
            }
            System.out.println();
        }
    }


    public void printTurnMenu() {

        System.out.println("Press 1 to check for mine");
        System.out.println("Press 2 to defuse a mine");
        System.out.println("Press 3 to move the battle station");
    }



}



