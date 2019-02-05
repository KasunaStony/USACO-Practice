package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: transform
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author maruiling
 */
public class transform {
    
    public static char[][] result1(char[][] data){
        int n = data.length;
        char[][] result = new char[n][n];
        int c;
        for(int i = 0; i < n; i++){
            c = 0;
            for(int j = n - 1; j > -1; j--){
                result[i][c] = data[j][i];
                c++;
            }
        }
        return result;
    }
    
    public static char[][] result2(char[][] data){
        int n = data.length;
        char[][] result = new char[n][n];
        int c;
        int d = 0;
        for(int i = n- 1; i > -1; i--){
            c = 0;
            for(int j = n - 1; j > -1; j--){
                result[d][c] = data[i][j];
                c++;           
            }d++;
        }
        return result;
    }
    
    public static char[][] result3(char[][] data){
        int n = data.length;
        char[][] result = new char[n][n];
        int c;
        int d = 0;
        for(int i = n- 1; i > -1; i--){
            c = 0;
            for(int j = 0; j < n; j++){
                result[d][c] = data[j][i];
                c++;           
            }d++;
        }
        return result;
    }
    
    public static char[][] result4(char[][] data){
        int n = data.length;
        char[][] result = new char[n][n];
        int c;
        int d = 0;
            for(int i = 0; i < n; i++){
            c = 0;
            for(int j = n-1; j > -1; j--){
                result[d][c] = data[i][j];
                c++;
            }d++;
        }
        return result;
    }
    
    public static char[][] result51(char[][] data){
        return result1(result4(data));
    }
    
    public static char[][] result52(char[][] data){
        return result2(result4(data));
    }
    
    public static char[][] result53(char[][] data){
        return result3(result4(data));
    }
    
    public static char[][] result6(char[][] data){
        return data;
    }
    
    public static boolean isSame(char[][] data, char[][] result){
        
        boolean same = true;
        
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data.length; j++){
                if(data[i][j] != result[i][j]) same = false;
            }
        }
        return same;
    }
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        
        BufferedReader reader = new BufferedReader(new FileReader("transform.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("transform.out"));
        
        int n = Integer.parseInt( reader.readLine() );
        
        char[][] data = new char[n][n];
        int c;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + 1; j++){
                c = reader.read();
                if(c != 10 && c != 13){
                    data[i][j] = (char)c;
                }
            }
        }
        
        char[][] result = new char[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n + 1; j++){
                c = reader.read();
                if(c != 10 && c != 13){
                    result[i][j] = (char)c;
                }
            }
        }
//        
//        char[][] s = result4(data);
//        
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < n; j++){
//                System.out.print(s[i][j]);
//            }System.out.println();
//        }
        
        int r = 7;
        
        if(isSame(result, result1(data))){
            r = 1;
        }else if(isSame(result, result2(data))){
            r = 2;
        }
        else if(isSame(result, result3(data))){
            r = 3;
        }
        else if(isSame(result, result4(data))){
            r = 4;
        }else if(isSame(result, result51(data))){
            r = 5;
        }else if(isSame(result, result52(data))){
            r = 5;
        }else if(isSame(result, result53(data))){
            r = 5;
        }else if(isSame(result, result6(data))){
            r = 6;
        }
        
        writer.write(r + "\n");
        
        writer.close();
        reader.close();

    }
    
}
