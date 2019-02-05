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

import java.io.*;
import java.util.*;
public class no4 {
    
    public static void main(String args[]) throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int T = Integer.parseInt(st.nextToken()); 
        int W = Integer.parseInt(st.nextToken());
        
        
        int a[] = new int[T];
        int s[][] = new int[T][W + 1];
        
        for(int i = 0; i < T; i++){
            
            a[i] = Integer.parseInt(reader.readLine());
            //System.out.println(a[i]);

        }
        
        for(int i = 0; i < T; i++){
            for(int j = 0; j < W + 1; j++){
                s[i][j] = 0;
                
            }
        }
        s[0][0] = a[0]%2;
        
        for(int i = 1; i < T; i++){
            
            s[i][0] = s[i - 1][0]+a[i]%2;
           // System.out.println(s[i][0]);
            
        }
         for(int i = 1; i < T; i++){
            for(int j = 1; j <=W && j <=i; j++){
                s[i][j] = (s[i -1][j-1] >= s[i-1][j] ? s[i -1][j -1]:s[i -1][j]);
                if((a[i]%2 == 1 && j % 2 == 0)||a[i]%2 == 0 && j % 2 ==1){
                    s[i][j] += 1;
                }
            }
        }
        int c = 0;
        for(int i = 0; i < W +1; i++){
            if(s[T - 1][i] > c)c = s[T -1][i];
        }
        System.out.println(c);
    }
    
}
