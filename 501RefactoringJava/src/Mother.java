/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 */
public class Mother extends Parent {

    public Mother (double [] stats) {
        super(stats, "mom");
    }

    public double returnFinalIncome() {
        finalIncome = income + age + (age * 0.15) - expenditure1 - expenditure2 - expenditure3 ;
        return finalIncome;
    }

}
