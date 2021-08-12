package com.j2h.composite.safe;

//抽象构件角色：抽象文件类
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