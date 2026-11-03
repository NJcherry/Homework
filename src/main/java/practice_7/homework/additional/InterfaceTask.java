package practice_7.homework.additional;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTask implements Container {
    private List<Object> list;

    @Override
    public void add(Object item) {
        list.add(item);
    }

    @Override
    public Object get() {
        return list;
    }

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add("book");
        list.add(2);
        System.out.println(list);
    }
}
