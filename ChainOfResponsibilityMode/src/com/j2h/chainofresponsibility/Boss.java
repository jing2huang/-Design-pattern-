package com.j2h.chainofresponsibility;

//具体处理者：老板
public class Boss extends Leader {

	@Override
	public void handleRequest(int leaveDays) {
		if (leaveDays <= 15) {
			System.out.println("请假天数超过3天但不超过15天，由BOSS审批批准！");
		} else {
			System.out.println("请假天数过多，BOSS不予批准！");
		}
	}
}