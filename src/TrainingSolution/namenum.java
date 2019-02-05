package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: namenum
*/


/**
 *
 * @author maruiling
 */
import java.util.*;
import java.io.*;

public class namenum {
    
    public static String determineNumber(char c){
        
        if(c == 'A' || c == 'B' || c == 'C'){
            return "2";
        }else if(c == 'D' || c == 'E' || c == 'F'){
            return "3";
        }else if(c == 'G' || c == 'H' || c == 'I'){
            return "4";
        }else if(c == 'J' || c == 'K' || c == 'L'){
            return "5";
        }else if(c == 'M' || c == 'N' || c == 'O'){
            return "6";
        }else if(c == 'P' || c == 'R' || c == 'S'){
            return "7";
        }else if(c == 'T' || c == 'U' || c == 'V'){
            return "8";
        }else if(c == 'W' || c == 'X' || c == 'Y'){
            return "9";
        }else{
            return "-1";
        }
        
    }
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader(new File("dict.txt")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("namenum.out")));
        
        ArrayList<String> origin = new ArrayList<String>();
        ArrayList<String> dict = new ArrayList<String>();
        
        String s = reader.readLine();
        String number = "";
        
        while(s != null){
            origin.add(s);
            for(int i = 0; i < s.length(); i++){
                number += determineNumber(s.charAt(i));
            }
            dict.add(number);
            s = reader.readLine();
            number = "";
            
        }
        
        reader = new BufferedReader(new FileReader(new File("namenum.in")));
        
        String n = reader.readLine();
        
        boolean hasAnswer = false;
        for(int i = 0; i < dict.size(); i++){
            if(dict.get(i).contains("-")){
                continue;
            }
            if(dict.get(i).compareTo(n) == 0){
                writer.write(origin.get(i)+"\n");
                hasAnswer = true;
            }
        }
        
        if(!hasAnswer){
            writer.write("NONE" + "\n");
        }
        
        writer.close();
        reader.close();
        
    }
    
}
