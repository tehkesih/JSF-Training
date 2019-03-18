/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.playerbean;

import javax.el.ELContext;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class ProfileBeanProgrammatically {
    
    public void viewProfile(){
    
        FacesContext context = FacesContext.getCurrentInstance();
        ELContext elcontext = context.getELContext();
        
        //approach 1
        PlayerBeanProgrammatically playerBean_1 = (PlayerBeanProgrammatically) context.getApplication()
                .evaluateExpressionGet(context, "#{playerBeanProgrammatically}", PlayerBeanProgrammatically.class);
        
        if (playerBean_1 != null){
            playerBean_1.playerNameSurnameAction(1);
        } else {
            System.out.println("Session Bean Not Found 1!");
        }
        
        //approach 2
        PlayerBeanProgrammatically playerBean_2 = (PlayerBeanProgrammatically) elcontext.getELResolver()
                .getValue(elcontext, null, "PlayerBeanProgrammatically");
        
        if (playerBean_2 != null){
            playerBean_2.playerNameSurnameAction(2);
        } else {
            System.out.println("Session Bean Not Found 2!");
        }
        
        //approach 3
        PlayerBeanProgrammatically playerBean_3 = (PlayerBeanProgrammatically) context.getApplication()
                .getExpressionFactory().createValueExpression(elcontext, "#{PlayerBeanProgrammatically}", 
                        PlayerBeanProgrammatically.class).getValue(elcontext);
        
        if (playerBean_3 != null){
            playerBean_3.playerNameSurnameAction(3);
        } else {
            System.out.println("Session Bean Not Found 3!");
        }
        
    }
    
}
