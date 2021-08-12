package com.j2h.composite.safe;

import java.util.ArrayList;
import java.util.List;

//��֦�������ļ���--���洢�͹����Ӳ���
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
	
	//��֦����������Ҷ�����ķ���
	public void add(File file) {
		files.add(file);
	}
	
	public void remove(File file) {
		files.remove(file);
	}
}
