package com.pl.premier_zone.player;

import jakarta.persistence.*;

@Entity
@Table(name = "liverpool_players", schema = "public")
public class Player {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "name")
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getApps() {
        return apps;
    }

    public void setApps(int apps) {
        this.apps = apps;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }
}
