/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.util.Date;

/**
 *
 * @author tehkesih.suwarno
 */
public class Player implements Comparable<Player>{

    private String player;
    private byte age;
    private String birthplace;
    private String residence;
    private short height;
    private byte weight;
    private String coach;
    private Date born;
    private int ranking;
    
    public Player(){
    }
    
    public Player (int ranking, String player, byte age, String birthplace, String residence, short height,
            byte weight, String coach, Date born){
        
        this.ranking = ranking;
        this.player = player;
        this.age = age;
        this.birthplace = birthplace;
        this.residence = residence;
        this.height = height;
        this.weight = weight;
        this.coach = coach;
        this.born = born;
        
    }
    
    
    
    @Override
    public int compareTo(Player o) {
        return 1;
    }

    /**
     * @return the player
     */
    public String getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(String player) {
        this.player = player;
    }

    /**
     * @return the age
     */
    public byte getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(byte age) {
        this.age = age;
    }

    /**
     * @return the birthplace
     */
    public String getBirthplace() {
        return birthplace;
    }

    /**
     * @param birthplace the birthplace to set
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    /**
     * @return the residence
     */
    public String getResidence() {
        return residence;
    }

    /**
     * @param residence the residence to set
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    /**
     * @return the height
     */
    public short getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(short height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public byte getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(byte weight) {
        this.weight = weight;
    }

    /**
     * @return the coach
     */
    public String getCoach() {
        return coach;
    }

    /**
     * @param coach the coach to set
     */
    public void setCoach(String coach) {
        this.coach = coach;
    }

    /**
     * @return the born
     */
    public Date getBorn() {
        return born;
    }

    /**
     * @param born the born to set
     */
    public void setBorn(Date born) {
        this.born = born;
    }

    /**
     * @return the ranking
     */
    public int getRanking() {
        return ranking;
    }

    /**
     * @param ranking the ranking to set
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }
    
}
