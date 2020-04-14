package decorater_pattern;

public abstract class Beverage {
	
	String descripton = "제목 없음";
	public String getDescription() {
		return descripton;
	}
	
	public abstract double cost();
}
