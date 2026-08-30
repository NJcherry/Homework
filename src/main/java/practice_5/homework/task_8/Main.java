package practice_5.homework.task_8;

public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Museum museum = new Museum();

        museum.manageExhibit(manuscript);
        museum.manageExhibit(sculpture);
    }
}
