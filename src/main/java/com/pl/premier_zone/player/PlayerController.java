package com.pl.premier_zone.player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

//    @GetMapping
//    public List<Player> getPlayers(
//            @RequestParam(required = false) String team,
//            @RequestParam(required = false) String name,
//            @RequestParam(required = false) String position,
//            @RequestParam(required = false) String nationality
//    ){
//
//    }
}
