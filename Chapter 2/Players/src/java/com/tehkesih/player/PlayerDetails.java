/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.util.Date;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */

public class PlayerDetails {
    
    private Date birthday;
    private String birthplace;
    
    public Date getBirthday() {
        return birthday;
    }
    public String getBirthplace(){
        return birthplace;
    }
    
}
