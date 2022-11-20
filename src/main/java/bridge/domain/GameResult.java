package bridge.domain;

public class GameResult {
    private int numberOfAttempts = 0;
    private Bridge bridge;
    private GameProgress progress = GameProgress.PLAYING;

    public void increaseAttempt() {
        numberOfAttempts++;
    }
    public void addBlock(String upDown) {
        bridge.addBlock(upDown);
    }
}
