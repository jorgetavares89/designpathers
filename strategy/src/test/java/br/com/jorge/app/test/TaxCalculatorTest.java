package br.com.jorge.app.test;

import org.junit.Test;

import br.com.jorge.entity.Budget;
import br.com.jorge.interfaces.Tax;
import br.com.jorge.service.ICMSCalculator;
import br.com.jorge.service.ISSCalculator;
import junit.framework.TestCase;

public class TaxCalculatorTest extends TestCase {
	
	@Test
	public void testISS() {
		double expected = 6.0;
		Budget budget = new Budget(100D);
		Tax iss = new ISSCalculator();
		assertEquals(expected, iss.calculate(budget));
	}
	
	@Test
	public void testICMS() {
		double expected = 5.0;
		Budget budget = new Budget(100D);
		Tax icms = new ICMSCalculator();
		assertEquals(expected, icms.calculate(budget));
	}

}
