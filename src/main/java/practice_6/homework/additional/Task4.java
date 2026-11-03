package practice_6.homework.additional;

import java.util.HashSet;

public class Task4 {
    private HashSet<String> pages;
    private int totalCount;

    public Task4() {
        this.pages = new HashSet<>();
        this.totalCount = 0;
    }

    public void visitPage(String url) {
        totalCount++;
        pages.add(url);
    }

    public void printStatistics() {
        System.out.println("Уникальных страниц: " + pages.size());
        System.out.println("Всего посещений: " + totalCount);
    }

    public static void main(String[] args) {
        Task4 pages = new Task4();

        pages.visitPage("google.com");
        pages.visitPage("youtube.com");
        pages.visitPage("google.com");
        pages.visitPage("github.com");
        pages.visitPage("youtube.com");

        pages.printStatistics();
    }
}
