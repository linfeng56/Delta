package com.github.delta.cxw.pattern.observer.improve;


public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
