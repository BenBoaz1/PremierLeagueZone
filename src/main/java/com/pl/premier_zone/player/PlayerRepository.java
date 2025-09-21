package com.pl.premier_zone.player;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> // JpaRepository provides CRUD operations
{

    void deleteByName (String playerName); // Custom delete method by player name

    Optional<Player> findByName (String name); // Custom find method by player name

}
