package com.j2h.iterator;

//����ۺϽ�ɫ:�ýӿڵ��ཫ��Ϊһ�����Ա�����Ԫ�صļ���
public interface Aggregate {
	public void add(Object obj);
	//����һ�����ڱ����ĵ�����
	public Iterator iterator();
}