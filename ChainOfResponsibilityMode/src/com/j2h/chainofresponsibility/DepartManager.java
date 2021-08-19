package com.j2h.chainofresponsibility;

//具体处理者：部门经理
public class DepartManager extends Leader {

	@Override
	public void handleRequest(int leaveDays) {
		if (leaveDays <= 3) {
			System.out.println("请假条数不超过3天，部门经理批准！");
		} else {
			getNext().handleRequest(leaveDays);
		}
	}

}