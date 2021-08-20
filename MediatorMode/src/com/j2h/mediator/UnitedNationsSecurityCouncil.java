package com.j2h.mediator;

//具体中介者角色：联合国安理会
public class UnitedNationsSecurityCouncil extends UnitedNations {

	private CHINA china;
	private USA usa;

	public void setCHINA(CHINA china) {
		this.china = china;
	}
	
	public void setUSA(USA usa) {
		this.usa = usa;
	}
	
	@Override
	public void declare(String msg, Country country) {
		if (country instanceof CHINA) {
			usa.getMessage(msg);
		} else {
			china.getMessage(msg);
		}
	}

}