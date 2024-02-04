package school;

public class Main {
   public static void main(String[] args) {
	   
	   String fileName = "src/school/studentData.txt";
	   StudentManager studentManager = new StudentManager();
	   
	   if (studentManager.readFromFile(fileName)) {
		   for(Student student : studentManager.studentList) {
			   System.out.println(student.toString());
			   }
		   }
	   }
   }