package chapters.chapter_01;

public class Exercise_11 {

	public static void main(String[] args) {
		
		double secondInYear = 365 * 24 * 60 * 60;
		
		double currentPopulation = 312_032_486;
		
		double births = (365*24*60*60)/7;
		
		double immigrants = (365*24*60*60)/45;
		
		double deaths = (365*24*60*60)/13;
		
		currentPopulation = currentPopulation + births + immigrants - deaths;
		
		System.out.println("The population of first year is : " + (int)currentPopulation);
		
		currentPopulation = currentPopulation + births + immigrants - deaths;
		
		System.out.println("The population of second year is : " + (int)currentPopulation);
		
		currentPopulation = currentPopulation + births + immigrants - deaths;
		
		System.out.println("The population of third year is : " + (int)currentPopulation);
		
		currentPopulation = currentPopulation + births + immigrants - deaths;
		
		System.out.println("The population of forth year is : " + (int)currentPopulation);
		
		currentPopulation = currentPopulation + births + immigrants - deaths;
		
		System.out.println("The population of fifth year is : " + (int)currentPopulation);
		
		
	}

}
