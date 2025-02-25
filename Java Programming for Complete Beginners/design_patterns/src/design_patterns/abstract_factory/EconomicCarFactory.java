package design_patterns.abstract_factory;

public class EconomicCarFactory implements AbstractFactory {

	@Override
	public Car getInstance(int price) {
		if (price <= 500000)
			return new Alto();
		else if (price <= 1000000)
			return new Swift();
		return null;
	}
}
