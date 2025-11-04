import java.util.Scanner;
class BankAccount{
    String AccountHolderName;
    long AccountNo;
    double Balance;

    BankAccount(String AccountHolderName,Long AccountNo,double Balance){
        this.AccountHolderName=AccountHolderName;
        this.AccountNo=AccountNo;
        this.Balance=Balance;
    }
    void Deposit(double amount){
//        double Deposit = 0;
        if(amount > 0){
//        Balance += Deposit;
            Balance += amount;
    }else{
        System.out.println("Enter Valid Deposit Amount");
    }
    }
    void Withdraw(double amount) {
        if (amount <= Balance && amount > 0) {
            Balance -= amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void CheckBalance(){
        System.out.printf("Your Current Balance is: ₹%.2f%n",Balance);
    }
    void AccountDetails(){
        System.out.println("------------------------------------");
        System.out.println("Account_Holder_Name:" +AccountHolderName);
        System.out.println("Account_Number:" + AccountNo);
        System.out.println("Balance" + "₹" + Balance);
        System.out.println("------------------------------------");
    }

}
public class Main{
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Java Bank");
        System.out.println("Enter your AccountHolderName:");
        String name=input.nextLine();

        System.out.println("Enter your AccountNo:");
        Long number=input.nextLong();

        BankAccount acc = new BankAccount("Logesh S",14062004L,766D);
        int choice = 0;
        while(choice != 5) {
            System.out.println("_______________MENU_______________");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.CheckBalance");
            System.out.println("4.AccountDetails");
            System.out.println("5.Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a amount to deposit:");
                    double dep = input.nextDouble();
                    acc.Deposit(dep);
                    break;
                case 2:
                    System.out.println("Enter a amount to withdraw:");
                    double wd = input.nextDouble();
                    acc.Withdraw(wd);
                    break;
                case 3:
                    acc.CheckBalance();
                    break;
                case 4:
                    acc.AccountDetails();
                    break;
                case 5:
                    System.out.println("ThankYou for Banking with Java Bank");
                    break;
                default:
                    System.out.println("Invalid choice,Please enter valid choice");
            }
        }
        input.close();
    }
}