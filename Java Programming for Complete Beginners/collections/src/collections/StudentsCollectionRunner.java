package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
}

public class StudentsCollectionRunner {
	public static void main(String[] args) {
		List<Student> students = List.of(new Student(4, "person1"), new Student(2, "person2"),
				new Student(3, "person3"));
		ArrayList<Student> studentsAL = new ArrayList<>(students);
		System.out.println(studentsAL);
		Collections.sort(studentsAL, new DescendingStudentComparator());
		System.out.println("Desc " + studentsAL);
		Collections.sort(studentsAL);
		System.out.println("Asc " + studentsAL);
		studentsAL.sort(new DescendingStudentComparator());
		System.out.println("Desc " + studentsAL);
	}
}
