/**
 * Created by Jesper on 2017-06-11.
 */
public class GrabStocks {

    public static void main(String[] args){

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);
        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(237.00);
        stockGrabber.setGOOGPrice(567.00);


        stockGrabber.unregister(observer1);

        stockGrabber.setIBMPrice(222.00);
        stockGrabber.setAAPLPrice(233.00);
        stockGrabber.setGOOGPrice(222.00);



    }

}
