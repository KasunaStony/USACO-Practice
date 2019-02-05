package TrainingSolution;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;



public class TheCowSignal {
    
    public static void main(String args[]) throws IOException {
        
        BufferedReader reader = new BufferedReader(new FileReader("cowsignal.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("cowsignal.out"));
        
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        char[] x = new char[M * N];
        
        int i = 0;
        int temp = reader.read();
        while(temp!= -1){
            
           if(temp != '\n' && temp != '\r'){
           x[i] = (char)temp;
         //  System.out.print(x[i]);
            i++;           
            }
            temp = reader.read();
           
        }
        
        char[][] c = new char[M][N];
        int num = -1;
        for(int g = 0; g < M; g ++){
            for(int n = 0; n < N; n++){
                num++;
                c[g][n] = x[num];
                
            }
        }
        
        String s[] = new String[M];
        
        for(int b = 0; b< M; b++){
            s[b] = "";
            for(int d = 0; d < N; d++){
                for(int k =0 ; k < K; k++){
                    s[b] += String.valueOf(c[b][d]);
                }
               
        }
        
        }
        
       // System.out.print(s[2]);
        
        
        for(int j = 0; j < M; j++){
            for(int k = 0; k < K; k++){
                writer.write(s[j]);
                writer.write('\n');
            }//writer.write('\n');
        }
        
        reader.close();
        writer.close();
}
}