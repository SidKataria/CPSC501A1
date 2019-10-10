
public class Family {
	public int totalAmount;

    public double[] makeFamily (int age, double base, double exp, double exp2, double exp3, int age2, double base2, double expa, double expb, double expc, double tfsa ) 
    	{
        Mother moms = new Mother(age, base);
        moms.exp = exp;
        moms.exp2 = exp2;
        moms.exp3 = exp3;

        Father pops = new Father(age2, base2);  
        pops.exp = expa;
        pops.exp2 = expb;
        pops.exp3 = expc;
        pops.tfsa = tfsa;

        double[] values = new double[3];
        
        //Base household income
        values[0] = moms.base + pops.base;
        
        //After expenses
        values[1] = moms.AmountReturned() + pops.AmountReturned();
        
        double momsave = 0.;
        double dadsave = 0.;

        //Savings
        if (age < 25) momsave = 0.05;
        if (age >= 25 && age < 35 ) momsave = 0.08;
        if (age >= 35 && age < 61 ) momsave = 0.15;

        if (age2 < 25) momsave = 0.05;
        if (age2 >= 25 && age2 < 35 ) momsave = 0.08;
        if (age2 >= 35 && age2 < 61 ) momsave = 0.15;

        values[2] = moms.base * momsave + dadsave * pops.base;

        return values;
    }  
}
