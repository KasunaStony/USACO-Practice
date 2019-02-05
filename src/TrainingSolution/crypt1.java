package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: crypt1
*/

/**
 *
 * @author maruiling
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;

public class crypt1 {
    
    static int[] set;
    public static boolean isProductInSet(int three, int two){
        
        int product1 = three * (two%10);
        int product2 = three * ((two/10)%10);
        int product = three * two;
        
        if(product1 / 100 == 0 || product1 / 100 >= 10 || product2 / 100 == 0 || product2 / 100 >= 10)return false;
        return(isInSet(product1) && isInSet(product2) && isInSet(product));
    }
    public static boolean isDigitInSet(int n){
        
        for(int i = 0; i < set.length; i++){
            if(set[i] == n)return true;
        }
        return false;
    }
    
    public static boolean isInSet(int n){
        
        //boolean result = true;
        
        if(!isDigitInSet(n%10))return false;
        n = n/10;
        if(!isDigitInSet(n%10))return false;
        n = n/10;
        if(n >= 100){
            if(!isDigitInSet(n%10))return false;
            n = n/10;
            if(!isDigitInSet(n%10))return false;
            n = n/10;
            if(!isDigitInSet(n%10))return false;
        }else if(n >= 10){
            if(!isDigitInSet(n%10))return false;
            n = n/10;
            if(!isDigitInSet(n%10))return false;
        }else if(n >= 1){
            if(!isDigitInSet(n%10))return false;
        }
        return true;
    }
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader("crypt1.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("crypt1.out"));
        
        int n = Integer.parseInt( reader.readLine() );
        StringTokenizer st = new StringTokenizer(reader.readLine());
        set = new int[n];
        
        for(int i = 0; i < n; i++){
            set[i] = Integer.parseInt(st.nextToken());
        }
        //System.out.println(isInSet(111));
        int threeD = 0;
        int twoD = 0;
        int count= 0;
        for(int i = 0; i < set.length; i++){
            for(int j = 0; j < set.length; j++){
                for(int k = 0; k < set.length; k++){
                    for(int a = 0; a < set.length; a++){
                        for(int b = 0; b < set.length; b++){
                            threeD = set[i] *100 + set[j] *10 + set[k];
                            twoD = set[a]*10 + set[b];
                            if(isProductInSet(threeD, twoD)){
                                count ++;
                                //System.out.println(threeD + " " + twoD);
                            
                            }
                        }
                    }
                }
            }
        }
        
        writer.write(count + "\n");
        writer.close();
        writer.close();
        
        
        
    }
    
}
