package observer;

import java.util.List;

public abstract class Observable<E> {
    private List<Observer<E>> observers;

    public Observable() {
    }

    public boolean addObserver(Observable<E> observable) {
        return false;
    }

    public void notifyObservables(E type) {

    }
}
