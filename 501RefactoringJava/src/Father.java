
public class Father {
    public int age;
    public double base;
    public double amount;
    public double exp;
    public double exp2; 
    public double exp3;
    public double tfsa;

    public Father (int age, double base ) {
        this.age = age;
        this.base = base;
    }

    public double AmountReturned() {
        amount = base + age + (age * 0.12) - exp - exp2 - exp3 - (base * tfsa);
        return amount;
    }
}
