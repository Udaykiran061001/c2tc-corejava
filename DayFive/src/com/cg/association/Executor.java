package com.cg.association;

public class Executor {

	public static void main(String[] args) {
		
		Address a1 = new Address(7, "Nagar", "Ballari", "Karnataka", 583104);
		Person p1 = new Person("Uday", a1, "B70");
		
//		Person p1 = new Person("Uday", new Address(7, "Nagar", "Ballari", "Karnataka", 583104);
		
		p1.display();
	}

}
