/**
 * Created by Jesper on 2017-06-17.
 */
public class TestCloning {

    public static void main(String[] args){

        CloningLab animalCloner = new CloningLab();

        Sheep sally = new Sheep();

        Sheep clonedSheep = (Sheep) animalCloner.getClone(sally);

        System.out.println(sally);
        System.out.println(clonedSheep);

        System.out.println("Sally hashcode: " + System.identityHashCode(sally));
        System.out.println("Cloned hashcode: " + System.identityHashCode(clonedSheep));
    }
}
