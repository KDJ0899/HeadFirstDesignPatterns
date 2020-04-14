package decorater_pattern;

public class Espresso extends Beverage {
	
	public Espresso() {
		descripton = "에스프레소";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
