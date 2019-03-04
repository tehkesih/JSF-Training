/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.viewAction;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class ViewAction {
    
    private String playerName;
    private String playerSurname;
    
    public ViewAction(){}

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
    
    public String init(){
        
        if ( playerName != null ){
            playerName = playerName.toUpperCase();
        }
        
        if ( playerSurname != null ) {
            playerSurname = playerSurname.toUpperCase();
        }
        
        return "start";
        
    }
    
}
