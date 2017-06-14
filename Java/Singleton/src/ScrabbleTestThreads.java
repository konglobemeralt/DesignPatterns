/**
 * Created by Jesper on 2017-06-14.
 */
public class ScrabbleTestThreads {

    public static void main(String[] args){
        Runnable getTiles = new GetTheTiles();
        Runnable getTilesAgain = new GetTheTiles();

        new Thread(getTiles).start();

        new Thread(getTilesAgain).start();

    }

}
