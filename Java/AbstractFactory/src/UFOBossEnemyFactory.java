/**
 * Created by Jesper on 2017-06-13.
 */
// This factory uses the EnemyShipFactory interface
// to create very specific UFOShittyRocketEnemy Enemy Ship

// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being ESWeapon and ESEngine

// The returned object specifies a specific weapon & engine

public class UFOBossEnemyFactory implements EnemyShipFactory{

    // Defines the weapon object to associate with the ship

    public ESWeapon addESGun() {
        return new ESUFOBossGun(); // Specific to Boss UFOShittyRocketEnemy
    }

    // Defines the engine object to associate with the ship

    public ESEngine addESEngine() {
        return new ESUFOBossEngine(); // Specific to Boss UFOShittyRocketEnemy
    }

}
