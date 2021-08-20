package com.j2h.mediator;

public class MediatorClient {

	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
		CHINA china = new CHINA(unsc);
		USA usa = new USA(unsc);
		unsc.setCHINA(china);
		unsc.setUSA(usa);
		
		china.declare("中国发表声明：台湾是中国领土，台湾问题是中国内政！不容许任何外来势力染指台湾问题!!!");
		usa.declare("美国发表声明：我们承认台湾是中国BABA的领土，我们将不会干涉台湾问题...");
		
	}
}
