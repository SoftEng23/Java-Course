
public class WeatherMachine {
Thermometer thermometer;
String city;	
	public WeatherMachine() {
		this("Reston");
		thermometer = new Thermometer();
	}
	
	public WeatherMachine(String city) {
		this.city = city;
	}
	
	private double[] getPastTemperatures() {
		double[] result = new double[24];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = thermometer.getTemperature();
		}
		
		return result;
	}
	
	public void getWeatherReport() {
		System.out.println("Your Current location: " + city);
		System.out.println("Your last 24 hours:");
		double[] temps = getPastTemperatures();
		
		for(int i = 0; i < temps.length; i++) {
			System.out.println(i + ":00 " + temps[i] + " degrees");
		}
	}
}






