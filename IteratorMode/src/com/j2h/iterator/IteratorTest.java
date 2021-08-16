package com.j2h.iterator;

public class IteratorTest {

	public static void main(String[] args) {
		BookShelf shelf = new BookShelf();
		shelf.add(new Book("图解TCP/IP"));
		shelf.add(new Book("java编程思想"));
		shelf.add(new Book("大话设计模式"));
		shelf.add(new Book("JVM虚拟机"));
		Iterator iterator = shelf.iterator();
		while(iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
	}

}