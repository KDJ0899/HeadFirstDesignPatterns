package strategy_pattern.simuduck;

public enum DuckEnum {
	Mallard(FlyBehaviorEnum.FlyWithWings,new Quack()),
	ModelDuck(FlyBehaviorEnum.FlyNoWay,new MuteQuack());
	
	FlyBehaviorEnum flyBehavior;
	QuackBehavior quackBehavior;
	
	private DuckEnum(FlyBehaviorEnum flyBehavior , QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehaviorEnum flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
