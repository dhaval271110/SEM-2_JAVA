public class p3{
	public static void main(String[] args) {
		for(int row=0;row<5;row++){
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