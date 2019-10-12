/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 */
public class Family {

    public double[] makeFamily (double [] stats) 
    	{
        Mother moms = new Mother(stats);
        Father pops = new Father(stats);

        double[] values = new double[3];
        
        //Base household income
        values[0] = householdIncome(moms,pops);
        //After expenses
        values[1] = moms.returnFinalIncome() + pops.returnFinalIncome();
        //Total Savings including dad's savings percent
        values[2] = totalSavings(moms,pops);

        return values;
    }  
    
    //Calculate Household Income
    private double householdIncome(Mother mom, Father pop) {
    	return mom.income + pop.income;
    }
    //Calculating Savings after expenditure
    private double totalSavings(Mother mom, Father pop) {
    	 //Savings
        double momSavingsPercent = calculateSavings(mom.age);
        double dadSavingsPercent = calculateSavings(pop.age);
        return mom.income * momSavingsPercent + dadSavingsPercent * pop.income;
    }
    //Calculating Savings
    private double calculateSavings(int age) {
        if (age < 25) return 0.05;
        else if (age < 35 ) return 0.08;
        else return 0.15;
    }
}
