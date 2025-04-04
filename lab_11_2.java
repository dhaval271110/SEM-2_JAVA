//Write an application that executes two threads. 
//One thread displays "Good Morning" every 1000 milliseconds 
//& another thread displays "Good Afternoon" every 3000 milliseconds. 
//Create the threads by implementing the Runnable interface.
class MyThread1 implements Runnable{
	public void run(){
		while(true){
			System.out.println("Good Morning!");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	}
}
class MyThread2 extends Thread{
		public void run(){
		while(true){
		System.out.println("Good Afternoon!");
		try{
			Thread.sleep(3000);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	}
}
public class lab_11_2{
	public static void main(String[] args){
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();

		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);

		t1.start();
		t2.start();
	}
}