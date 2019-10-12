import org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testMain {
	
	private Mother momEmpty, mom, momNeg;
	private Father dadEmpty, dad, dadNeg;
	
	@Before
	public void setUp () {	//Set up class
		//Normal Cases
		mom = new Mother (new double [] {25,7000,1000,100,700,26,10000,2500,1000,700,0.1});
		dad = new Father (new double [] {25,7000,1000,100,700,26,10000,2500,1000,700,0.1});
		//Negative Cases
		momNeg = new Mother (new double [] {-25,-7000,-1000,-100,-700,-26,-10000,-2500,-1000,-700,-0.1});
		dadNeg = new Father (new double [] {-25,-7000,-1000,-100,-700,-26,-10000,-2500,-1000,-700,-0.1});
	}
	
	//Initialising empty cases
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public  void setMomEmpty() {
		momEmpty = new Mother(new double [] {});
	}
	@Test (expected = ArrayIndexOutOfBoundsException.class)
	public  void setDadEmpty() {
		dadEmpty = new Father(new double [] {});
	}
	
	
	@After
	public void tearDown() {
		momEmpty = null;
		mom = null;
		momNeg = null;
		dadEmpty = null;
		dad = null;
		dadNeg = null;
	}

}
