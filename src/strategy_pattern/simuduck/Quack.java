package strategy_pattern.simuduck;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("꽥");
	}

}
