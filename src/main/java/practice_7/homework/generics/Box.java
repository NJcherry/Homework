package practice_7.homework.generics;

public class Box<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("Element");
        System.out.println(box1.get());

        Box<Integer> box2 = new Box<>();
        box2.set(12);
        System.out.println(box2.get());
    }
}
