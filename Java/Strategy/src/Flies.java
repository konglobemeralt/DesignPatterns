/**
 * Created by Jesper on 2017-06-09.
 */
public interface Flies {

    String fly();
}

class Flying implements Flies{

    public String fly() {
        return "Flying so fucking high";
    }
}

class CantFly implements Flies{

    public String fly() {
        return "This animal can't fly";
    }
}
