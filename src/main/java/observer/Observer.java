package observer;

public interface Observer<E> {
    void update(Observable<E> object);
}
