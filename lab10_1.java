//Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds Exception using try-catch block.
import java.util.InputMismatchException;
import java.util.Scanner;
public class lab10_1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no of Students: ");
        int n=sc.nextInt();

        double [] arr=new double[5];
        double totalmarks=0;
        try{
            for(int i=1;i<=n;i++){
                System.out.println("Enter marks of Student "+i+": ");
                arr[i]=sc.nextDouble();
                System.out.println("Mark of Student "+i+" is "+arr[i]+" : ");
                totalmarks += arr[i];
        }
            double average=totalmarks/n;
            System.out.println("Average of marks is : "+average);
    }
    catch(ArithmeticException ae){
        System.out.println("Cannot divide by zero");
    }
    catch(ArrayIndexOutOfBoundsException aie){
        System.out.println("No more than 5 students allowed");
    }catch(InputMismatchException ime){
        System.out.println("Only enter numbers");
    }
    System.out.println("Thank you!");
        sc.close();
    }
}