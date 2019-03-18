/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.io.Serializable;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author tehkesih.suwarno
 */
@ManagedBean
@ViewScoped
public class ProfileBean implements Serializable{
    
    private final static Logger LOGGER = Logger.getLogger(PlayerBeanSerializable.class.getName());
    @ManagedProperty("#{playerBeanSerializable}")
    private PlayerBeanSerializable playerBean;
    private String greetings;
    
    public ProfileBean(){}
    

    public void setPlayerBean(PlayerBeanSerializable playerBean) {
        this.playerBean = playerBean;
    }

    @PostConstruct
    public void init(){
        greetings = "Hello, "+ playerBean.getPlayerName() + " "+ playerBean.getPlayerSurname() + " !";
    }
    
    public void greetingAction(){
        LOGGER.info(greetings);
    }
    
}
