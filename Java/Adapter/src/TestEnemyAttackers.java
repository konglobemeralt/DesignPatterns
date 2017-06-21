/**
 * Created by Jesper on 2017-06-21.
 */
public class TestEnemyAttackers {
    public static void main(String[] args){

        EnemyTank tankyTank = new EnemyTank();

        EnemyRobot ironGiant = new EnemyRobot();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(ironGiant);

        System.out.println("The Robot");

        ironGiant.reactToHuman("Paul");
        ironGiant.walkForward();
        ironGiant.smashWithHands();
        System.out.println();

        System.out.println("The Enemy Tank");

        tankyTank.assignDriver("Frank");
        tankyTank.driveForward();
        tankyTank.fireWeapon();
        System.out.println();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }
}
