/**
 * Created by Jesper on 2017-06-12.
 */
public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String newShipType){
        EnemyShip newShip = null;

        if(newShipType.equals("U")){
            return new UFOEnemyShip();
        }
        else
            if (newShipType.equals("R")){
            return new RocketEnemyShip();
        }
        else
            if (newShipType.equals("B")){
            return new BigEnemyUFOShip();
        }else
            return null;
    }
}
