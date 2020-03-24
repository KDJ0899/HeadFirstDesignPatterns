package strategypattern.simuduck;

public class Main {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		
		
		DuckEnum duck = DuckEnum.Mallard;
		
		duck.performFly();
		duck.performQuack();
	}

}
