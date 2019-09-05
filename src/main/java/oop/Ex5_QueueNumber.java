package oop;

import java.util.List;
import java.util.ArrayList;

public class Ex5_QueueNumber<T> {

    private List<T> queueNumber = new ArrayList<>();

    public void enqueue(T num) {
        queueNumber.add(num);
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        T result = queueNumber.get(0);
        queueNumber.remove(result);
        return result;
    }

    public T peek() {
        return isEmpty() ? null : queueNumber.get(0);
    }

    public boolean isEmpty() {
        return queueNumber.isEmpty();
    }
}
