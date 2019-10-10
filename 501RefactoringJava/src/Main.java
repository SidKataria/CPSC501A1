import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		
		if (askUser("Please type y to execute program and any other key to stop").contentEquals("y")) {
			System.out.println("Continuing");
		}
		else {
			System.out.println("Exiting");
			System.exit(0); 
		}
		System.out.println("Calculating the greatest house income, the greatest income after expenditure and greatest savings from the given 3 families");
		

		Family house1 = new Family();
        double[] h1 = house1.makeFamily(35, 50000, 3000, 55, 100, 36, 60000, 5000, 22, 70, 0.1);
        Family house2 = new Family();
        double[] h2 = house2.makeFamily(59, 25000, 1500, 25, 110, 62, 30000, 1000, 28, 80, 0.5);
        Family house3 = new Family();
        double[] h3 = house3.makeFamily(22, 35000, 2000, 35, 105, 25, 40000, 3000, 25, 28, 0.25);

        //Greatest house income 
        double max = 0;
        if (h1[0] > 0 && h1[0] >= h2[0]) 
            max = h1[0];
        else 
            max = h2[0];
            
        if (h3[0] > max) 
            max = h3[0];  
            
        System.out.println("Greatest income: " + max);

        //Greatest income after exp
        max = 0;
        if (h1[1] > 0 && h1[1] >= h2[1]) 
            max = h1[1];
        else 
            max = h2[1];
            
        if (h3[1] > max) 
            max = h3[1];     
        
        System.out.println("After savings: " + max);

        //Greatest savings
        max = 0;
        if (h1[2] > 0 && h1[2] >= h2[2]) 
            max = h1[2];
        else 
            max = h2[2];
            
        if (h3[2] > max) 
            max = h3[2]; 
        
        System.out.println("savings: " + max);
    }
	
	public static String askUser(String question) {
		Scanner reader = new Scanner(System.in);
		System.out.println(question);
		String input = reader.nextLine();
		reader.close();
		return input;
	}
}
