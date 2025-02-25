package design_patterns.abstract_factory;

public class LuxuryCarFactory implements AbstractFactory {

	@Override
	public Car getInstance(int price) {
		if (price > 1000000 && price <= 5000000)
			return new BMW();
		else if (price <= 100000000)
			return new Mercedes();
		return null;
	}

}
