package com.j2h.delegate;

public class EmployeeB implements IEmployee {

	@Override
	public void work(String task) {
		System.out.println("I'm B, my work is " + task);
	}

}