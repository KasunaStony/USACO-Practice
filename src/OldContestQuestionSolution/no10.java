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

public class no10 {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        int F = Integer.parseInt(st.nextToken());
        
        int a[] = new int[N];
        
        
        for(int i = 0; i < N; i++){
            
            a[i] = Integer.parseInt(reader.readLine());
        }
        
        int n = (int)Math.pow(2.0, N)+1;
        int b[][] = new int [N + 1][n];
       // System.out.println(n);
        
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= (int)Math.pow(2, i); j++){
                
                if(j % 2 != 0)
                    b[i][j] = b[i - 1][j - (j/2)]+a[i - 1];
                else if(j % 2 == 0)
                    b[i][j] = b[(i-1)][(j- (j/2))];
            }
        }
        
        
        for(int i = 0; i <= N; i++){
            for(int j = 0; j < n; j++){
                System.out.print(b[i][j] + "    ");
            }System.out.println();
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(b[N][i]!= 0 && b[N][i] % F == 0)
                c++;
                
            
                
        }
        System.out.println(c);
        
    }
    
}
