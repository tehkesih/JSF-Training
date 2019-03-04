/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.player;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.inject.Named;

/**
 *
 * @author tehkesih.suwarno
 */
@Named
@RequestScoped
public class PlayerBeanHiddenAttributeBean {
    
    private ArrayList<Player> dataArrayList = new ArrayList<>();
    private final static Logger logger = Logger.getLogger(PlayerBeanHiddenAttributeBean.class.getName());
    private HtmlDataTable table;
    final SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    
    public PlayerBeanHiddenAttributeBean(){
        try {
            dataArrayList.add(new Player(2, "NOVAK DJOKOVIC", (byte) 26, "Belgrade, Serbia", "Monte Carlo, Monaco", (short) 188, (byte) 80, "Boris Becker, Marian Vajda", sdf.parse("22.05.1987")));
            dataArrayList.add(new Player(1, "RAFAEL NADAL", (byte) 27, "Manacor, Mallorca, Spain", "Manacor, Mallorca, Spain", (short) 185, (byte) 85, "Toni Nadal", sdf.parse("03.06.1986")));
            dataArrayList.add(new Player(7, "TOMAS BERDYCH", (byte) 28, "Valasske Mezirici, Czech", "Monte Carlo, Monaco", (short) 196, (byte) 91, "Tomas Krupa", sdf.parse("17.09.1985")));
            dataArrayList.add(new Player(8, "STANISLAS WAWRINKA", (byte) 28, "Lausanne, Switzerland", "St. Barthelemy, Switzerland", (short) 183, (byte) 81, "Magnus Norman", sdf.parse("28.03.1985")));
            dataArrayList.add(new Player(4, "ANDY MURRAY", (byte) 26, "Dunblane, Scotland", "London, England", (short) 190, (byte) 84, "Ivan Lendl", sdf.parse("15.05.1987")));
            dataArrayList.add(new Player(5, "JUAN MARTIN DEL POTRO", (byte) 25, "Tandil, Argentina", "Tandil, Argentina", (short) 198, (byte) 97, "Franco Davin", sdf.parse("23.09.1988")));
            dataArrayList.add(new Player(10, "JO-WILFRIED TSONGA", (byte) 28, "Le Mans, France", "Gingins, Switzerland", (short) 188, (byte) 91, "Nicolas Escude & Thierry Ascione", sdf.parse("17.04.1985")));
            dataArrayList.add(new Player(6, "ROGER FEDERER", (byte) 32, "Basel, Switzerland", "Bottmingen, Switzerland", (short) 185, (byte) 85, "Stefan Edberg, Severin Luthi", sdf.parse("08.08.1981")));
            dataArrayList.add(new Player(9, "RICHARD GASQUET", (byte) 27, "Beziers, France", "Neuchatel, Switzerland", (short) 185, (byte) 75, "Sergi Bruguera and Sebastien", sdf.parse("18.06.1986")));
            dataArrayList.add(new Player(3, "DAVID FERRER", (byte) 31, "Javea, Spain", "Valencia, Spain", (short) 175, (byte) 73, "Jose Francisco Altur", sdf.parse("02.04.1982")));
        } catch (ParseException ex) {
            Logger.getLogger(PlayerBeanHiddenAttributeBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * @return the dataArrayList
     */
    public ArrayList<Player> getDataArrayList() {
        return dataArrayList;
    }

    /**
     * @param dataArrayList the dataArrayList to set
     */
    public void setDataArrayList(ArrayList<Player> dataArrayList) {
        this.dataArrayList = dataArrayList;
    }

    /**
     * @return the table
     */
    public HtmlDataTable getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(HtmlDataTable table) {
        this.table = table;
    }
    
   public void tableAction() {
       logger.log(Level.INFO, "First:{0}", table.getFirst());
       logger.log(Level.INFO," Row count:{0}", table.getRowCount());
       table.setRows(3);
       
               
   }
    
}
