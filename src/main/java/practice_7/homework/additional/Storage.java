package practice_7.homework.additional;

public class Storage<T> {
    private T item;

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }

    public static void main(String[] args) {
        Storage<String> storage1 = new Storage<>();
        storage1.set("element");
        System.out.println(storage1.get());

        Storage<Integer> storage2 = new Storage<>();
        storage2.set(5);
        System.out.println(storage2.get());
    }
}
