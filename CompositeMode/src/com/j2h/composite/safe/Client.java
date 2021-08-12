package com.j2h.composite.safe;

public class Client {

	public static void main(String[] args) {
		Folder c = new Folder("c≈Ã");
		c.add(new TextFile("1.txt"));
		
		Folder video = new Folder("video");
		video.add(new VideoFile("1.mp3"));
		video.add(new VideoFile("2.mp4"));
		c.add(video);
		c.display();
	}

}