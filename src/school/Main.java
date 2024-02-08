package school;

public class Main {
   public static void main(String[] args) {
	   
	   String fileName = "src/school/studentData.txt";
	   StudentManager studentManager = new StudentManager();
	   
	   // Read student data from a file and initialize Student objects.
	   boolean fileReadStatus = studentManager.readFromFile(fileName);
	   
	   // Display all students.
	   studentManager.displayStudents();
	   
	   // Search for a student by ID.
	   boolean studentFound = studentManager.searchStudentById(101);
	   
	   // Update the grade of a student by ID.
	   boolean updatedGrade = studentManager.updateStudentGradeById(104, 74);	   
	   
	   // Display all students after the update.
	   studentManager.displayStudents();
   }
}