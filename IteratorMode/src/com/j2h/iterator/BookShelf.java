package com.j2h.iterator;

import java.util.ArrayList;
import java.util.List;

//具体聚合角色:保存多个元素的集合
public class BookShelf implements Aggregate {

	List<Object> list;

	public BookShelf() {
		list = new ArrayList<Object>();
	}
	
	@Override
	public void add(Object obj) {
		list.add(obj);
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

	public int size() {
		return list.size();
	}

	public Book getBookAt(int index) {
		return (Book) list.get(index);
	}
}