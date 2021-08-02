package com.j2h.observer;

import java.util.Vector;

//��������
public class Subject {

	protected Vector<Observer> observers = new Vector<>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void delObserver(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer ob : observers) {
			ob.handle();
		}
	}
}