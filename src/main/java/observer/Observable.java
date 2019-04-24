package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<E> {
    private List<Observer<E>> observers = new ArrayList<Observer<E>>();

    public Observable() {
    }

    public boolean addObserver(Observer<E> observer) {
        return observers.add(observer);
    }

    public void notifyObservers(E value) {
        for (Observer<E> observer : observers) {
            observer.update(value);
        }
    }
}
