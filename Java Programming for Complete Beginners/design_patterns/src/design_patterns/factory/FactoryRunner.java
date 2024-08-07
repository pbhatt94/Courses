package design_patterns.factory;

public class FactoryRunner {
	public static void main(String[] args) {
		//		Employee employee = new AndroidDeveloper();

		Employee employee = EmployeeFactory.getEmployee("Web Developer");
		System.out.println(employee.salary());

		Employee employee2 = EmployeeFactory.getEmployee("Android Developer");
		System.out.println(employee2.salary());
	}
}
