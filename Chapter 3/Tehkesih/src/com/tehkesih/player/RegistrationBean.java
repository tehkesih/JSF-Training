package com.tehkesih.player;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Random;

@Named
@FlowScoped(value="registration")
public class RegistrationBean implements Serializable {

    private String playerName;
    private String playerSurname;


    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerSurname() {
        return playerSurname;
    }

    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }

    public String getReturnValue(){
        return "/done";
    }

    public String registrationAction(){

        Random r = new Random();
        int nr = r.nextInt(10);

        if (nr < 5){
            playerName="";
            playerSurname="";
            FacesContext.getCurrentInstance().addMessage("password",
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "Registration Failed!", ""));
            return "registration";
        }else {
            return "confirm";
        }
    }
}
