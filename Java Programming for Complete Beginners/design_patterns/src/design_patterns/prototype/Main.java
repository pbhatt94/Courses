package design_patterns.prototype;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Employees emps = new Employees();
		emps.loadData();

		try {
			Employees empsClone1 = (Employees) emps.clone();
			Employees empsClone2 = (Employees) emps.clone();
			List<String> list1 = empsClone1.getEmpList();
			list1.add("Person5");
			List<String> list2 = empsClone2.getEmpList();
			list2.remove("Person1");

			System.out.println("emps List: " + emps.getEmpList());
			System.out.println("empsClone1 List: " + list1);
			System.out.println("empsClone2 List: " + list2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}