package collection;

import java.util.Comparator;

public class AgeComparator implements Comparator <Student>{
	
	public int compare(Student s1, Student s2) {
		if (s1.StudentAge == s2.StudentAge)
		return 0;
		if (s1.StudentAge > s2.StudentAge)
			return 1;
		else
			return -1;
	}
			
}
