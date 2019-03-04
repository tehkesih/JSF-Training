/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PreRenderView {
    
    private final static Logger logger = Logger.getLogger(PreRenderView.class.getName());
    private String playerName="Test";
    private String playerSurname="123";
    
    public PreRenderView(){
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @return the playerSurname
     */
    public String getPlayerSurname() {
        return playerSurname;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @param playerSurname the playerSurname to set
     */
    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }
    
    public void init(){
        
        if(!FacesContext.getCurrentInstance().isPostback()){
            logger.info("The init() method was called !!!");
            if (playerName != null){
                playerName = playerName.toUpperCase();
            }
            if (playerSurname != null ){
                playerSurname = playerSurname.toUpperCase();
            }
        }
    }
    
    public void userAction(){
        logger.info("The userAction() method was called!!!");
    }
}
