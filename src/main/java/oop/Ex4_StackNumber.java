package oop;

import java.util.ArrayList;
import java.util.List;

public class Ex4_StackNumber<T> {

    private List<T> stackNumber = new ArrayList<>();

    public void push(T num) {
        stackNumber.add(num);
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T result = stackNumber.get(stackNumber.size() - 1);
        stackNumber.remove(result);
        return result;
    }

    public T peek() {
        return isEmpty() ? null : stackNumber.get(0);
    }

    public boolean isEmpty() {
        return stackNumber.isEmpty();
    }
}
