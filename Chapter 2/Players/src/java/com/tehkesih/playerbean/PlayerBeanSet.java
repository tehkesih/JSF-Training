/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.playerbean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */

@Named
@RequestScoped
public class PlayerBeanSet {
    
    public void playerSetAction(){
        ApplicationMapHelper.setValueInApplicationMap("PlayersBeanSet.name", "Rafael");
        ApplicationMapHelper.setValueInApplicationMap("PlayersBeanSet.surname", "Nadal");
    }
}
