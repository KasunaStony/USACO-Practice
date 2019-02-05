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
public class no6 {
    
    public static void main(String args[])throws IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("USACO.in"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken()); 
        int l , c = 0, count = 0;
        for(int i = 1; i < N - 2; i++){
            for(int j = 1; j < N - 2 && i + j < N - 1; j++){
                for(int k = 1; k < N -2 && i + j + k < N; k++){
                    l = N - i - j - k;
                    count++;
                    if(l > 0 && i + j +l > k && i + j + k > l && i + k + l > j && j + k + l >i)c++;
                }
            }
        }
        System.out.println(c);
        System.out.println(count);
                
    }
    
}
