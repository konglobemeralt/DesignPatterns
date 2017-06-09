/**
 * Created by Jesper on 2017-06-09.
 */
public class Dog extends Animal {

    public void digHole(){
        System.out.println("Dug a Hole");
    }

    public Dog(){
        super();
        setSound("Bark");
    }

}
