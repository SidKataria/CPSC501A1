/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 */
public class Father extends Parent {

    public Father (double [] stats) {
        super(stats, "dad");
    }

    public double returnFinalIncome() {
        finalIncome = income + age + (age * 0.12) - expenditure1 - expenditure2 - expenditure3 - (income * savingsPercent);
        return finalIncome;
    }
}
