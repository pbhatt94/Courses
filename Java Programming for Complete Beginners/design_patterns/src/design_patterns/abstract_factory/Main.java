package design_patterns.abstract_factory;

public class Main {
	public static void main(String[] args) {
		AbstractFactoryProducer abstractFactoryProducerObj = new AbstractFactoryProducer();
		AbstractFactory abstractFactoryObj = abstractFactoryProducerObj.getFactoryInstance("Economic");
		Car carObj = abstractFactoryObj.getInstance(1000000);
		System.out.println(carObj.getTopSpeed());
	}
}