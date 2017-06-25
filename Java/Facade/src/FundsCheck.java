/**
 * Created by konglobemeralt on 2017-06-23.
 */
public class FundsCheck {

    private double cashInAccount = 1000.0;

    public double getCashInAccount() {return cashInAccount;}

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdraw){

        if(cashToWithdraw > getCashInAccount()){
            System.out.println("You do not have enough money!");
            System.out.println("Your balance is: " + getCashInAccount());

            return false;
        }
        else{
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdrawal complete!");
            System.out.println("Your balance is now: " + getCashInAccount());

            return true;
        }
    }

    public void makeDeposit(double cashToDeposit){
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit complete!");
        System.out.println("Your balance is now: " + getCashInAccount());
    }
}
