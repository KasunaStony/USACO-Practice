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


public class no3{
    
    static void paixu(int a[], int b[], int c[], int n){
        
        int i, j;
        int v;
        
        for(i = 0; i < n -1; i++){
            for(j = 0; j < n -1 -i; j++){
                
                if(c[j] < c[j + 1]){
                    v = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = v;
                    
                    v = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = v;
                    
                    v = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = v;
                    
                }
            }
        }
    }
    
    public static void main(String args[]) throws IOException{

        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        int w[] = new int[N];
        int s[] = new int[N];
        int t[] = new int[N];
        
        for(int i = 0; i < N; i++){
            
            StringTokenizer p = new StringTokenizer(reader.readLine());
            
            w [i] = Integer.parseInt(p.nextToken());
            s [i] = Integer.parseInt(p.nextToken());
            t [i] = w[i] + s[i];
        
        }
        paixu(w, s, t, N);
        
        int total = 0;
        
        for(int h = 1; h < N; h++){
            
            total += w[h];
            
            
        }
        
        System.out.println(total - s[0]);
    
    }
}
