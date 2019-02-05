package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: palsquare
*/
/**
 *
 * @author maruiling
 */
import java.util.*;
import java.io.*;

public class palsquare {
    
    public static String convert(int origin, int base){
        
        return Integer.toString(Integer.valueOf(String.valueOf(origin),10),base) ;
    }
    
    public static boolean isPal(String number){
        boolean c = true;
        
        for(int i = 0; i < number.length()/2; i++){
            
           if(number.charAt(i) != number.charAt(number.length()-1-i)){
               
               c = false;
               
               
           }
        }
        return c;
    }
    
    public static void main(String args[])throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader(new File("palsquare.in")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("palsquare.out")));
        
        int base = Integer.parseInt(reader.readLine());
        String number;
        String pow;
        for(int i = 1; i <= 300; i++){
            number = convert(i, base);
            pow = convert((int)(Math.pow(i, 2)), base);
            if(isPal(pow)){
                writer.write(number.toUpperCase() + " " + pow.toUpperCase() + "\n");
            }
            
        }
        
        writer.close();
        reader.close();
        
        
    }
    
    
    
}
