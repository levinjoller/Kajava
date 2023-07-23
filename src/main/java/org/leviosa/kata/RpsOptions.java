package org.leviosa.kata;

public enum RpsOptions {
    ROCK("rock"),
    SCISSOR("scissor"),
    PAPER("paper");

    private final String option;

    RpsOptions(final String option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return option;
    }
}