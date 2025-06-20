package com.pl.premier_zone.player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Component

public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    ;

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayerFromSquad (String playerName){
        return (List<Player>) playerRepository.findAll()
                .stream().filter(player -> playerName.equals(player.getName()))
                .collect(Collectors.toList());
    }
}


