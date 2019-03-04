/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@SessionScoped
public class PlayerBeanSerializable implements Serializable{
    
    private String playerName;
    private String playerSurname;
    
    //Create a new instance of PlayerBean
    public PlayerBeanSerializable(){
        playerName = "Rafael";
        playerSurname = "Nadal";
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
