package collection;
 import java.util.ArrayList;
 import java.util.Collections;
 
 
public class Classroom {

	public static void main(String[] args) {
		
			Student s1 = new Student(10, "Rahul" , 17 ,85);
			Student s2 = new Student(20,"Deepanshu", 16 ,70);
			Student s3 = new Student(11,"Vipul", 15 , 80);
			Student s4 = new Student(13,"rohit",18 , 90);
	
			ArrayList<Student> al =new ArrayList<Student>();
			al.add(s4);
			al.add(s1);
			al.add(s3);
			al.add(s2);
			
			
				
			
			
			System.out.println("---student---based on Marks ----");
			Collections.sort(al,new MarksComparator());
			for (Student s:al)
				System.out.println(s.StudentId + "is student id of " + s.StudentName + " his age is " + s.StudentAge +" and his marks are " + s.StudentMarks);
	
	}

}
