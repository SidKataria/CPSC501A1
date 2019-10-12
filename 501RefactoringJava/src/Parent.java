
public abstract class Parent {
    protected int age;
    protected double income, finalIncome, expenditure1, expenditure2, expenditure3, savingsPercent;
    
    public Parent(double [] stats, String parent) {
    	if (parent.contentEquals("mom")) {
    		this.age = (int) stats[0];
    		this.income = stats[1];
    		this.expenditure1 = stats[2];
    		this.expenditure2 = stats[3];
    		this.expenditure3 = stats[4];
    	}
    	else if (parent.contentEquals("dad")) {
    		this.age = (int) stats[5];
    		this.income = stats[6];
    		this.expenditure1 = stats[7];
    		this.expenditure2 = stats[8];
    		this.expenditure3 = stats[9];
    		this.savingsPercent = stats[10];
    	}
    }
    
    public abstract double returnFinalIncome();
    
}
