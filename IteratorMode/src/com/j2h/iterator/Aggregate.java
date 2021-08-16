package com.j2h.iterator;

//抽象聚合角色:该接口的类将成为一个可以保存多个元素的集合
public interface Aggregate {
	public void add(Object obj);
	//生成一个用于遍历的迭代器
	public Iterator iterator();
}