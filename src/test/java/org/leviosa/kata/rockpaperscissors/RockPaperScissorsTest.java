package org.leviosa.kata.rockpaperscissors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.leviosa.kata.rockpaperscissors.RockPaperScissors.*;

class RockPaperScissorsTest {
    @ParameterizedTest
    @CsvSource({"ROCK,SCISSORS", "SCISSORS,PAPER", "PAPER,ROCK"})
    void rps_playerOneWins_declarePlayerOneAsWinner(RpsOptions player1, RpsOptions player2) {
        assertEquals(PLAYER_ONE_WON, getRockPaperScissors().rps(player1, player2));
    }

    @ParameterizedTest
    @CsvSource({"SCISSORS,ROCK", "PAPER,SCISSORS", "ROCK,PAPER"})
    void rps_playerTwoWins_declarePlayerTwoAsWinner(RpsOptions player1, RpsOptions player2) {
        assertEquals(PLAYER_TWO_WON, getRockPaperScissors().rps(player1, player2));
    }

    @ParameterizedTest
    @CsvSource({"SCISSORS,SCISSORS", "PAPER,PAPER", "ROCK,ROCK"})
    void rps_identicalOptions_noWinner(RpsOptions player1, RpsOptions player2) {
        assertEquals(DRAW, getRockPaperScissors().rps(player1, player2));
    }

    public RockPaperScissors getRockPaperScissors() {
        return new RockPaperScissors();
    }
}