/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OldContestQuestionSolution;

import java.io.*;
import java.util.*;

/**
 *
 * @author maruiling
 */
public class no5 {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int C = Integer.parseInt(st.nextToken()); 
        int H = Integer.parseInt(st.nextToken());
        
        int a[] = new int[(int)Math.pow(2, H + 1) + 1];
        int b[] = new int[H + 1];
        
        for(int i = 1; i < H + 1; i++){
            StringTokenizer p = new StringTokenizer(reader.readLine());
            
            b[i] = Integer.parseInt(p.nextToken());
            
            
            
        }
        
        a[1] = 0;
        for(int i = 2; i <= H+1; i++){
            for(int j =(int) Math.pow(2, i -1); j <=(int)Math.pow(2, i)-1; j++){
                
                if(j % 2 == 0)a[j] = a[j/2] + b[i -1];
                else a[j] = a[j/2];
            }
        }
        
       
        wai :for(int i = C; i >= 1; i--){
            for(int j = 1; j < a.length; j++){
                if(a[j] == i){
                    System.out.println(a[j]);
                    break wai;
                }
            }
        }
    }
    
}
