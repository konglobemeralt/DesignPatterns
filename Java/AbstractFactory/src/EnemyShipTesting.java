/**
 * Created by Jesper on 2017-06-13.
 */
public class EnemyShipTesting {

    public static void main(String[] args) {

        // EnemyShipBuilding handles orders for new EnemyShips
        // Send it a code using the orderTheShip method and
        // it sends the order to the right factory for creation

        EnemyShipBuilding MakeUFOs = new UFOEnemyShipBuilding();

        EnemyShip theGrunt = MakeUFOs.orderTheShip("UFO");
        System.out.println(theGrunt + "\n");

        EnemyShip theShittyRocket = MakeUFOs.orderTheShip("Shitty Rocket");
        System.out.println(theGrunt + "\n");

        EnemyShip theBoss = MakeUFOs.orderTheShip("UFO BOSS");
        System.out.println(theBoss + "\n");

    }

}