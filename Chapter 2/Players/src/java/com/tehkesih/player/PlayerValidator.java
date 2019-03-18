/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.util.Random;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author tehkesih.suwarno
 */
@FacesValidator("playerValidator")
public class PlayerValidator implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        
        Random r = new Random();
        int valid = r.nextInt(20);
        System.out.println(valid);
        if (valid < 10) {
            FacesMessage msg = new FacesMessage (" Player name / surname validation failed.", "Details about failure!");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            
            throw new ValidatorException(msg);
        }
        
    }
    
}
