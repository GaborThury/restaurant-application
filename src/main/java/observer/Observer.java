package observer;

import domain.Food;

public interface Observer<E> {
    void update(Food value);
}
