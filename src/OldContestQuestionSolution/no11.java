/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OldContestQuestionSolution;

/**
 *
 * @author maruiling
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class no11 {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        System.out.print(N);
        int iq[] = new int[N];
        int eq[] = new int[N];
        
        int total[] = new int[N];
        
        for(int i = 0; i < N; i++){
            
            StringTokenizer p = new StringTokenizer(reader.readLine());
            
            iq[i] = Integer.parseInt(p.nextToken());
            eq[i] = Integer.parseInt(p.nextToken());
            total[i] = iq[i] + eq[i];
        }
        
         
        
        
    }
    
    
    
}
