import java.util.ArrayList;


public class BattleStation {

    public void setStartingPos(int[][] gameBoard) {

        gameBoard[5][5] = 4;
    }

    public ArrayList<Integer> getBattleStationPos(int[][] gameBoard) {
        ArrayList<Integer> battleStationPos = new ArrayList<>();
        for(int i = 0; i < gameBoard.length; i++) {

            for(int j = 0; j < gameBoard[i].length; j++) {

                if(gameBoard[i][j] == 4) {

                    battleStationPos.add(i);
                    battleStationPos.add(j);

                }
            }
        }
        return battleStationPos;
    }





    public boolean isMoveValid(int[][] gameBoard, ArrayList<Integer> nextMove) {
        boolean bool = false;
        int currentCol = getBattleStationPos(gameBoard).get(0);
        int currentRow = getBattleStationPos(gameBoard).get(1);
        int nextRow    = nextMove.get(0);
        int nextCol    = nextMove.get(1);

        if(currentRow == 0 && currentCol == 0) {

            if(nextCol == 1 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 1) {
                bool = true;
            }
        }

        if(currentRow == 0 && currentCol == 1) {

            if(nextCol == 2 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 1) {
                bool = true;
            }
        }
        if(currentRow == 0 && currentCol == 2) {

            if(nextCol == 3 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 1) {
                bool = true;
            }
        }
        if(currentRow == 0 && currentCol == 3) {

            if(nextCol == 2 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 0 ) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 1) {
                bool = true;
            }
        }
        if(currentRow == 0 && currentCol == 4) {

            if(nextCol == 5 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 0) {
                bool = true;
            }
        }
        if(currentRow == 0 && currentCol == 5) {

            if(nextCol == 4 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 5) {
                bool = true;
            }

        }

        if(currentRow == 1 && currentCol == 0) {

            if(nextCol == 1 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 2) {
                bool = true;
            }
        }
        if(currentRow == 1 && currentCol == 1) {

            if(nextCol == 2 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 2) {
                bool = true;
            }

        }
        if(currentRow == 1 && currentCol == 2) {

            if(nextCol == 2 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 2) {
                bool = true;
            }

        }
        if(currentRow == 1 && currentCol == 3) {

            if(nextCol == 3 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 1) {
                bool = true;
            }

        }
        if(currentRow == 1 && currentCol == 4) {

            if(nextCol == 4 && nextRow == 0) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 5 && nextRow == 1) {
                bool = true;
            }

        }
        if(currentRow == 1 && currentCol == 5) {

            if (nextCol == 5 && nextRow == 0) {
                bool = true;
            }
            if (nextCol == 4 && nextRow == 1) {
                bool = true;
            }
            if (nextCol == 5 && nextRow == 2) {
                bool = true;
            }

        }
        if(currentRow == 2 && currentCol == 0) {

            if(nextCol == 1 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 1) {
                bool = true;
            }

        }
        if(currentRow == 2 && currentCol == 1) {

            if(nextCol == 0 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 2 && currentCol == 2) {

            if(nextCol == 1 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 2) {
                bool = true;
            }

        }
        if(currentRow == 2 && currentCol == 3) {

            if(nextCol == 2 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 2 && currentCol == 4) {

            if(nextCol == 5 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 2 && currentCol == 5) {

            if(nextCol == 5 && nextRow == 1) {
                bool = true;
            }
            if(nextCol == 5 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 2) {
                bool = true;
            }

        }
        if(currentRow == 3 && currentCol == 0) {

            if(nextCol == 0 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 3 && currentCol == 1) {

            if(nextCol == 1 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 3 && currentCol == 2) {

            if(nextCol == 2 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 3 && currentCol == 3) {

            if(nextCol == 2 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 3 && currentCol == 4) {

            if(nextCol == 4 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 5 && nextRow == 3) {
                bool = true;
            }

        }
        if(currentRow == 3 && currentCol == 5) {

            if(nextCol == 5 && nextRow == 2) {
                bool = true;
            }
            if(nextCol == 5 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 3) {
                bool = true;
            }
        }
        if(currentRow == 4 && currentCol == 0) {

            if(nextCol == 0 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 0 && nextRow == 5) {
                bool = true;
            }
        }
        if(currentRow == 4 && currentCol == 1) {

            if(nextCol == 0 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 5) {
                bool = true;
            }

        }
        if(currentRow == 4 && currentCol == 2) {

            if(nextCol == 2 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 5) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 4) {
                bool = true;
            }

        }
        if(currentRow == 4 && currentCol == 3) {

            if(nextCol == 3 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 5) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 4) {
                bool = true;
            }

        }
        if(currentRow == 4 && currentCol == 4) {

            if(nextCol == 3 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 5 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 5) {
                bool = true;
            }

        }
        if(currentRow == 4 && currentCol == 5) {

            if(nextCol == 5 && nextRow == 3) {
                bool = true;
            }
            if(nextCol == 5 && nextRow == 5) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 4) {
                bool = true;
            }

        }
        if(currentRow == 5 && currentCol == 0) {

            if(nextCol == 0 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 5) {
                bool = true;
            }

        }
        if(currentRow == 5 && currentCol == 1) {

            if(nextCol == 0 && nextRow == 5) {
                bool = true;
            }
            if(nextCol == 1 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 5) {
                bool = true;
            }
        }
        if(currentRow == 5 && currentCol == 2) {

            if(nextCol == 1 && nextRow == 5) {
                bool = true;
            }
            if(nextCol == 2 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 5) {
                bool = true;
            }
        }
        if(currentRow == 5 && currentCol == 3) {

            if(nextCol == 2 && nextRow == 5) {
                bool = true;
            }
            if(nextCol == 3 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 5) {
                bool = true;
            }
        }
        if(currentRow == 5 && currentCol == 4) {

            if(nextCol == 3 && nextRow == 5) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 5 && nextRow == 5) {
                bool = true;
            }
        }
        if(currentRow == 5 && currentCol == 5) {

            if(nextCol == 5 && nextRow == 4) {
                bool = true;
            }
            if(nextCol == 4 && nextRow == 5) {
                bool = true;
            }
        }

        return bool;
    }

    public void moveApplyer(ArrayList<Integer> nextMove, int[][] gameBoard) {


        int nextRow = nextMove.get(0);
        int nextCol = nextMove.get(1);

        gameBoard[nextRow][nextCol] = 4;
    }
}
