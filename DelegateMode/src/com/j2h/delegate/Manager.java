package com.j2h.delegate;

import java.util.HashMap;
import java.util.Map;

public class Manager implements IEmployee {

	// ������������������Ա������Ϣ 
	private Map<String, IEmployee> eMap = new HashMap<>();
	
	public Manager() {
		eMap.put("UI", new EmployeeA());
		eMap.put("JAVA", new EmployeeB());
	}

	@Override
	public void work(String task) {
		//�����������ʣ����ԣ���������ί�ɣ���������Ӧ�Ĺ�Ա
		eMap.get(task).work(task);
	}
}