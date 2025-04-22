public class p11{
	public static void main(String[] args) {
		for(int row=1;row<=5;row++){
			for(int space=5-row;space>=1;space--){
				System.out.print(" ");
			}
			for(int column=1;column<=((row*2)-1);column++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
		for(int row=4;row>=1;row--){
			for(int space=5-row;space>=1;space--){
				System.out.print(" ");
			}
			for(int column=1;column<=((row*2)-1);column++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}





