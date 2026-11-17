package practice_7.homework.generics;

public class Pair<T, U> {
    private T first;
    private U second;

    public void setFirst(T item) {
        this.first = item;
    }

    public T getFirst() {
        return this.first;
    }

    public void setSecond(U item) {
        this.second = item;
    }

    public U getSecond() {
        return this.second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>();

        pair.setFirst("Task");
        pair.setSecond(3);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
