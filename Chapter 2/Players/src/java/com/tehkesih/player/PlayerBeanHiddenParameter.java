/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.Cookie;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PlayerBeanHiddenParameter {
    
    private String playerName;
    private String playerSurname;
    private String playerPassword;

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
    
    public String parameterAction() {
        
        return "hiddenparameterdone";
    }

    /**
     * @return the playerPassword
     */
    public String getPlayerPassword() {
        return playerPassword;
    }

    /**
     * @param playerPassword the playerPassword to set
     */
    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }
    
    public String passwordAction(){
        
        return "hiddenparameterdone";
    }
    
}
