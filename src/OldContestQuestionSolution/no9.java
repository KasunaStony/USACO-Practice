/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OldContestQuestionSolution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author maruiling
 */
public class no9 {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int T = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        int a[][] = new int[T][101];
        
        int M[] = new int[S];
        int L[] = new int[S];
        int A[] = new int[S];
        int C[] = new int[N];
        int D[] = new int[N];
        
        int aa = 1;
        
        for(int i = 0; i < S; i++){
            StringTokenizer p = new StringTokenizer(reader.readLine());
            M[i] = Integer.parseInt(p.nextToken());
            L[i] = Integer.parseInt(p.nextToken());
            A[i] = Integer.parseInt(p.nextToken());
        }
            
        for(int i = 0; i < N; i++){  
            StringTokenizer q = new StringTokenizer(reader.readLine());
            C[i] = Integer.parseInt(q.nextToken());
            D[i] = Integer.parseInt(q.nextToken());
        } 
        
        for(int i = 0; i < T; i++){
            
            for(int j = 0; j < S; j++){               
                
                if(M[j] + L[j] - 1 == i){
                    int max = 0;
                    for(int c = 0; c < i; c++){
                        for(int d = 0; d < A[j]; d++){
                            if(a[c][d] > max)max = a[c][d];
                        }
                    }a[i][j] = max;
                    aa = A[j];
                }
            }
            for(int j = 0; j < N; j++){
                if(C[j] > aa)continue;
                if(i - D[j] >= 0 ){ 
                    a[i][C[j]] += a[i - D[j]][C[j]] + 1;
                    
                
                }
                
            }
            
        }
        int p = 0;
        for(int i = 0; i < T; i++){
            for(int j = 0; j < 10; j++){
                if(p < a[i][j])p = a[i][j];
                //System.out.print(a[i][j] + " ");
                
            }//System.out.println();
        }
        System.out.println(p);
        
    }
}
