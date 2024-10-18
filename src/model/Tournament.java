package model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Tournament {
    UUID id;
    String location;
    String surface;
    LocalDate startingDate;
    LocalDate endingDate;
    List<Round> rounds;
    Set<Player> players;

    public Tournament(String location, String surface, LocalDate startingDate, LocalDate endingDate, List<Round> rounds, Set<Player> players) {
        this.location = location;
        this.surface = surface;
        this.startingDate = startingDate;
        this.endingDate = endingDate;
        this.rounds = rounds;
        this.players = players;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public String getSurface() {
        return surface;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }
}

