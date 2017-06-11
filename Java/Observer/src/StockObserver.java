/**
 * Created by Jesper on 2017-06-11.
 */
public class StockObserver implements Observer{

    private double ibmPrice;
    private double aaplePrice;
    private double googPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New observer " + this.observerID);

        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplePrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplePrice = aaplePrice;
        this.googPrice = googPrice;

        printThePrices();
    }

    public void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " + aaplePrice + "\nGOOG: " + googPrice + "\n" );
    }
}
