/***
 * Name: Siddharth Kataria
 * UCID: 30000880
 */
public class Mother {
    public int age;
    public double income;
    public double amount;
    public double expenditure1;
    public double expenditure2; 
    public double expenditure3;

    public Mother (int age, double income ) {
        this.age = age;
        this.income = income;
    }

    public double AmountReturned() {
        amount = income + age + (age * 0.15) - expenditure1 - expenditure2 - expenditure3 ;
        return amount;
    }

}
