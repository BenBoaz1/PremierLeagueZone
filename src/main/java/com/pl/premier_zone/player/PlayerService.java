package com.pl.premier_zone.player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component //

public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }


    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getName()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByPlayerName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getName()
                        .toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayerByPosition(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPosition()
                        .toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());


    }

    public List<Player> getPlayerByNationality(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getNationality()
                        .toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

public List <Player> getPlayerByTeamAndPosition (String teamName, String position){
        return playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getName()) &&
                        position.equals(player.getPosition()))
                .collect(Collectors.toList());
}

    public Player addPlayer(Player player) {
        playerRepository.save(player);
        return player;
    }

    public Player updatePlayer(Player updatePlayer) {
        Optional<Player> existingPlayer = playerRepository
                .findByName(updatePlayer.getName());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(updatePlayer.getName());
            playerToUpdate.setAge(updatePlayer.getAge());
            playerToUpdate.setGoals(playerToUpdate.getGoals());
            playerToUpdate.setAssists(playerToUpdate.getAssists());
            playerToUpdate.setPosition(playerToUpdate.getPosition());
            playerToUpdate.setNumber(playerToUpdate.getNumber());

            playerRepository.save(playerToUpdate);

            return playerToUpdate;
        }
     return null;
    }

    @Transactional //makes sure the operation is transaction
    public void deletePlayer (String playerName){
        playerRepository.deleteByName(playerName);
    }
}


