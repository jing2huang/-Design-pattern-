package com.j2h.mediator;

//抽象同事类角色：抽象国家角色
public class Country {

	protected UnitedNations unitedNations;
	public Country(UnitedNations unitedNations) {
		this.unitedNations = unitedNations;
	}
}