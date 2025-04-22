//Implement a Java program using Collection Array List class to add 5 elements
//with String value. Print all the elements using Iterator.
import java.util.*;
public class iterator{
	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("Dhaval");
		a1.add("Siddhapura");
		a1.add("Darshan");
		a1.add("University");
		a1.add("Rajkot");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext()){
			Object element=itr.next();
			System.out.println(element);
		}
	}
}
