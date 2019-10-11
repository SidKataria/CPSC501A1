/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 */
public class Family {
	//public int totalAmount;

    public double[] makeFamily (double [] stats) 
    	{
        Mother moms = new Mother(stats);

        Father pops = new Father(stats);

        double[] values = new double[3];
        
        //Base household income
        values[0] = moms.income + pops.income;
        
        //After expenses
        values[1] = moms.returnFinalIncome() + pops.returnFinalIncome();
        
        double momsave = 0.;
        double dadsave = 0.;

        //Savings
        if (moms.age < 25) momsave = 0.05;
        if (moms.age >= 25 && moms.age < 35 ) momsave = 0.08;
        if (moms.age >= 35 && moms.age < 61 ) momsave = 0.15;

        if (pops.age < 25) dadsave = 0.05;
        if (pops.age >= 25 && pops.age < 35 ) dadsave = 0.08;
        if (pops.age >= 35 && pops.age < 61 ) dadsave = 0.15;

        values[2] = moms.income * momsave + dadsave * pops.income;

        return values;
    }  
}
