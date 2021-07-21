package com.j2h.delegate;

import java.util.HashMap;
import java.util.Map;

public class Manager implements IEmployee {

	// 经理掌握着手下所有员工的信息 
	private Map<String, IEmployee> eMap = new HashMap<>();
	
	public Manager() {
		eMap.put("UI", new EmployeeA());
		eMap.put("JAVA", new EmployeeB());
	}

	@Override
	public void work(String task) {
		//根据任务性质（策略），将任务委派（代理）给对应的雇员
		eMap.get(task).work(task);
	}
}