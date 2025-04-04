//Write a program to create two threads,
// one thread will print odd numbers 
//and second thread will print even numbers between 1 to 20 numbers
class MyThread1 extends Thread{
	public void run(){
		while(true){
			for(int i=1;i<=20;i++){
				if(i%2==0){
					System.out.println(i);
				}
				try{
					sleep(100);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		while(true){
			for(int j=1;j<=20;j++){
				if(j%2!=0){
				System.out.println(j);
			}
			try{
					sleep(100);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
public class lab_11_4{
	public static void main(String[] args) {
		MyThread1 mt1=new MyThread1();
		MyThread2 mt2=new MyThread2();

		mt1.start();
		mt2.start();
	}
}