/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tehkesih.suwarno
 */
public class OCSPProxy {

    
    private static final String test ="Enroll Certificate";
    private static final String test2 ="Renew Certificate";
    private static final String test3="Suspend Certificate";
    private static final String test4 ="Reactivate Certificate";
    private static final String test5="Revoke Certificate";
    private static final String test6 ="Get Certificate";
    private static final String test7 ="Get Certificate By Username";
    private static final String test8 ="Get Certificate Status";
    
    public static void main(String[] args) {
        
        ArrayList<String> action = new ArrayList();
        ArrayList<String> action2 = new ArrayList();
        action.add(test);
        action.add(test2);
        action.add(test3);
        action.add(test4);
        action.add(test5);
        
        action2.add(test6);
        action2.add(test7);
        action2.add(test8);
        
        
        String input = "C:\\Users\\user\\Desktop\\ocspProxy.log";
        String output = "C:\\Users\\user\\Desktop\\test2.log";
        
        
        FileInputStream fis = null;
        Scanner sc = null;
        
        
        String[] date = new String[1000000];
        String[] time = new String[1000000];
        String[] info = new String[1000000];
        String[] ocspReq = new String[1000000];
        String[] reqTime = new String[100000];
        
        try {
            fis = new FileInputStream(input);
            sc = new Scanner(fis, "UTF-8");
            int i = 0;
            
            while (sc.hasNextLine()){
                String line = sc.nextLine().trim();
//                String a = line.replaceAll(" ", "");
                int test = line.lastIndexOf("OCSP request");
                int length = line.length();
                String b = line.substring(test, length);
                System.out.println("line " + b);
                System.out.println("test " + test);
//                System.out.println("test " + test);
                String[] splitSpace = line.split(" ");
//                System.out.println(splitSpace.length);
//                System.out.println(splitSpace[0] + " " +splitSpace[1] + " " +splitSpace[2] +" " + splitSpace[3] + " " +splitSpace[4] + " " +splitSpace[5] +" " + splitSpace[6] +" " + splitSpace[7]);
                if (!line.isEmpty()){
                    String getInfo = splitSpace[2];
                    if (getInfo.equals("INFO")){
                        info[i] =  splitSpace[2];
                        date[i] = splitSpace[0];
                        time[i] = splitSpace[1];
                        i++;
                    }
                    else if (getInfo.equals("INFO")){
                        info[i] =  splitSpace[2];
                        date[i] = splitSpace[0];
                        time[i] = splitSpace[1];
                        i++;
                    }
                }else {
                    System.out.println("test");
                    continue;
                }
            }
            
            FileOutputStream fos = null;
            
            try{
                fos = new FileOutputStream(output);
                for (int j = 0; j < i; j++) {
//                    String write = date[j]+ "|" + time[j]+"|" +status[j]+"|" +requestId[j]+"|" +start[j]+"|" +ipAddress[j]+"|" +code[j]+"\n";
//                    System.out.println("write " + write);
//                    byte[] writeContent = write.getBytes();
//                    
//                    fos.write(writeContent);
//                    fos.flush();
                    
                }
                fos.close();
            } catch(Exception ex){}
            finally{
                try {
                    if (fos!= null)
                        fos.close();
                } catch (Exception ex){}
            }

        }catch(Exception ex){}
            finally{
                try {
                    if (fis!= null)
                        fis.close();
                } catch (Exception ex){}
            }
        
        
        
        
    }
    
}
