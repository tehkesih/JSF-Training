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
public class Test {

    
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
        
        
        String input = "C:\\Users\\user\\Desktop\\apigateway.log";
        String output = "C:\\Users\\user\\Desktop\\test.log";
        
        
        FileInputStream fis = null;
        Scanner sc = null;
        
        
        String[] date = new String[1000000];
        String[] time = new String[1000000];
        String[] info = new String[1000000];
        String[] status = new String[1000000];
        String[] requestId = new String[1000000];
        String[] start = new String[1000000];
        String[] ipAddress = new String[1000000];
        String[] code = new String[1000000];
        
        try {
            fis = new FileInputStream(input);
            sc = new Scanner(fis, "UTF-8");
            int i = 0;
            
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                String[] splitPipe = line.split("\\|");
                String[] splitSpace = line.split(" ");
                if (!line.isEmpty() && splitPipe.length > 1){
                    System.out.println("hi" + splitPipe[1] + i + splitSpace[2]);
                    String getInfo = splitSpace[2];
                    String getStatus = splitPipe[1].trim();
                    System.out.println("getStatus" + getStatus);
                    if (getInfo.equals("INFO") && action.contains(getStatus)){
                        System.out.println("testing " + splitPipe.length + " " + splitSpace.length);
                        info[i] =  splitSpace[2];
                        status[i] = splitPipe[1].trim();
                        date[i] = splitSpace[0];
                        time[i] = splitSpace[1];
                        requestId[i] = splitPipe[2].trim();
                        start[i] = splitPipe[3].trim();
                        ipAddress[i] = splitPipe[4].trim();
                        
                        if (start[i].equals("End")){
                            code[i] = splitPipe[5].trim();
                        }
                        else 
                            code[i]="";
                        System.out.println("haha "+ ipAddress[i] + code[i]);
                        i++;
                    }
                    else if (getInfo.equals("INFO") && action2.contains(getStatus)){
                        System.out.println("testing " + splitPipe.length + " " + splitSpace.length);
                        info[i] =  splitSpace[2];
                        status[i] = splitPipe[1].trim();
                        date[i] = splitSpace[0];
                        time[i] = splitSpace[1];
                        requestId[i] = "";
                        start[i] = splitPipe[2].trim();
                        ipAddress[i] = splitPipe[3].trim();
                        
                        if (start[i].equals("End")){
                            code[i] = splitPipe[4].trim();
                        }
                        else 
                            code[i]="";
                        System.out.println("haha "+ ipAddress[i] + code[i]);
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
                    String write = date[j]+ "|" + time[j]+"|" +status[j]+"|" +requestId[j]+"|" +start[j]+"|" +ipAddress[j]+"|" +code[j]+"\n";
                    System.out.println("write " + write);
                    byte[] writeContent = write.getBytes();
                    
                    fos.write(writeContent);
                    fos.flush();
                    
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
