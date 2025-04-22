public class p15{
	public static void main(String[] args) {
		for(int row=1;row<=5;row++){
			for(int space=5-row;space>=1;space--){
				System.out.print(" ");
			}
			for(int column=1;column<=((row*2)-1);column++){
				if(column==1 || row==5 || column==((row*2)-1)){
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