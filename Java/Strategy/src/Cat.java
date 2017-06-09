/**
 * Created by Jesper on 2017-06-09.
 */
public class Cat extends Animal {


    public Cat(){
        super();
        setSound("Mjao");

        flyingType = new CantFly();
    }

}

