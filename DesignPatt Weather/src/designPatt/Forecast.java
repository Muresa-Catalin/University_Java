package designPatt;

class Weather{
	void now() {
		
	}
}

class SunnyWeather extends Weather{
	void now() {
		System.out.println("Sunny");
	}
}

class CloudyWeather extends Weather{
	void now() {
		System.out.println("Cloudy");
	}
}

class RainyWeather extends Weather{
	void now() {
		System.out.println("Rainy");
	}
}

class State{
	private Weather vremeWeather = new SunnyWeather();
	
	void changeToCloudy() {
		vremeWeather = new CloudyWeather();
	}
	
	void changeToRainy() {
		vremeWeather = new RainyWeather();
	}
	
	void changeToSunny() {
		vremeWeather = new SunnyWeather();
	}
	
	void AfisareVreme() {
		vremeWeather.now();
	}
}

public class Forecast {

	public static void main(String[] args) {
		State state = new State();
		state.AfisareVreme();
		
		state.changeToCloudy();
		state.AfisareVreme();
		
		state.changeToRainy();
		state.AfisareVreme();
		
		state.changeToSunny();
		state.AfisareVreme();

	}

}
