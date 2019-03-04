/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tehkesih.Date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author tehkesih.suwarno
 */
public class generateCommonLangPassword {
    
    
        public static String  generateCommonLangPassword2() {
        
        String upperCaseLetters = RandomStringUtils.random(2, 65, 90, true, true);
        String lowerCaseLetters = RandomStringUtils.random(2, 97, 122, true, true);
        String numbers = RandomStringUtils.randomNumeric(2);
        String specialChar = RandomStringUtils.random(2, 33, 47, false, false);
        String totalChars = RandomStringUtils.randomAlphanumeric(2);
        String combinedChars = upperCaseLetters.concat(lowerCaseLetters)
          .concat(numbers)
          .concat(specialChar)
          .concat(totalChars);

        /*List<Object> pwdChars = combinedChars.chars()
          .mapToObj(new IntFunction<Character>() {
                @Override
                public Character apply(int c) {
                    return (char) c;
                }
            })
          .collect(Collectors.toList());*/
        List<String> letters = Arrays.asList(combinedChars.split(""));
        //List<Character> pwdChars = new ArrayList<Character>();
        Collections.shuffle(letters);
        String password = "";
        
        for (String letter : letters){
            password += letter;
        }
        
        return password;
    }
        
        public static void main (String[] args){
            
            String getPassword = generateCommonLangPassword2();
            int test;
            int test2;

            
            if (5 % 2 == 1){
                test = 5/2;
                test2 = test + 1;
            }else {
                test = test2 = 10/2;
            }
            
            System.out.println(getPassword);
            System.out.println (test);
            
            String test123 = RandomStringUtils.random ( 10, 33, 100, false, false);
            System.out.println(test123);
        }
}
