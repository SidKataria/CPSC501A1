/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 * A java program to calculate housing statistics based on fathers and mothers salaries and expenditures
 */
import java.util.Scanner;

public class Main {
	
	private static double maxIncome, maxAfterExp, maxSavings = 0;
	private static double [] firstHouse = {35, 50000, 3000, 55, 100, 36, 60000, 5000, 22, 70, 0.1};
	private static double [] secondHouse = {59, 25000, 1500, 25, 110, 62, 30000, 1000, 28, 80, 0.5};
	private static double [] thirdHouse = {22, 35000, 2000, 35, 105, 25, 40000, 3000, 25, 28, 0.25};

	public static void main (String[] args) {

		//Check input from user before continuing 
		checkFromUser();

		Family house1 = new Family();
        double[] house1Stats = house1.makeFamily(firstHouse);
        
        Family house2 = new Family();
        double[] house2Stats = house2.makeFamily(secondHouse);
        
        Family house3 = new Family();
        double[] house3Stats = house3.makeFamily(thirdHouse);

        greatestIncome(house1Stats, house2Stats, house3Stats);
        greatestIncomeAfterSavings(house1Stats, house2Stats, house3Stats);
        greatestSavings(house1Stats, house2Stats, house3Stats);
    }
	
	public static void greatestIncome(double [] house1, double [] house2, double [] house3) {
        //Greatest house income 
        if (house1[0] > 0 && house1[0] >= house2[0]) 
            maxIncome = house1[0];
        else 
            maxIncome = house2[0];
        if (house3[0] > maxIncome) 
            maxIncome = house3[0];
        System.out.println("Greatest income: " + maxIncome);
	}
	public static void greatestIncomeAfterSavings(double [] house1, double [] house2, double [] house3) {
		 //Greatest income after expenditure
        if (house1[1] > 0 && house1[1] >= house2[1]) 
            maxAfterExp = house1[1];
        else 
            maxAfterExp = house2[1];
        if (house3[1] > maxAfterExp) 
            maxAfterExp = house3[1];     
        System.out.println("After savings: " + maxAfterExp);
	}
	public static void greatestSavings(double [] house1, double [] house2, double [] house3) {
		//Greatest savings
        if (house1[2] > 0 && house1[2] >= house2[2]) 
            maxSavings = house1[2];
        else 
            maxSavings = house2[2];
            
        if (house3[2] > maxSavings) 
            maxSavings = house3[2];
        System.out.println("savings: " + maxSavings);
	}
	
	public static void checkFromUser() {
		if (askUser("Please type y to execute program and any other key to stop").contentEquals("y")) {
			System.out.println("Continuing");
		}
		else {
			System.out.println("Terminating program");
			System.exit(0); 
		}
		System.out.println("Calculating the greatest house income, the greatest income after expenditure and greatest savings from the given 3 families");
	}
	public static String askUser(String question) {
		Scanner reader = new Scanner(System.in);
		System.out.println(question);
		String input = reader.nextLine();
		reader.close();
		return input;
	}
}
