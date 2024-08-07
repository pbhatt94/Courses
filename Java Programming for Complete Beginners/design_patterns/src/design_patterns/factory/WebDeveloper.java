package design_patterns.factory;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Getting Web Dev's Salary");
		return 500;
	}

}
