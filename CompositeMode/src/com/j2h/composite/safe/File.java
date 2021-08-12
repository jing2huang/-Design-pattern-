package com.j2h.composite.safe;

//���󹹼���ɫ�������ļ���
public abstract class File {

	String name;
	
	public File(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void display();
	
}