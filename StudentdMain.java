package studentDataBaseApp;

import java.util.Scanner;

public class StudentDataBaseApp {

	public static void main(String[] args) {
		//Ask how many students we want to add
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students for admission: ");
		int noOfStudents=sc.nextInt();
        Student students[]=new Student[noOfStudents];
		//Create n Number of new students
        for(int i=0;i<noOfStudents;i++) {
        	students[i] =new Student(); 
        	students[i].enroll();
    		students[i].payTuition();
    		System.out.println(students[i].toShow());

        }
		
	}

}
