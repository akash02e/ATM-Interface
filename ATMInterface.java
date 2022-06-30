package  ATM;
public class ATMInterface {
    private double balancedata;
    private double depositAmount;
    private double withdrawAmount;

    //constructor
    public ATMInterface(){

    }

    //getter and setter
public double getBalancedata() {
        return balancedata;
    }

    public void setBalance(double balancedata) {
        this.balancedata = balancedata;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }
}
