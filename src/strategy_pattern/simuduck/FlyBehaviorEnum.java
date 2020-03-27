package strategy_pattern.simuduck;

public enum FlyBehaviorEnum {
	FlyNoWay(){
		@Override
		public void fly() {
			System.out.println("날지 못해요.");
			
		}
	},
	FlyWithWings{
		@Override
		public void fly() {
			System.out.println("날고 있어요!");
		}
	};

	public abstract void fly();
}
