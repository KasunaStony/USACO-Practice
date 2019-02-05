package TrainingSolution;

/*
ID: KasunaStony
LANG: JAVA
TASK: friday
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class SquarePasture {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("square.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("square.out"));
    
        int x[] = new int[4];
        int y[] = new int[4];
        
      
            
            StringTokenizer st = new StringTokenizer(reader.readLine());
            x[0] = Integer.parseInt(st.nextToken());
            y[0] = Integer.parseInt(st.nextToken());
            x[1] = Integer.parseInt(st.nextToken());
            y[1] = Integer.parseInt(st.nextToken());
            StringTokenizer p = new StringTokenizer(reader.readLine());
            x[2] = Integer.parseInt(p.nextToken());
            y[2] = Integer.parseInt(p.nextToken());
            x[3] = Integer.parseInt(p.nextToken());
            y[3] = Integer.parseInt(p.nextToken());
        
        
      
        
        
        Arrays.sort(x);
        
       int wide = x[3] - x[0];
        
       // System.out.print(wide);
        
        Arrays.sort(y);
        
        int height = y[3] - y[0];
        
        int result;
        
        if(height >= wide){
            result = (int)Math.pow(height, 2);
            writer.write(String.valueOf(result));
        }else{
            result = (int)Math.pow(wide, 2);
            writer.write(String.valueOf(result));
        }
        reader.close();
        writer.close();
    }
    
    
    
    
}
