package com.j2h.composite.safe;

public class VideoFile extends File {

	public VideoFile(String name) {
		super(name);
	}

	@Override
	public void display() {
		System.out.println("videoÎÄ¼ş==¡·" + getName());
	}

}
