/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 */
public class Family {
	//public int totalAmount;

    public double[] makeFamily (int momAge, double momInc, double expenditureM1, double expenditureM2, double expenditureM3, int dadAge, double dadInc, double expenditureD1, double expenditureD2, double expenditureD3, double saving ) 
    	{
        Mother moms = new Mother(momAge, momInc);
        moms.expenditure1 = expenditureM1;
        moms.expenditure2 = expenditureM2;
        moms.expenditure3 = expenditureM3;

        Father pops = new Father(dadAge, dadInc);  
        pops.expenditure1 = expenditureD1;
        pops.expenditure2 = expenditureD2;
        pops.expenditure3 = expenditureD3;
        pops.saving = saving;

        double[] values = new double[3];
        
        //Base household income
        values[0] = moms.income + pops.income;
        
        //After expenses
        values[1] = moms.AmountReturned() + pops.AmountReturned();
        
        double momsave = 0.;
        double dadsave = 0.;

        //Savings
        if (momAge < 25) momsave = 0.05;
        if (momAge >= 25 && momAge < 35 ) momsave = 0.08;
        if (momAge >= 35 && momAge < 61 ) momsave = 0.15;

        if (dadAge < 25) dadsave = 0.05;
        if (dadAge >= 25 && dadAge < 35 ) dadsave = 0.08;
        if (dadAge >= 35 && dadAge < 61 ) dadsave = 0.15;

        values[2] = moms.income * momsave + dadsave * pops.income;

        return values;
    }  
}
