package subjects;

import observer.IObserver;

public interface ISubject {
	
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObserver();
}