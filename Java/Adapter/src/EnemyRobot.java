import java.util.Random;

/**
 * Created by Jesper on 2017-06-21.
 */
public class EnemyRobot {

    Random generator = new Random();

    public void smashWithHands(){
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot Causes " + attackDamage + " Damage with its hands");
    }

    public void walkForward(){
        int movement = generator.nextInt(10) + 1;

        System.out.println("Enemy Robot moves " + movement + " units forward");
    }

    public void reactToHuman(String driverName){
        System.out.println("Trample " + driverName);
    }



}
