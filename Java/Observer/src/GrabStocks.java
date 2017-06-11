/**
 * Created by Jesper on 2017-06-11.
 */
public class GrabStocks {

    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(237.00);
        stockGrabber.setGOOGPrice(567.00);

    }

}
