/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIInput;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PlayerBeanAttribute {
    
    private UIInput htmlInputText = null;

    /**
     * @return the htmlInputText
     */
    public UIInput getHtmlInputText() {
        return htmlInputText;
    }

    /**
     * @param htmlInputText the htmlInputText to set
     */
    public void setHtmlInputText(UIInput htmlInputText) {
        this.htmlInputText = htmlInputText;
    }
    
    public String getPlayerNameSurname() {
        return (String) htmlInputText.getAttributes().get("playerNameAttr");
    }
    
}
