package model;

import java.util.UUID;

public class Result {
    UUID id;
    Integer setsPlayerOne;
    Integer setsPlayerTwo;

    public Result(Integer setsPlayerOne, Integer setsPlayerTwo) {
        this.setsPlayerOne = setsPlayerOne;
        this.setsPlayerTwo = setsPlayerTwo;
    }
}
