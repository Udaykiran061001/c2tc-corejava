package com.cg.hierachialinheritance;

public class HierachialInheritanceDemo {

	public static void main(String[] args) {
		Student s1 = new Student("Uday", "Male",9999999999L, "ballari", "DKSDC", 9.34f);
		Employee e1 = new Employee("Sujit", "Male", 9999999999L, "ballari", 1, 300000.476F, "Full Stack Developer");
		System.out.println(s1);
		System.out.println(e1);
	}

}
