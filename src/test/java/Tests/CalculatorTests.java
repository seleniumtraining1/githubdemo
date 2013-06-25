package Tests;

import junit.framework.Assert;
import main.Calculator;

import org.testng.annotations.Test;

public class CalculatorTests {
	
	@Test
	public void addTest() {
		Calculator calc=new Calculator();
		Assert.assertEquals(3, calc.add(1, 2));
	}

}
