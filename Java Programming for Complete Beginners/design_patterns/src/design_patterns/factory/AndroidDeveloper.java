package design_patterns.factory;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Getting Android Dev's Salary");
		return 100;
	}

}
