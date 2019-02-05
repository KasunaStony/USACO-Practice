package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: combo
*/

/**
 *
 * @author maruiling
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class combo {
    
    public static void main(String args[]) throws Exception{
        
        BufferedReader reader = new BufferedReader(new FileReader("combo.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("combo.out"));
        
        int n = Integer.parseInt( reader.readLine() );
        if(n == 1){
            writer.write("1\n");
            writer.close();
            reader.close();
            System.exit(0);
        }
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int J1 = Integer.parseInt(st.nextToken());
        int J2 = Integer.parseInt(st.nextToken());
        int J3 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());
        int M1 = Integer.parseInt(st.nextToken());
        int M2 = Integer.parseInt(st.nextToken());
        int M3 = Integer.parseInt(st.nextToken());
        
        int[] lock = new int[3*n];
        int counter = 0;
        for(int i = 0; i < n*3; i++){
            if(counter == n)counter = 0;           
            counter ++;
            lock[i] = counter;
        }

        ArrayList<String> comboJ = new ArrayList();
        
        for(int i = n+J1-3; i <= n+J1+1; i++){
            for(int j = n+J2-3; j<= n+J2+1; j++){
                for(int k = n+J3-3; k <= n+J3+1; k++){
                    if(!comboJ.contains(lock[i] + "," + lock[j] +","+ lock[k]))
                    comboJ.add(lock[i] + "," + lock[j] +","+ lock[k]);
                }
            }
        }
        
        ArrayList<String> comboM = new ArrayList();
        
        for(int i = n+M1-3; i <= n+M1+1; i++){
            for(int j = n+M2-3; j<= n+M2+1; j++){
                for(int k = n+M3-3; k <= n+M3+1; k++){
                    if(!comboM.contains(lock[i] + "," + lock[j] +","+ lock[k]))
                    comboM.add(lock[i] + "," + lock[j] +","+ lock[k]);
                }
            }
        }
        int overlap = 0;
        for(int i = 0; i < comboM.size(); i++){
            for(int j = 0; j < comboJ.size(); j++){
                if(comboM.get(i).equals(comboJ.get(j))){
                    overlap++;
                    //System.out.println(comboM.get(i) + " " + comboJ.get(j));
                }
            }
        }
        //System.out.println(overlap);
        writer.write((comboJ.size()+comboM.size()-overlap) + "\n");
        writer.close();
        reader.close();
        
    }
    
}
