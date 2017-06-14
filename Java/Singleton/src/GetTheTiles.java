import java.util.LinkedList;
import java.util.concurrent.RunnableFuture;

/**
 * Created by Jesper on 2017-06-14.
 */
public class GetTheTiles implements Runnable {

        public void run(){

            Singleton newInstance = Singleton.getInstance();

            System.out.println("1st Instance ID: " + System.identityHashCode(newInstance));
            System.out.println(newInstance.getLetterList());

            LinkedList<String> playerOneTiles = newInstance.getTiles(7);

            System.out.println("Player 1: " + playerOneTiles);
            System.out.println("Got Tiles");
        }
}
