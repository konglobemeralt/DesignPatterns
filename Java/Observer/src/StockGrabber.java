import java.util.ArrayList;

/**
 * Created by Jesper on 2017-06-11.
 */
public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplePrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        //observers.remove(deleteObserver);
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");

        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {

        for(Observer observer: observers){
            observer.update(ibmPrice, aaplePrice, googPrice);
        }

    }

    public void setIBMPrice(double newIBMprice){
        this.ibmPrice = newIBMprice;
        notifyObserver();
    }

    public void setAAPLPrice(double newAAPLPrice){
        this.aaplePrice = newAAPLPrice;
        notifyObserver();
    }

    public void setGOOGPrice(double newGOOGPrice){
        this.googPrice = newGOOGPrice;
        notifyObserver();
    }

}
