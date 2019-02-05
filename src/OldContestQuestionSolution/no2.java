/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OldContestQuestionSolution;

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
public class no2 {
    
    static void paixu(int a[], int b[], int c[], int d[], int f){
        
        int i, j;
        int t;
        
        for(i = 0; i < f - 1; i++){
            
            for(j = i; j < f - 1 - i; j++){
                
                if (d[j] > d[j + 1]){
                    
                    t = d[j];
                    d[j] = d[j +1];
                    d[j + 1] = t;
                    
                    t = a[j];
                    a[j] = a[j +1];
                    a[j + 1] = t;
                    
                    t = b[j];
                    b[j] = b[j +1];
                    b[j + 1] = t;
                    
                    t = c[j];
                    c[j] = c[j +1];
                    c[j + 1] = t;
                    
                    
                }
                
            }    
            
        }
        
    }
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("USACO.out"));
    
  
    
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int K = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        
       
       int zb[] = new int[N];
       int kc[] = new int[N];
       int dj[] = new int[N];
       int cb[] = new int[N];
       for(int i = 0; i < N; i++){
           StringTokenizer p = new StringTokenizer(reader.readLine());
           
           zb[i] = Integer.parseInt(p.nextToken());
           kc[i] = Integer.parseInt(p.nextToken());
           dj[i] = Integer.parseInt(p.nextToken());
       }
       
        for(int c = 0; c < N; c++){
            
            cb[c] = E - zb[c] + dj[c];
            
        }       
             
        paixu(zb, kc, dj, cb, N);
        
        int c = 0 , f = 0;
        
        for(int n = 0; n < N; n++){
            
            if(kc[n] + c <= K){
                f = f + cb[n]*kc[n];
                c += kc[n];
            }
            else f += cb[n] * (K - c);
        }
        
        System.out.println(f);
    }
    
}
