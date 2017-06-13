/**
 * Created by Jesper on 2017-06-13.
 */
// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build

public class UFOEnemyShipBuilding extends EnemyShipBuilding {

    protected EnemyShip makeEnemyShip(String typeOfShip) {
        EnemyShip theEnemyShip = null;

        // If UFOShittyRocketEnemy was sent grab use the factory that knows
        // what types of weapons and engines a regular UFOShittyRocketEnemy
        // needs. The EnemyShip object is returned & given a name

        if(typeOfShip.equals("UFO")){
            EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
            theEnemyShip = new UFOEnemyShip(shipPartsFactory);
            theEnemyShip.setName("UFO Grunt Ship");

        } else

            // If UFOShittyRocketEnemy BOSS was sent grab use the factory that knows
            // what types of weapons and engines a Boss UFOShittyRocketEnemy
            // needs. The EnemyShip object is returned & given a name

            if(typeOfShip.equals("UFO BOSS")){
                EnemyShipFactory shipPartsFactory = new UFOBossEnemyFactory();
                theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                theEnemyShip.setName("UFO Boss Ship");

            }
            else

                // If Shitty Rocket was sent grab use the factory that knows
                // what types of weapons and engines a Boss UFOShittyRocketEnemy
                // needs. The EnemyShip object is returned & given a name

                if(typeOfShip.equals("SHITTY ROCKET")){
                    EnemyShipFactory shipPartsFactory = new UFOBossEnemyFactory();
                    theEnemyShip = new UFOBossEnemyShip(shipPartsFactory);
                    theEnemyShip.setName("Shitty Rocket Ship");

                }

        return theEnemyShip;
    }
}
