package design_patterns.abstract_factory;

public class AbstractFactoryProducer {
	public AbstractFactory getFactoryInstance(String value) {
		if (value.equals("Economic"))
			return new EconomicCarFactory();
		else if (value.equals("Luxury"))
			return new LuxuryCarFactory();
		else
			return null;
	}
}
