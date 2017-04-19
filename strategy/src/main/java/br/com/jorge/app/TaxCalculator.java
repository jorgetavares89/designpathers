package br.com.jorge.app;

import br.com.jorge.entity.Budget;
import br.com.jorge.interfaces.Tax;
import br.com.jorge.service.ICMSCalculator;
import br.com.jorge.service.ISSCalculator;

public class TaxCalculator {

	public static void main(String[] args) {
		Tax icms = new ICMSCalculator();
		Tax iss = new ISSCalculator();
		Budget budget = new Budget(50);
		System.out.println("ICMS value: "+icms.calculate(budget));
		System.out.println("ISS value: "+iss.calculate(budget));
	}
	
	
}
