//Write a program to create Account class, which is representing a bank account where we can deposit and withdraw money.
import java.util.Scanner;

class InSufficientFundException extends Exception {
    public InSufficientFundException(String message) {
        super(message);
    }
}

class Account{
    double balance = 1000;
    double ammount;
    // If user need to withdraw money which exceed our minimum bank balance then it will not be allowed, and will throw InSufficientFundException(Custom Exception). Handle above exception and display proper error message.


  Account(){
        this.balance=balance;
        this.ammount=ammount;
    }
    public void deposit(){
        this.balance += this.ammount;
        System.out.println("Your new balance is: "+this.balance);
        System.out.println("Thank you!");
    }
    public void widraw(){
        try{
            System.out.println("Your minimum balance should be 1000");
            if(this.balance - this.ammount < 1000){
              throw  new InSufficientFundException("Balance can't be less than 1000");
            }
            System.out.println("Your new balance is: "+this.balance);
        }catch(InSufficientFundException e){
            System.out.println("Exception caught");
        }
        System.out.println("Thank you!");
    }
}
public class lab10_2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Account ac=new Account();

        System.out.println("Enter ammount to deposit or widraw: ");
        ac.ammount=sc.nextDouble();

        System.out.println("Enter 1 for deposit and 2 for widraw: ");
        int n=sc.nextInt();

        if(n==1){
            ac.deposit();
        }else if(n==2){
            ac.widraw();
        }
        else{
            return;
        }
        sc.close();
    }
}