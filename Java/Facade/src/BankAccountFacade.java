/**
 * Created by konglobemeralt on 2017-06-23.
 */
public class BankAccountFacade {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck accountChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck  fundsChecker;

    WelcomeToBank bankWelcome;

    public BankAccountFacade(int newAcctNum, int newSecCode){
        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new WelcomeToBank();
        accountChecker = new AccountNumberCheck();
        codeChecker = new SecurityCodeCheck();
        fundsChecker = new FundsCheck();
    }


    public int getAccountNumber(){return accountNumber;}
    public int getSecurityCode(){return securityCode;}


    public void withdrawCash(double cashToGet){
        if(accountChecker.accountActive(getAccountNumber())
                && codeChecker.isCodeCorrect(getSecurityCode())
                && fundsChecker.haveEnoughMoney(cashToGet)){

            System.out.println("Transaction complete!");
        }
        else{
            System.out.println("Transaction failed");
        }
    }

    public void depositCash(double cashToDeposit){
        if(accountChecker.accountActive(getAccountNumber())
            && codeChecker.isCodeCorrect(getSecurityCode())){

            fundsChecker.makeDeposit(cashToDeposit);

            System.out.println("Transaction complete!");
        }
        else{
            System.out.println("Transaction failed");
        }
    }

}
