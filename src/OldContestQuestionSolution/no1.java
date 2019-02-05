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

public class no1 {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("USACO.out"));
    
  
    
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        int max = 0, total = 0, maxi = 0;
        
        int nums[] = new int[N];
        for(int i = 0; i < N; i++){
            
            nums[i] = Integer.parseInt(reader.readLine());
           // System.out.println(nums[i]);
        }
        
        for(int i = 0; i < N-1; i++){
            total = max = nums[i];
            //for(int c = N-1; c > -1; c--){
                
                for(int q = i + 1; q < N; q++){
                    total += nums[q];
                    if(total > max) max = total;
                }
                
                
          //  }
            if(max > maxi)maxi = max;
           
            
            
        }
         System.out.println(maxi);
        reader.close();
        writer.close();
    }
    
}
