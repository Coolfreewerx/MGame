package se.monopoly;

public class MGame {
    private int roundCnt;
    private Die[] dice;
    private Player[] players; // array เพราะมีขนาดที่ชัดเจน
    private Board board;

    private static final int N = 20; // มีหรือไม่มีก็ไม่โดนหักคะแนน

    public MGame() {

    }

    public void playGame() {
        for (roundCnt = 0; roundCnt < N; roundCnt++) {
            playRound();
        }
    }

    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
