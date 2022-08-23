package chapters.chapter_01;

public class Exercise_11 {

	public static void main(String[] args) {

		System.out.println("the population of The US after 5 years");
		System.out.println(((5*365*24*60*60)/7)+((5*365*24*60*60)/45)-((5*365*24*60*60)/13)+312032486);
		System.out.println("Calculation in a different way");
		System.out.println((5*365*24*60*(60.0/7))+(5*365*24*60*(60.0/45))-(5*365*24*60*(60.0/13))+312032486);
	}

}
