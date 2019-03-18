/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.ELResolver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonard
 */
public class ATPSinglesRankings {
    
    public List<String> getSinglesRankings(){
       
        List<String> atp_ranking= new ArrayList<>();
        
        atp_ranking.add("1 Nadal, Rafael (ESP)");
        atp_ranking.add("2 Djokovic, Novak (SRB)");
        atp_ranking.add("3 Ferrer, David (ESP)");
        atp_ranking.add("4 Murray, Andy (GBR)");
        atp_ranking.add("5 Del Potro, Juan Martin (ARG)");                
        
        return atp_ranking;
    }
    
    public List<String> getSinglesRankingsReversed(){
       
        List<String> atp_ranking= new ArrayList<>();
                
        atp_ranking.add("5 Del Potro, Juan Martin (ARG)");                        
        atp_ranking.add("4 Murray, Andy (GBR)");        
        atp_ranking.add("3 Ferrer, David (ESP)");        
        atp_ranking.add("2 Djokovic, Novak (SRB)");
        atp_ranking.add("1 Nadal, Rafael (ESP)");
                
        return atp_ranking;
    }
    
    public List<String> getSinglesRankingsUpperCase(){
       
        List<String> atp_ranking= new ArrayList<>();
                
        atp_ranking.add("5 Del Potro, Juan Martin (ARG)".toUpperCase());                        
        atp_ranking.add("4 Murray, Andy (GBR)".toUpperCase());        
        atp_ranking.add("3 Ferrer, David (ESP)".toUpperCase());        
        atp_ranking.add("2 Djokovic, Novak (SRB)".toUpperCase());
        atp_ranking.add("1 Nadal, Rafael (ESP)".toUpperCase());
                
        return atp_ranking;
    }
}

