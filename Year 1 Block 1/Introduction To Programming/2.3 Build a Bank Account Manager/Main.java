import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String input = "x";
        BankAccount b1 = new BankAccount("b1", 76.54, "Chris Exton");
        BankAccount b2 = new BankAccount("b2", 3.67, "Nikita Mamray");
        BankAccount b3 = new BankAccount("b3", 345.53, "Luke Walsh");

        while(!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") && !input.equals("5")) {//alot
            System.out.println("Welcome to the bank, what would you like to do!");
            System.out.println("Press 1 to check account balance");
            System.out.println("Press 2 to deposit money");
            System.out.println("Press 3 to withdraw money");
            System.out.println("Press 4 to look at account details");
            System.out.println("Press 5 to quit");
            input = obj.nextLine();
        }
        if(input.equals("5")){
            System.exit(0);
        }
        if(input.equals("4") || input.equals("1")){
            System.out.println("enter ID");
            try{
                System.out.println("Enter a bankID");
                String bankIdSearch = obj.nextLine();
                if(bankIdSearch.equals("b1")){
                    System.out.println("Your ID is: " + b1.getID());
                    System.out.println("Your Balance is:" + b1.getMoney());
                    System.out.println("Your Name is: " + b1.getBankHolder());
                    System.exit(0);
                }
                if(bankIdSearch.equals("b2")){
                    System.out.println("Your ID is: " + b2.getID());
                    System.out.println("Your Balance is:" + b2.getMoney());
                    System.out.println("Your Name is: " + b2.getBankHolder());
                    System.exit(0);
                }
                if(bankIdSearch.equals("b3")){
                    System.out.println("Your ID is: " + b3.getID());
                    System.out.println("Your Balance is:" + b3.getMoney());
                    System.out.println("Your Name is: " + b3.getBankHolder());
                    System.exit(0);
                }
                else{
                    System.out.println("Invalid ID Entered");
                    System.exit(0);
                }
            }
            catch(Exception e){
                System.out.println("You entered an invalid id, closing now");
                System.exit(0);
            }
        }
        if(input.equals("3")){
            try {
                System.out.println("Enter a bankID");
                String bankIdSearch = obj.nextLine();
                System.out.println("Enter amount to withdraw");
                double AmountToWithdraw = obj.nextInt();
                if (AmountToWithdraw <= 0) {
                    System.out.println("Invalid amount entered");
                    System.exit(0);
                } else {
                    if (bankIdSearch.equals("b1")) {
                        double currentMoney = b1.getMoney();
                        b1.WithdrawMoney(currentMoney, AmountToWithdraw);
                        System.out.println("Your New balance is: " + b1.getMoney());
                        System.exit(0);
                    }
                    if (bankIdSearch.equals("b2")) {
                        double currentMoney = b2.getMoney();
                        b2.WithdrawMoney(currentMoney, AmountToWithdraw);
                        System.out.println("Your New balance is: " + b2.getMoney());
                        System.exit(0);
                    }
                    if (bankIdSearch.equals("b3")) {
                        double currentMoney = b3.getMoney();
                        b3.WithdrawMoney(currentMoney, AmountToWithdraw);
                        System.out.println("Your New balance is: " + b3.getMoney());
                        System.exit(0);
                    } else {
                        System.out.println("Invalid ID Entered");
                        System.exit(0);
                    }
                }
            }
            catch(Exception e){
                System.out.println("You entered an invalid id or amount, closing now");
                System.exit(0);
            }
        }
        if(input.equals("2")){
            try {
                System.out.println("Enter a bankID");
                String bankIdSearch = obj.nextLine();
                System.out.println("Enter amount to deposit");
                double AmountToDeposit = obj.nextInt();
                if (AmountToDeposit <= 0) {
                    System.out.println("Invalid amount entered");
                    System.exit(0);
                } else {
                    if (bankIdSearch.equals("b1")) {
                        double currentMoney = b1.getMoney();
                        b1.DepositMoney(currentMoney, AmountToDeposit);
                        System.out.println("Your New balance is: " + b1.getMoney());
                        System.exit(0);
                    }
                    if (bankIdSearch.equals("b2")) {
                        double currentMoney = b1.getMoney();
                        b2.DepositMoney(currentMoney, AmountToDeposit);
                        System.out.println("Your New balance is: " + b2.getMoney());
                        System.exit(0);
                    }
                    if (bankIdSearch.equals("b3")) {
                        double currentMoney = b1.getMoney();
                        b3.DepositMoney(currentMoney, AmountToDeposit);
                        System.out.println("Your New balance is: " + b3.getMoney());
                        System.exit(0);
                    } else {
                        System.out.println("Invalid ID Entered");
                        System.exit(0);
                    }
                }
            }
            catch(Exception e){
                System.out.println("You entered an invalid id or amount, closing now");
                System.exit(0);
            }
        }
    }
}
class BankAccount{
    private String id;
    private double money;
    private String bankholder;
        public BankAccount(String InId, double InMoney, String InBankholder){
            id = InId;// to be more verbose use this.
            money = InMoney;
            bankholder = InBankholder;
        }
    // getters
    public String getID() {
        return id;
    }
    public double getMoney() {
        return money;
    }
    public String getBankHolder() {
        return bankholder;
    }
    // setters
    public void WithdrawMoney(double moneyrn, double withdrawal){

        money =  withdrawal;
    }

    public void DepositMoney(double moneyrn2, double deposit){
        money = moneyrn2 + deposit;
    }
}
