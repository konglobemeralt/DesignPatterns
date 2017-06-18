/**
 * Created by Jesper on 2017-06-18.
 */
public class ToppingDecorator implements Pizza{

    protected Pizza tempPizza;

    public ToppingDecorator(Pizza newPizza){
        tempPizza = newPizza;
    }

    public String getDescription() {
        return tempPizza.getDescription();
    }

    public double getCost() {
        return tempPizza.getCost();
    }}
