package com.pl.premier_zone.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "liverpool_players")
public class Player {


    @Id
    @Column( name = "name", unique = true)
    private String name;

    private int number;
    private String nationality;
    private String position;
    private double age;
    private int apps;
    private int minutes;
    private int goals;
    private int assists;


    public Player(){
    }

    public Player(String name, int number, String nationality, String position, double age, int apps, int minutes, int goals, int assists) {
        this.name = name;
        this.number = number;
        this.nationality = nationality;
        this.position = position;
        this.age = age;
        this.apps = apps;
        this.minutes = minutes;
        this.goals = goals;
        this.assists = assists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
