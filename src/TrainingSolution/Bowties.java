/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrainingSolution;

/**
 *
 * @author maruiling
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bowties {
    
    
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("bowties.14.in"));
       // BufferedWriter writer = new BufferedWriter(new FileWriter("USACO.out"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        long an = 0;
        
        int x[] = new int[N];
        int y[] = new int[N];
        
        for(int i = 0; i < N; i++){
            StringTokenizer p = new StringTokenizer(reader.readLine());
            x[i] = Integer.parseInt(p.nextToken());
            y[i] = Integer.parseInt(p.nextToken());
          //  System.out.println(y[i]);
        }
        
        for(int i = 0; i < N; i++){
            int t = 0, l = 0, r = 0, d = 0;
            for(int j = 0; j < N; j++){
                if(j == i){
                    continue;
                }
                if(x[i] == x[j] && y[j] > y[i])t++;
                if(x[i] == x[j] && y[j] < y[i])d++;
                if(y[i] == y[j] && x[j] < x[i])l++;
                if(y[i] == y[j] && x[j] > x[i])r++;
                
                
            }
          //  System.out.println(t + " " + d + " " + l + " " + r);
            an += t * l * r * d * 2;
        }
        
        System.out.println(an);

        
    }
    
}
