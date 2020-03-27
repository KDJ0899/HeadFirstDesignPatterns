package observer_pattern;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.removeObserver(currentConditionDisplay);
		weatherData.setMeasurements(80, 65, 30.4f);
	}

}