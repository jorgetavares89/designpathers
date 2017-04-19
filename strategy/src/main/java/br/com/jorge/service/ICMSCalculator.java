package br.com.jorge.service;

import br.com.jorge.entity.Budget;
import br.com.jorge.interfaces.Tax;

public class ICMSCalculator implements Tax {

	public double calculate(Budget budget) {
		return budget.getValue() * 0.05;
	}

}
