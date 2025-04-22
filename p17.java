public class p17{
	public static void main(String[] args) {
		for(int row=1;row<=5;row++){
			for(int column=1;column<=row;column++){
				if((row+column)%2==0){
					System.out.print("1");
				}
				else{
					System.out.print("0");
				}
			}
			System.out.println(" ");
		}
	}
}