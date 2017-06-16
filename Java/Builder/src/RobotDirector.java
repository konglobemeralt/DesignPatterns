/**
 * Created by Jesper on 2017-06-16.
 */
public class RobotDirector {

    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder){

        this.robotBuilder = robotBuilder;

    }

    public Robot getRobot(){

        return this.robotBuilder.getRobot();

    }

    public void makeRobot() {

        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();

    }

}