package decorater_pattern;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		descripton = "하우스 블렌드 커피";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
