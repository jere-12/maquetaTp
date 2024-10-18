package model;

import java.time.LocalDate;

public class Player extends Person {
    Integer code;
    Integer score;
    Boolean isEliminated;

    public Player(Integer id, String name, String lastName, String nationality, LocalDate dateOfBirth, Integer code, Boolean isEliminated, Integer score) {
        super(id, name, lastName, nationality, dateOfBirth);
        this.code = code;
        this.isEliminated = isEliminated;
        this.score = score;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getEliminated() {
        return isEliminated;
    }

    public void setEliminated(Boolean eliminated) {
        isEliminated = eliminated;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
