//Write a program in java which will keep getting student name from user
//(terminal) until user type “EXIT” and add all the collected names into ArrayList.
import java.util.ArrayList;
import java.util.Scanner;
public class collection{
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Enter student name: ");
			String name=sc.nextLine();
			if(name.equalsIgnoreCase("EXIT")){
				break;
			}
			a1.add(name);
		}
		System.out.println("Name is: "+a1);
	}
}