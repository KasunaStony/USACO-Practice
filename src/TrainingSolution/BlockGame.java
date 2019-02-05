/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrainingSolution;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author maruiling
 */
public class BlockGame {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("square.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("square.out"));
        StringTokenizer st;
        
        int n = Integer.parseInt( reader.readLine() );
        
        String data[][] = new String[n][2];
        
        for( int i = 0; i < n; i ++ ) {
            st = new StringTokenizer(reader.readLine());
            data[i][0] = st.nextToken();
            data[i][1] = st.nextToken();
        }
        
        String s;
        
       
       // String x[][] = new String[N][2];
        
        
        
        
        
        
        
    }
    
}
