package Sample_TC.Testyantra;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test (priority = 2)
	public void zz(){
		System.out.println("zzzz running");
	}
	
	@Test (priority = 1)
	public void ee() {
		System.out.println("ee running");
	}
	
	@Test(priority = 3)
	public void  aa() {
		System.out.println("aa running");
	} 
	

}
