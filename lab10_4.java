//Write a Java program that divides two numbers. If Num1 or Num2 were not an integer, the program would throw a InputMmismatchException. If Num2 were Zero, the program would throw an Arithmetic Exception. Display appropriate message for each exception.
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab10_4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        try{
            System.out.println("Enter number 1: ");
            int num1=sc.nextInt();
            System.out.println("Enter number 2: ");
            int num2=sc.nextInt();
            
            int result = num1/num2;
            System.out.println("Result is: "+result);
        }catch(InputMismatchException ime){
            System.out.println("Wrong input");
        }catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        }
        System.out.println("Thank you!");
        sc.close();
    }
}
