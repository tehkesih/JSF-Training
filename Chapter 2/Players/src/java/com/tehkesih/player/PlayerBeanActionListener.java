/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PlayerBeanActionListener {
    
    private final static Logger logger = Logger.getLogger(PlayerBeanActionListener.class.getName());
    private String playerName;
    private String playerSurname;

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
        logger.log(Level.INFO, "Player name (from setPlayerName() method: {0}", playerName);
    }

    /**
     * @return the playerSurname
     */
    public String getPlayerSurname() {
        return playerSurname;
    }

    /**
     * @param playerSurname the playerSurname to set
     */
    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
        logger.log(Level.INFO, "Player surname (from setPlayerSurname() method: {0}", playerSurname);
    }
    
    public void parametersAction(){
        logger.log(Level.INFO, "Player name ( from parametersAction() method : {0}", playerName);
        logger.log(Level.INFO, "Player surname ( from parametersAction() method : {0}", playerSurname);
    }
    
    public void parametersActionListener(ActionEvent e){
        logger.log(Level.INFO, "Player name ( from parametersAction() method : {0}", playerName);
        logger.log(Level.INFO, "Player surname ( from parametersAction() method : {0}", playerSurname);
    }
    
}
