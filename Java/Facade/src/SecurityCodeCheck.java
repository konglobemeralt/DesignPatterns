/**
 * Created by konglobemeralt on 2017-06-23.
 */
public class SecurityCodeCheck {

    private int securitCode = 1234;

    public int getSecuritCode() {return securitCode;}

    public boolean isCodeCorrect(int codeToCheck){
        if(codeToCheck == getSecuritCode()){
            return true;
        }
        else{
            return false;}
    }
}
