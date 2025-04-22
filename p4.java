public class p4{
	public static void main(String[] args) {
		for(int row=4;row>=0;row--){
			for(int space=0;space<=(4-row);space++){
				System.out.print(" ");
			}
			for(int column=0;column<=row;column++){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}