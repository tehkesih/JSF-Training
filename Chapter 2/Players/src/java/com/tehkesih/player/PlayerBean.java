/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;




import java.util.HashMap;
import java.util.Map;
import java.util.logging.*;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Named;
import java.util.logging.Logger;
import javax.faces.event.ActionEvent;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PlayerBean {
    
    
    public enum Plays {
        Left, Right
    };
    
    private Plays play;
    private final static Logger logger = Logger.getLogger(PlayerBean.class.getName());
    private String playerName = "Rafael";
    private String playerSurname = "Nadal";
    private String[] titles_2013 = {"Sao Paulo", "Acapulco", "ATP Woruld Tour Master 1000 Indian Wells", "Barcelona"};
    private boolean show_prize = false;
    private boolean show_racquet = false;
    private int prize = 60941937;
    private Map<String, String> matchfacts = new HashMap<>();
    private PlayerDetails playerDetails;
    
    public PlayerBean(){
        matchfacts.put("Aces", "12");
        matchfacts.put("Double Faults", "2");
        matchfacts.put("1st Serve", "70%");
        play = Plays.Left;
    }
    
    public String getPlayerName() {
        return playerName;
    }
    
    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    
    public String getPlayerSurname() {
        return playerSurname;
    }
    
    public void setPlayerSurname(String playerSurname) {
        this.playerSurname = playerSurname;
    }
    
    public String[] getTitles_2013() {
        return titles_2013;
    }
    
    public PlayerDetails playerDetails(){
        return playerDetails;
    }

    public Plays getPlay() {
        return play;
    }
    
    public Map<String,String> getMatchFacts() {
        return matchfacts;
    }
    
    public void vamosRafa_1() {
        System.out.println("Vamos Rafa!");
    }
    
    public String vamosRafa_2() {
        return "Vamos Rafa!";
    }
    
    public void vamosRafa_3(String text) {
        System.out.println(text);
    }
    
    public String vamosRafa_4(String name, String surname){
        return "Vamos " + name + " " + surname + "!";
    }
    
    public String vamosRafa_5(){
        return "vamos";
    }
    
    public boolean isShow_prize(){
        return show_prize;
    }
    
    public void showPrizeMoney(){
        this.show_prize = true;
    }
    
    public void hidePrizeMoney(){
        this.show_prize = false;
    }
    
    public int getPrize(){
        return prize;
    }
    
    public boolean isShow_racquet() {
        return show_racquet;
    }
    
    public void showHideRacquetPicture (ValueChangeEvent e){
       
        if (e.getNewValue() == Boolean.TRUE){
            this.show_racquet=true;
        } else {
            this.show_racquet=false;
        }
    }
    
    public String parametersAction() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params = 
                fc.getExternalContext().getRequestParameterMap();
        playerName = params.get("playerNameParam");
        playerSurname = params.get("playerSurnameParam");
        
        return "result";
    }
    
    @PostConstruct
    public void init() {
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String, String> params = fc.getExternalContext().getRequestParameterMap();
        logger.log(Level.INFO, "Name: {0} Surname: {1}", new Object[]{params.get("playerNameParam"), params.get("playerSurnameParam")});
    }
    
    public String toUpperCase(){
        playerName=playerName.toUpperCase();
        playerSurname=playerSurname.toUpperCase();
        
        return "result?faces-redirect=true&includeViewParams=true";
    }
    
    public void attributeAction (ActionEvent evt){
        
        playerName = (String) evt.getComponent().getAttributes().get("playerNameAttr");
        playerSurname = (String) evt.getComponent().getAttributes().get("playerSurnameAttr");
        
        System.out.println("FKKFKFKF"+ playerName + playerSurname);
        logger.log(Level.INFO, "Name : {0} Surname: {1}", new Object[]{playerName, playerSurname});
    }
}
