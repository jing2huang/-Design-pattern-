package com.j2h.facade;

//外观角色：提供统一接口
public class Facade {

	private PaySystem payS;
	private InventorySystem inventoryS;
	private IntegralSystem integralS;
	
	public Facade() {
		payS = new PaySystem();
		inventoryS = new InventorySystem();
		integralS = new IntegralSystem();
	}
	
	public void shop() {
		payS.pay();
		inventoryS.subInventory();
		integralS.getIntegral();
	}
	
}