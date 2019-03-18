/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PlayerBeanUIComponent {
    
    private static Logger logger = Logger.getLogger (PlayerBeanUIComponent.class.getName());
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
    
    public void processAction(){
     
        UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
        UIComponent uinc = view.findComponent("playerFormId:playerNameId");
        Object prev = ((UIInput) uinc).getAttributes().put("value", "RAFAEL");
        logger.log(Level.INFO, " Name: {0}", String.valueOf(prev));
        
        UIComponent uisc = view.findComponent("playerFormId:playerSurnameId");
        Object current = ((UIInput) uisc).getAttributes().get("value");
        logger.log(Level.INFO," Surname: {0}", String.valueOf(current));
        
    }
    
}
