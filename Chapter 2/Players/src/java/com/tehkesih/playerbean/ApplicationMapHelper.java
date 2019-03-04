/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.playerbean;

import javax.faces.context.FacesContext;


/**
 *
 * @author tehkesih.suwarno
 */
public class ApplicationMapHelper {
    
        public static Object getValueFromApplicationMap(String key){
            return FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().get(key);
        }
        
        public static void setValueInApplicationMap(String key, Object value){
            FacesContext.getCurrentInstance().getExternalContext().getApplicationMap().put(key, value);
        }
    
}
