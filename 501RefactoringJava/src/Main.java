/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 * A java program to calculate housing statistics based on fathers and mothers salaries and expenditures
 */
import java.util.Scanner;

public class Main {
	private static double maxIncome;
	private static double maxAfterExp;
	private static double maxSavings;
	private static double [] firstHouse = {35, 50000, 3000, 55, 100, 36, 60000, 5000, 22, 70, 0.1};
	private static double [] secondHouse = {59, 25000, 1500, 25, 110, 62, 30000, 1000, 28, 80, 0.5};
	private static double [] thirdHouse = {22, 35000, 2000, 35, 105, 25, 40000, 3000, 25, 28, 0.25};

	public static void main (String[] args) {

		
		if (askUser("Please type y to execute program and any other key to stop").contentEquals("y")) {
			System.out.println("Continuing");
		}
		else {
			System.out.println("Terminating program");
			System.exit(0); 
		}
		System.out.println("Calculating the greatest house income, the greatest income after expenditure and greatest savings from the given 3 families");
		

		Family house1 = new Family();
        double[] house1Stats = house1.makeFamily(firstHouse);
        
        Family house2 = new Family();
        double[] house2Stats = house2.makeFamily(secondHouse);
        
        Family house3 = new Family();
        double[] house3Stats = house3.makeFamily(thirdHouse);

        //Greatest house income 
        maxIncome = 0;
        if (house1Stats[0] > 0 && house1Stats[0] >= house2Stats[0]) 
            maxIncome = house1Stats[0];
        else 
            maxIncome = house2Stats[0];
            
        if (house3Stats[0] > maxIncome) 
            maxIncome = house3Stats[0];  
            
        System.out.println("Greatest income: " + maxIncome);

        //Greatest income after expenditure
        maxAfterExp = 0;
        if (house1Stats[1] > 0 && house1Stats[1] >= house2Stats[1]) 
            maxAfterExp = house1Stats[1];
        else 
            maxAfterExp = house2Stats[1];
            
        if (house3Stats[1] > maxAfterExp) 
            maxAfterExp = house3Stats[1];     
        
        System.out.println("After savings: " + maxAfterExp);

        //Greatest savings
        maxSavings = 0;
        if (house1Stats[2] > 0 && house1Stats[2] >= house2Stats[2]) 
            maxSavings = house1Stats[2];
        else 
            maxSavings = house2Stats[2];
            
        if (house3Stats[2] > maxSavings) 
            maxSavings = house3Stats[2]; 
        
        System.out.println("savings: " + maxSavings);
    }
	
	public static String askUser(String question) {
		Scanner reader = new Scanner(System.in);
		System.out.println(question);
		String input = reader.nextLine();
		reader.close();
		return input;
	}
}
