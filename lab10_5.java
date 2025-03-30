//Write a program in java if number is less than 10 and greater than 50, it generate the exception out of range. Else it displays the square of number.
import java.util.Scanner;

class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class lab10_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        double n=sc.nextDouble();
        try{
            if(n<10 || n>50){
                throw new OutOfRangeException("Exception cougt");
            }else{
                n *= n;
                System.out.println("Squre of given number is: "+n);
            }
        }catch(OutOfRangeException ore){
            System.out.println("Please enter number between range");
        }
        sc.close();
    }
}
