/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.playerbean;


import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@SessionScoped
public class PlayerBeanGet implements Serializable{
    
    private final static Logger logger = Logger.getLogger(PlayerBeanGet.class.getName());
    
    public void playerGetAction(){
        String name = String.valueOf(ApplicationMapHelper.getValueFromApplicationMap("PlayersBeanSet.name"));
        String surname = String.valueOf(ApplicationMapHelper.getValueFromApplicationMap("PlayersBeanSet.surname"));
        
        logger.log(Level.INFO, "Name: {0} Surname: {1}", new Object[]{name,surname});
    }
    
}
