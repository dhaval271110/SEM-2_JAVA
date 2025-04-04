//Write a complete multi-threaded program to meet following requirements:
//a. Read matrix [A] m x n
//b. Create m number of threads
//c. Each thread computes summation of elements of one row, i.e. ith row of the matrix
//is processed by ith thread. Where 0 <= i< m.
//d. Print the results
import java.util.Scanner;
class MyThread extends Thread{
	int[] arr1;
	int sum=0;
	MyThread(int[] arr1){
		this.arr1=arr1;
	}
	public void run(){
		for(int i=0;i<arr1.length;i++){
			sum +=arr[i];
			System.out.println("Sum is: "+sum);
	}
}
public class lab_11_6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row: ");
		int m=sc.nextInt();
		System.out.println("Enter column: ");
		int n=sc.nextInt();
		int arr[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.println("Enter element: ");
				arr[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<m;k++){
			MyThread mt=new MyThread(arr[i],i);
			mt.start();
		}
	}
}
