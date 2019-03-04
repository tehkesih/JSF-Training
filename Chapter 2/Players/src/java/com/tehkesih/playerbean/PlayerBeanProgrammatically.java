/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.playerbean;


import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@SessionScoped
public class PlayerBeanProgrammatically implements Serializable{

    private final static Logger logger = Logger.getLogger(PlayerBeanProgrammatically.class.getName());
    
    private String playerName = "";
    private String playerSurname = "";
    
    public PlayerBeanProgrammatically(){}
    
    
    @PostConstruct
    public void init(){
        logger.info("PlayerBeanProgrammatically was successfully initializated");
    }
    
    public void playerNameSurnameAction(int i) {
        logger.log(Level.INFO, "Called from ProfileBean! Approach:{0}", i);
        logger.log(Level.INFO, "{0} {1}", new Object[]{playerName, playerSurname});
    }

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
    }
    
}
