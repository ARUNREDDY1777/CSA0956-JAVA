class BankAccount {
    private int accountnumber;
    private float balance;

    public int getAccountNum() {
        return accountnumber;
    }

    public float getbalance() {
        return balance;
    }

    public void setAccountNum(int account) {
        accountnumber = account; //here this key word is not used because the parameter and variable are different 
    }

    public void setbalance(float bala) {
        balance = bala;   //here this key word is not used because the parameter and variable are different 
    }
}

public class Bankdetails {
    public static void main(String[] arunreddy) {
        BankAccount b = new BankAccount();
        b.setAccountNum(123456);
        b.setbalance(23456.05f);

        System.out.println("Account Number: " + b.getAccountNum());
        System.out.println("Balance: " + b.getbalance());
    }
}
