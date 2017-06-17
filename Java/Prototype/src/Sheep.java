/**
 * Created by Jesper on 2017-06-17.
 */
public class Sheep implements Animal {
    public Sheep(){
        System.out.println("Sheep is created");
    }

    public Animal makeCopy(){
        System.out.println("Sheep is beeing Created through copy");
        Sheep sheepObject = null;

        try{
            //Calls super and casts to sheep
            sheepObject = (Sheep) super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("The sheep tragically was turned to mush...");
            e.printStackTrace();
        }
        return sheepObject;
    }

    public String toString(){
        return "Dolly is my name, eating grass is the game. Baaaaaaaa";
    }
}
