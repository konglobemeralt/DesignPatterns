/**
 * Created by konglobemeralt on 2017-06-23.
 */
public class AccountNumberCheck {
    private int accountNumber = 1234567;

    public int getAccountNumber() {return accountNumber;}

    public boolean accountActive(int accNumToCheck){
        if(accNumToCheck == getAccountNumber()){
            return true;
        }
        else{
            return false;}
    }
}
