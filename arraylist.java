//Write a program to demonstrate the use of ArrayList to store and display List of Student
//class with StudentID, StudentName, StudentRollNo and StudentSPI. 
import java.util.*;
class Student{
	int StudentID;
	String StudentName;
	int StudentRollNo;
	double StudentSPI;

	Student(int StudentID, String StudentName, int StudentRollNo, double StudentSPI){
		this.StudentID=StudentID;
		this.StudentName=StudentName;
		this.StudentRollNo=StudentRollNo;
		this.StudentSPI=StudentSPI;
	}

	 public void displayStudent() {
        System.out.println("Student ID: " + StudentID);
        System.out.println("Name: " + StudentName);
        System.out.println("Roll No: " + StudentRollNo);
        System.out.println("SPI: " + StudentSPI);
        System.out.println("____");
    }
}

public class arraylist{
	public static void main(String[] args) {
		 ArrayList<Student> students = new ArrayList<>();

        // Adding Student objects to the list
        students.add(new Student(1, "Dhaval", 101, 8.5));
        students.add(new Student(2, "Siddhapura", 102, 7.9));
        students.add(new Student(3, "Darshan", 103, 9.1));

        // Display all student details
        System.out.println("List of Students:");
        System.out.println("____");
      	
      	for (Student s : students) {
            s.displayStudent();
        }
	}
}

