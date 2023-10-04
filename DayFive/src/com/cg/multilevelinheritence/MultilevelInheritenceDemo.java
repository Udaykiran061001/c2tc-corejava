package com.cg.multilevelinheritence;

public class MultilevelInheritenceDemo {

	public static void main(String[] args) {
		City c = new City();
		c.setCountryName("India");
		c.setCapital("Bengaluru");
		c.setStateName("Karnataka");
		c.setLocation("Near Andhra Pradesh");
		c.setLanguage("Kannada");
		c.setCityName("Ballari");
		c.setPincode(583104);
		System.out.println(c);
	}

}
