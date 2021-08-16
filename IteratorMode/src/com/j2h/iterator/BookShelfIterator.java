package com.j2h.iterator;

//�����������ɫ:�������������Ԫ��
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
		this.index++; //ָ����һ��
		return book;
	}

}