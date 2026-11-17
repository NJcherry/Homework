package practice_7.homework.additional;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTask<T> implements Container<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T get() {
        return (T) list;
    }

    public static void main(String[] args) {
        InterfaceTask<Object> container = new InterfaceTask<>();

        container.add("book");
        container.add(2);
        System.out.println(container.get());
    }
}
