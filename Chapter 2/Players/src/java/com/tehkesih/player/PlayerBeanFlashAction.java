/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.faces.event.ComponentSystemEvent;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PlayerBeanFlashAction {
    
    private final static Logger logger = Logger.getLogger(PlayerBeanFlashAction.class.getName());
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
    
    public String addValuesToFlashAction(){
        
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        flash.put("playerName", playerName);
        flash.put("playerSurname", playerSurname);
        
        return "terms?faces-redirect=true";
    }
    
    public void pullValuesFromFlashAction(ComponentSystemEvent e){
        
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        playerName = (String) flash.get("playerName");
        playerSurname = (String) flash.get("playerSurname");
    }
    
    public String termsAcceptedAction() {
        
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        
        flash.setKeepMessages(true);
        pullValuesFromFlashAction(null);
        
        logger.log(Level.INFO, "First name: {0}", playerName);
        logger.log(Level.INFO, "Last name : {1}", playerSurname);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Terms accepted and player registered"));
        
        return "done?faces-redirect=true";
        
    }
    
    public String termsRejectedAction() {
        
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        
        flash.setKeepMessages(true);
        pullValuesFromFlashAction(null);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Terms rejected and player not registered"));
        
        return "register?faces-redirect=true";
    }
    
    
}
