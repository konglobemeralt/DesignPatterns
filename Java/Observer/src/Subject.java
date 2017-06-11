
/**
 * Created by Jesper on 2017-06-11.
 */
public interface Subject {

    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();

}
