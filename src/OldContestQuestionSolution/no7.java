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
public class no7 {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken()); 
        int M = Integer.parseInt(st.nextToken()); 
        
        int x[] = new int[N + 1];
        int y[] = new int[N + 1];
        
        int m[] = new int[M + 1];
        int n[] = new int[M + 1];
        
        double a[][] = new double[N + 1][N + 1];
        int b[][] = new int[N + 1][N + 1];
        
        for(int i = 1; i <= N; i++){
            
            StringTokenizer p = new StringTokenizer(reader.readLine());
            
            x[i] = Integer.parseInt(p.nextToken()); 
            y[i] = Integer.parseInt(p.nextToken()); 
            
            
        }
        
        for(int i = 1; i <= M; i++){
            
            StringTokenizer u = new StringTokenizer(reader.readLine());
            m[i] = Integer.parseInt(u.nextToken()); 
            n[i] = Integer.parseInt(u.nextToken()); 
            
            
        }
        
        for(int i = 2; i <= N; i++){
            for(int j = 1; j < N; j++){
                
                a[i][j] = Math.sqrt((x[i] - x[j])*(x[i] - x[j])+(y[i]-y[j])*(y[i]-y[j]));
                b[i][j] = 0;
                
            }
            
            
        }
        int r;
        for(int i = 1; i < m.length; i++){
                
            if(m[i]<n[i]){
                r = m[i];
                m[i] = n[i];
                n[i] = r;
                
            }
            b[m[i]][n[i]] = 1;
            
            
            }
        double L = 0;
        for(int i = 0; i < N + 1; i++){
            for(int j = 0; j < N + 1; j ++){
                if(b[i][j] == 1)L += a[i][j];
            }
        }
       // System.out.println(L);
        int w[] = new int[N + 1];
        
        int minv = 0, minj = 0, c1 = 0, c2 = 0;
        for(int i = 1; i <= N - M -1; i++){            
            double min = 2000000;
            for(int v = 2; v <= N; v++){
                for(int j = 1; j <= v -1; j ++){
                    
                    if(a[v][j] < min && b[v][j] == 0){
                        
                        min = a[v][j];
                        minv = v;
                        minj = j;
                        
                    }
                    
                    
                }
                
            }
           // System.out.println(minv + " " + minj);
           // b[minv][minj] = 1;
            for(int f = 2; f <= N; f++){
                for(int e = 1; e < N; e++){
                    if(b[f][e] == 1){
                        c1++;
                        w[f] = f;
                        w[e] = e;
                        
                    }
                    
                }
            }
            w[minv] = minv;
            w[minj] = minj;
            for(int g = 0; g < w.length; g++){
                if(w[g] != 0)c2++;
            }
            if(c1 + 1 < c2)b[minv][minj] = 1;
            else b[minv][minj] = 2;
        }
        
        
            double l = 0;
            for(int i = 0; i < N + 1; i++){
                for(int j = 0; j < N + 1; j++){
                    // System.out.printf("%5d",b[i][j]);
                    if(b[i][j] == 1){
                        
                       
                        l += a[i][j];
                       // System.out.println("kk");
                }
                }
                //System.out.println();
            }
            
            System.out.printf("%.2f",(l - L));
        
    }
    
}
