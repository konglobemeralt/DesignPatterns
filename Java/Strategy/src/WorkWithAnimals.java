/**
 * Created by Jesper on 2017-06-09.
 */
public class WorkWithAnimals {

    public static void main(String[] args){

        Animal sparky = new Dog(); // RIP SPARKY

        Animal tweety = new Bird();

        FighterJet mrfightoPlane = new FighterJet();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());
        System.out.println("Jet Fighter: " + mrfightoPlane.tryToFly());


    }


}
