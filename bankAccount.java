public class bankAccount {

    double balance;
    int account_number;

    public BankAccount(int account_number){

        this.balance = 0.0;
        this.account_number = account_number;
    }

    public void printAccountNumber(){
        System.out.println("Account number : " + account_number);
    }

    public void depositeMoney(double amount){
        balance += amount;
        System.out.println("Amount will be credited :"+amount);
        System.out.println("Balance is :"+ balance);
    }

    public void withdrawMoney(double amount){

        if(amount > 0)
            balance -= amount;
        System.out.println("Amount will be debited :"+amount);
        System.out.println("Balance is :"+ balance);
    }



    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(12345);
        account1.printAccountNumber();

        account1.depositeMoney(1000);
        account1.withdrawMoney(500);

    }
}
