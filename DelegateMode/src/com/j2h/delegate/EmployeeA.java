package com.j2h.delegate;

public class EmployeeA implements IEmployee {
	@Override
	public void work(String task) {
		System.out.println("I'm A, my work is " + task);
	}

}