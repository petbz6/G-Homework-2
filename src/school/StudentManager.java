package school;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentManager {
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	public boolean readFromFile(String fileName) {
	    try {
	        Scanner fileIn = new Scanner(new FileInputStream(fileName));

	        while (fileIn.hasNextLine()) {
	            int id = fileIn.nextInt();
	            String firstname = fileIn.next();
	            String lastname = fileIn.next();
	            String FullName = (firstname + " " + lastname);
	            double grade = fileIn.nextDouble();
	            
	            Student student = new Student(id, FullName, grade);
	            studentList.add(student);
	        }
	        fileIn.close();
	        return true;

	    } 
	    catch (FileNotFoundException e) {
	        System.out.println("An error has occurred.");
	        return false;
	    }
	}
	
	public void displayStudents(){
		for(Student i : studentList) {
			System.out.println(i.toString());
		}
	}
	
	public boolean searchStudentById(int id) {
		for(Student student : studentList) {
			if(student.getId()==id) {
				System.out.println("\nStudent found");
				System.out.println(student.toString());
				return true;
			}
		}
		System.out.println("\nStudent not found");
		return false;
	}
	
}
