package model;

import java.util.List;
import java.util.UUID;

public class Round {
    UUID id;
    List<Round> matches;
    RoundType roundType;

    public Round(UUID id, List<Round> matches, RoundType roundType) {
        this.id = id;
        this.matches = matches;
        this.roundType = roundType;
    }

    public UUID getId() {
        return id;
    }

    public List<Round> getMatches() {
        return matches;
    }

    public RoundType getRoundType() {
        return roundType;
    }
}
