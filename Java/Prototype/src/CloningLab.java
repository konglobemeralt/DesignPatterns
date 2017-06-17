/**
 * Created by Jesper on 2017-06-17.
 */
public class CloningLab {
    //Gets a class that implements animal interface, makes a copy
    //and stores it in memory

    public Animal getClone(Animal animalSample){
        return animalSample.makeCopy();
    }
}
