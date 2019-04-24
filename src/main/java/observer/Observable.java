package observer;

import domain.Food;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    public Observable() {
    }

    public boolean addObserver(Observer observer) {
        return observers.add(observer);
    }

    public void notifyObservers(Food value) {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }
}
