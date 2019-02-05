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
public class ContaminatedMilk {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("USACO.out"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        
        int x[] = new int[D];
        int y[] = new int[D];
        int z[] = new int[D];
        
        for(int i = 0; i < D; i++){
            
            StringTokenizer p = new StringTokenizer(reader.readLine());
            x[i] = Integer.parseInt(p.nextToken());
            y[i] = Integer.parseInt(p.nextToken());
            z[i] = Integer.parseInt(p.nextToken());
            
        }
        
        int s[] = new int[S];
        int t[] = new int[S];
        
        for(int i = 0; i < S; i++){
            
            StringTokenizer p = new StringTokenizer(reader.readLine());
            s[i] = Integer.parseInt(p.nextToken());
            t[i] = Integer.parseInt(p.nextToken());
        }
    }
    
}
