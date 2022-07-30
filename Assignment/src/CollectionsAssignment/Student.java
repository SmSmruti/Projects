package CollectionsAssignment;
import java.util.*;

class Student implements Comparable<Student>{  
int ID;  
String name;  
String email;

Student(int ID,String name,String email){  
this.ID=ID;  
this.name=name;  
this.email=email;  
}  

public int compareTo(Student s) {
	
	if (this.ID > s.ID) {
		return 1;
		} else if (this.ID == s.ID) {
		return 0;
		} else {
		return -1;
		}
}

public String toString() {
return "ID-" + this.ID + ", name-" + this.name + ", email-" + this.email;
}
public static void main(String[] args) {
	
	TreeSet<Student> students = new TreeSet<>();
	Student student1 = new Student(2070, "Raghu", "raghu@gmail.com");
	Student student2 = new Student(2071, "Rama", "rama@gmail.com");
	Student student3 = new Student(2072, "Rintu", "rintu@gmail.com");
	Student student4 = new Student(2073, "Rishav", "rishav@gmail.com");
	
	students.add(student1);
	students.add(student2);
	students.add(student3);
	students.add(student4);
	
	for (Student student : students) {
		System.out.println(student);
	
	
}  
		
}
}
	


