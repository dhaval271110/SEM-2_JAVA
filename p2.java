public class p2{
	public static void main(String[] args) {
		for(int row=4;row>=0;row--){
			for(int column=0;column<=row;column++){
				System.out.print("("+row+","+column+")");
			}
			System.out.println(" ");
		}
	}
}