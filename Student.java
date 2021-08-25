package studentDataBaseApp;

import java.util.*;

public class Student {
private String firstName;
private String lastName;
private int gradeYear;
private String StudentId;
private String Courses="";
private int tuitionBalance=0;
private int costOfCourse=600;
private static int id=8000;
//Constructor: Prompt user to enter student's name and year
public Student() {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter First Name");
	this.firstName=sc.nextLine();
	System.out.print("Enter last Name");
	this.lastName=sc.nextLine();
	System.out.print("Enter students year \n1.1st year \n2.2nd year \n3.3rd year \n4.4th year");
	this.gradeYear=sc.nextInt();
	setStudentId();	
   }
//Ask student ID
private void setStudentId() {
	id++;
	this.StudentId=gradeYear+""+id;
}
//enroll in courses
public void enroll() {
	//gets Inside a loop,if user enters 0 it is meant to quit
	do {
		System.out.print("Enter cources to enroll(Q to quit): ");
		Scanner sc=new Scanner(System.in);
		String course=sc.nextLine();
		if(!course.equals("Q")) {
	    	Courses=Courses+"\n"+course;
	    	tuitionBalance=tuitionBalance+costOfCourse;
		}else {
			System.out.println("Thanks for enrolling\nHappy learning");
			break;
		}
	}while(1!=0);
}
//view balance
/*public void viewBalance() {
	System.out.println("Your Balance is: $"+tuitionBalance);
}*/
//pay balance tuition fees
public void payTuition() {
	System.out.println("Total Amount for courses enrolled: "+tuitionBalance);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your payment");
	int payment=sc.nextInt();
	tuitionBalance=tuitionBalance-payment;
	System.out.println("Thank you for your payment of :$"+payment);
	//viewBalance();
}
//show student status
public String toShow() {
	return "Student's Name: "+firstName+" "+lastName+
			"\nStudent ID: "+StudentId+
			"\nStudent grade level: "+gradeYear+
			"\ncourses enrolled in: "+Courses+
			"\nBalance :"+tuitionBalance;
}
}


