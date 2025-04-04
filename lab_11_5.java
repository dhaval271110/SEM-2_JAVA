//Write a java program that implements a multi-thread application that has three threads.
//First thread generates random integer every 1 second 
//and if the value is even, second thread computes the square of the number and
//prints. If the value is odd, the third thread will print the value of cube of the number
class MyThread1 extends Thread{
	public void run(){
		while(true){
			int n=(int)(Math.random()*100);
			try{
				sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			if(n%2==0){
				MyThread2 mt2=new MyThread2(n);
				mt2.start();
			}else{
				MyThread3 mt3=new MyThread3(n);
				mt3.start();
			}
		}
	}
}
class MyThread2 extends Thread{
	int n;
	MyThread2(int n){
		this.n=n;
	}
	public void run(){
			System.out.println("even number: "+n*n);
	}
}
class MyThread3 extends Thread{
	int n;
	MyThread3(int n){
		this.n=n;
	}
	public void run(){
			System.out.println("odd number: "+n*n*n);
	}
}
public class lab_11_5{
	 public static void main(String[] args) {
		MyThread1 mt1=new MyThread1();
		mt1.start();
	}
}