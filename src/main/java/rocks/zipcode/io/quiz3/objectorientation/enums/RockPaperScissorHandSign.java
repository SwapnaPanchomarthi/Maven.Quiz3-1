package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("SCISSOR", "PAPER"),
    SCISSOR("PAPER", "ROCK"),

    PAPER("ROCK", "SCISSOR");

    String loser;
    String winner;

    RockPaperScissorHandSign(String loser, String winner) {
        this.loser = loser;
        this.winner = winner;
    }

    public RockPaperScissorHandSign getWinner() {

        return RockPaperScissorHandSign.valueOf(this.winner);
    }
    public RockPaperScissorHandSign getLoser() {
        return RockPaperScissorHandSign.valueOf(this.loser);
    }
}