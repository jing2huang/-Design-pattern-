package com.j2h.iterator;

//具体迭代器角色:具体遍历集合中元素
public class BookShelfIterator implements Iterator {

	private BookShelf shelf;
	private int index;
	
	public BookShelfIterator(BookShelf shelf) {
		this.shelf = shelf;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if (this.index < shelf.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		Book book = shelf.getBookAt(this.index);
		this.index++; //指向下一个
		return book;
	}

}