package Tests;

import junit.framework.Assert;
import main.Calculator;

import org.testng.annotations.Test;

public class CalculatorTest {
	
	@Test
	public void addTest1() {
		Calculator calc=new Calculator();
		Assert.assertEquals(3, calc.add(1, 2));
	}

	
	@Test
	public void addTest2() {
		Calculator calc=new Calculator();
		Assert.assertEquals(0, calc.add(0, 0));
	}
	
	@Test
	public void addTest3() {
		Calculator calc=new Calculator();
		Assert.assertEquals(0, calc.add(0, 0));
	}	
}
