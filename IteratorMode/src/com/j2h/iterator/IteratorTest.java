package com.j2h.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		BookShelf shelf = new BookShelf();
		shelf.add(new Book("ͼ��TCP/IP"));
		shelf.add(new Book("java���˼��"));
		shelf.add(new Book("�����ģʽ"));
		shelf.add(new Book("JVM�����"));
		Iterator iterator = shelf.iterator();
		while(iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
	}

}