public class p6{
	public static void main(String[] args) {
		for(int row=1;row<=5;row++){
			for(int column=1;column<=5;column++){
				if(row==1 || row==5 || column==1 || column==5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}