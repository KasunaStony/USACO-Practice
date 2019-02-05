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
import java.util.Queue;
import java.util.LinkedList;  

/**
 *
 * @author maruiling
 */
public class no8 {
    
     public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M1 = Integer.parseInt(st.nextToken());
        int M2 = Integer.parseInt(st.nextToken());
        
        int m1[] = new int[]{-M1, -M2, -M1, -M2, M1, M2, M1, M2};
        int m2[] = new int[]{-M2, -M1, M2, M1, -M2, -M1, M2, M1};
        
        int a[][] = new int[M][N];
        
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();
        Queue<Integer> queue3 = new LinkedList<Integer>();
        
        int x = 0, y = 0, step = 0;
        
        for(int i = 0; i < M; i++){
            StringTokenizer p = new StringTokenizer(reader.readLine());
            for(int j = 0; j < N; j++){
                
                a[i][j] = Integer.parseInt(p.nextToken());
                if(a[i][j] == 3){
                    x = i;
                    y = j;
                }
                
                
                
        }
            
        }
        queue1.add(x);
        queue2.add(y);                    
        queue3.add(0);
        
        wai : for(;;){
            x = queue1.remove();
            y = queue2.remove();
            step = queue3.remove();
            for(int i =0; i < 8; i++){
                if((x + m1[i] >= 0 && y + m2[i] >= 0)&&((x + m1[i] < M)&&(y + m2[i] < N))&&((a[x + m1[i]][y + m2[i]] == 1)||(a[x + m1[i]][y + m2[i]] == 4))){
                    queue1.add(x + m1[i]);
                    queue2.add(y + m2[i]);                    
                    queue3.add(step + 1);
                    if((a[x + m1[i]][y + m2[i]] == 4)){
                        
                        break wai;
                    }
                }
                    
                            
                
            }
        }
        System.out.println(step + 1);
        
        
        
        
        
        
     }
    
}
