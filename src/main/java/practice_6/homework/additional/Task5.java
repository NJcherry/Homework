package practice_6.homework.additional;

import java.util.ArrayDeque;

public class Task5 {
    private ArrayDeque<String> actions;

    public Task5() {
        this.actions = new ArrayDeque<>();

        actions.push("Change colour");
        actions.push("Add symbol");
        actions.push("Remove symbol");
        actions.push("Press Enter");
    }

    public void undoAction() {
        System.out.println(actions.pop());
    }

    public static void main(String[] args) {
        Task5 actions = new Task5();

        actions.undoAction();
        actions.undoAction();
    }
}
