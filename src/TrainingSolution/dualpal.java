package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: dualpal
*/

/**
 *
 * @author maruiling
 */
import java.io.*;
import java.util.*;

public class dualpal {
    
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
    
    public static boolean anyTwoBaseIsPal(int n){
       
        int count = 0;
        for(int i = 2; i <= 10; i++){
            if(isPal(convert(n, i))){
                count++;
            }
        }
        return count >= 2;
    }
    
    public static void main(String args[])throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader(new File("dualpal.in")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("dualpal.out")));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        int[] a = new int[n];
        
        int count = 0;
        s++;
        while(count < n){
            if(anyTwoBaseIsPal(s)){
                a[count] = s;
                count ++;
                s++;
            }else{
                s++;
            }
        }
        
        for(int i = 0; i < a.length; i++){
            writer.write(a[i]+"\n");
        }
        
        writer.close();
        reader.close();
        
        
    }
    
}
