package observer;

import domain.Food;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<E> {
    private List<Observer<E>> observers = new ArrayList<Observer<E>>();

    public Observable() {
    }

    public boolean addObserver(Observer<E> observer) {
        return observers.add(observer);
    }

    public void notifyObservers(Food food) {
        for (Observer observer : observers) {
            observer.update(food);
        }
    }
}
