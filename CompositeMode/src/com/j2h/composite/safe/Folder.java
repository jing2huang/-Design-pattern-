package com.j2h.composite.safe;

import java.util.ArrayList;
import java.util.List;

//树枝构件：文件类--》存储和管理子部件
public class Folder extends File {

	private List<File> files;
	
	public Folder(String name) {
		super(name);
		files = new ArrayList<File>();
	}

	@Override
	public void display() {
		System.out.println(getName());
		for (File file : files) {
			if (file instanceof Folder) {
				System.out.print(getName() + "/");
			}
			file.display();
		}
	}
	
	//树枝构件管理树叶构件的方法
	public void add(File file) {
		files.add(file);
	}
	
	public void remove(File file) {
		files.remove(file);
	}
}
