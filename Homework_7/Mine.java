import java.util.Random;

public class Mine {

    int Row;
    int Col;



    public void spawnMines(int[][] gameBoard) {
        Random rand = new Random();
        int numberOfMinesNumber = rand.nextInt((10 - 5) + 1) + 5;

        for(int i = 0; i < numberOfMinesNumber + 1; i++) {

            int randomIndexOfCol = rand.nextInt((5 - 0) + 1) + 0;
            int randomIndexOfRow = rand.nextInt((5 - 0) + 1) + 0;



            gameBoard[randomIndexOfRow][randomIndexOfCol] = 3;

        }






    }

}
