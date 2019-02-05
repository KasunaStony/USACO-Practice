package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: barn1
 */

/**
 *
 * @author maruiling
 */
import java.util.*;
import java.io.*;

public class barn1 {
    
    public static void main(String args[])throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader(new File("barn1.in")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("barn1.out")));

        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        if(m >= c){
            writer.write(c + "\n");
            writer.close();
            reader.close();
            System.exit(0);
        }
        
        int[] data = new int[c];
        
        int[][] difference = new int[c - 1][2];
        
        for(int i = 0; i < c; i++){
            data[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(data);
                
//        for(int i = 0; i < c - 1; i++){
//            System.out.println(data[i]);
//        }
        for(int i = 0; i < c - 1; i++){
            difference[i][0] = data[i+1] - data[i];
            difference[i][1] = i;
        }
//        System.out.println();
//        for(int i = 0; i < c - 1; i++){
//            System.out.println(difference[i][0] + " " + difference[i][1]);
//        }

        Arrays.sort(difference, (a, b) -> Integer.compare(a[0], b[0]));
        
//        System.out.println();
//        
//        for(int i = 0; i < c - 1; i++){
//            System.out.println(difference[i][0] + " " + difference[i][1]);
//        }
        
        int[] position = new int[m - 1];
        
        int count = 0;
        for(int i = difference.length - 1; i > difference.length - m; i--){
            position[count] = difference[i][1];
            count++;
        }
        
                
        Arrays.sort(position);
//        for(int i = 0; i < position.length; i++){
//            System.out.println(position[i]);
//        }
//        
        int answer = 0;
        
        for(int i = 0; i < position.length; i++){
            if(i == 0 && i != position.length - 1){
                answer += data[position[i]] - data[0] + 1;

               // System.out.println(data[position[i]] - data[0] + 1);
            }else if(i == position.length - 1 && i!= 0){
              
                answer += data[position[i]] - data[position[i-1] + 1] + 1;
                answer += data[data.length - 1] - data[position[i] + 1] + 1;
               // System.out.println(data[data.length - 1] - data[position[i] + 1] + 1);
            }else if(i == position.length - 1 && i == 0){
//             
//                System.out.println(answer + " answer");
                answer += data[position[i]] - data[0] + 1;
                //System.out.println(answer + " answer");
                answer += data[data.length - 1] - data[position[i] + 1] + 1;
//                System.out.println(answer + " answer");
//                System.out.println(data[position[i]] - data[0] + 1);
//                System.out.println(data[data.length - 1] - data[position[i] + 1] + 1);
            }else{
           
                answer += data[position[i]] - data[position[i-1] + 1] + 1;
                //System.out.println(data[position[i]] - data[position[i-1] + 1] + 1);
            }
        }
       // System.out.println(answer);
       if(m == 1){
           writer.write((data[data.length - 1] - data[0] + 1) + "\n");
           //System.out.println("???");
       }else{
            writer.write(answer + "\n");
       }
        writer.close();
        reader.close();
        
        
        
    }
    
}
