package practice_3;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int newMaxPlayers) {
        maxPlayers =newMaxPlayers;
    }

    public void addPlayer() {
        this.currentPlayers++;
    }

    public void printGameStatus() {
        System.out.println("Название: " + this.gameName + ", текущее количество игроков: " + this.currentPlayers + ", максимальное количество: " + maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings cards = new GameSettings("Карты", 4);
        GameSettings jenga = new GameSettings("Дженга", 2);

        GameSettings.setMaxPlayers(6);
        cards.addPlayer();
        jenga.addPlayer();

        cards.printGameStatus();
        jenga.printGameStatus();
    }
}
