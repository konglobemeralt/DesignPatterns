import java.awt.*;
import java.util.Scanner;

/**
 * Created by Jesper on 2017-06-12.
 */
public class EnemyShipTesting {

    public static void main(String[] args){
        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter U, R or B");
        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = enemyShipFactory.makeEnemyShip(typeOfShip);
        }

        if(theEnemy != null){
            doStuffEnemy(theEnemy);
        }
        else{
            System.out.println("Enter U, R or B next time...");
        }

    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }
}
