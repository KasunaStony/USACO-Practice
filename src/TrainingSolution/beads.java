
package TrainingSolution;
/*
ID: maruili1
LANG: JAVA
TASK: beads
*/

/**
 *
 * @author maruiling
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class beads {
    
    public static int BtoF(String s){
        
        int count = 0;
        char colour = 'N';
        for(int i = s.length()-1; i >=0; i--){
            if(s.charAt(i) != 'w'){
                colour = s.charAt(i);
                break;
            }
            
        }
        for(int i = s.length()-1; i >= 0; i--){
            
            if(colour == s.charAt(i)| s.charAt(i) == 'w'){
                count++;
            }
            else{
                break;
            }
        }
        
        return count;
        
    }
    
    public static int FtoB(String s){
        
         int count = 0;
        char colour = 'N';
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != 'w'){
                colour = s.charAt(i);
                break;
            }
        }
       // System.out.println(colour);
        for(int i = 0; i < s.length(); i++){
            
            if(colour == s.charAt(i)| s.charAt(i) == 'w'){
                count++;
            }
            else{
                break;
            }
        }
        return count;
        
    }
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("beads.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("beads.out"));
        
        int n = Integer.parseInt( reader.readLine() );
        
        String necklace = reader.readLine();
        necklace = necklace.substring(0, n);
        
        String doubleNecklace = necklace + necklace;
      //  System.out.print(doubleNecklace);
        
        String first;
        String second;
        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            
            first = doubleNecklace.substring(0, i + 1);
            //System.out.println(first);
            second = doubleNecklace.substring(i + 1);
            count = BtoF(first) + FtoB(second);
            //System.out.println(second);
            //System.out.println(BtoF(first));
            //System.out.println(FtoB(second));
            
            if(max < count)
                max = count;
        }
        if(max > n)
            max = n;
        writer.write(String.valueOf(max) + "\n");
        //System.out.print(max);
        reader.close();
        writer.close();
    }
    
}
