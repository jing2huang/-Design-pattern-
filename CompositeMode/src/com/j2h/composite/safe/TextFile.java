package com.j2h.composite.safe;

public class TextFile extends File {

	public TextFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("�ı��ļ�==��" + getName());
	}

}