/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@SessionScoped
public class PlayersBean implements Serializable {
    
    private static final Logger logger = Logger.getLogger(PlayersBean.class.getName());
    final String[] players_list = {"Nadal, Rafael (ESP)", "Djokovic, Novak (SRB)", "Ferrer, David (ESP)", "Murray, Andy (GBR)", "Del Potro, Juan Martin (ARG)"};
    private ArrayList players = new ArrayList();
    private String player;
    

    /**
     * @return the players
     */
    public ArrayList getPlayers() {
        return players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(ArrayList players) {
        this.players = players;
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
    
    @PostConstruct
    public void init() {
        logger.log(Level.INFO, "Post Construct reporting : player={0}", player);
    }
    
    public void newPlayer(){
        int nr = new Random().nextInt(4);
        player = players_list[nr];
        players.add(player);
    }
}
