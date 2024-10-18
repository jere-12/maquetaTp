package model;

import java.util.UUID;

public class Match {
    UUID id;
    Player playerOne;
    Player playerTwo;
    Result result;
    String cancha;

    public Match(UUID id, Player playerOne, Player playerTwo, Result result, String cancha) {
        this.id = id;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.result = result;
        this.cancha = cancha;
    }

    public UUID getId() {
        return id;
    }

    public Player getPlayerOne() {
        return playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public Result getResult() {
        return result;
    }

    public String getCancha() {
        return cancha;
    }


}
