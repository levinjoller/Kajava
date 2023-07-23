package org.leviosa.kata;

import static org.leviosa.kata.RpsOptions.*;

public class RockPaperScissors {
    public static final String PLAYER_ONE_WON = "Player 1 won!";
    public static final String PLAYER_TWO_WON = "Player 2 won!";
    public static final String DRAW = "Draw!";

    public String rps(RpsOptions player1, RpsOptions player2) {
        if (player1 == player2) {
            return DRAW;
        }
        if (isPlayerOneWinner(player1, player2)) {
            return PLAYER_ONE_WON;
        }
        return PLAYER_TWO_WON;
    }

    private boolean isPlayerOneWinner(RpsOptions player1, RpsOptions player2) {
        return (player1 == ROCK && player2 == SCISSORS) //
                || (player1 == SCISSORS && player2 == PAPER) //
                || (player1 == PAPER && player2 == ROCK);
    }
}
