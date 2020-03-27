package strategy_pattern.simuduck;

public class FlyNoWay implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("저는 못날아요.");
	}
	
}
