import java.util.Scanner;

/**
 * Created by Jesper on 2017-06-12.
 */
public class EnemyShipTesting {

    public static void main(String[] args){
        EnemyShip theEnemy = null;



        doStuffEnemy(theEnemy);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }
}
