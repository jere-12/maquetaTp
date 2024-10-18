package service;

import model.Player;

public interface MatchService {

    public Player getWinner(Player player1, Player player2);
}
