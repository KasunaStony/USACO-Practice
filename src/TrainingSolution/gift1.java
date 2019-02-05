package TrainingSolution;

/*
ID: KasunaStony
LANG: JAVA
TASK: gift1
*/

import java.io.*;
import java.util.*;


public class gift1 {
    
    String name;
    int total, give, givep, back, gain;
    
    public static void main (String [] args) throws IOException {
     
        
        BufferedReader reader = new BufferedReader(new FileReader("gift1.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("gift1.out"));
    
  
    
        StringTokenizer st = new StringTokenizer(reader.readLine());
    

    
        int NP = Integer.parseInt(st.nextToken());
    
    
        gift1 name[] = new gift1[NP];
    
        for(int i = 0; i < NP; i++){
        
            name[i] = new gift1();
            name[i].name = reader.readLine();
       
       
        }
    
    
    
        reader.mark(0);
    
        int c;
        for( ; ; ){
            c = 0;
            reader.reset();
        
            for( ; c < NP; c++){
        
                reader.reset();
                
                if ((name[c].name).equals(reader.readLine())){
                       
                    StringTokenizer q = new StringTokenizer(reader.readLine());
                                   
                    name[c].give = Integer.parseInt(q.nextToken());
                    name[c].givep = Integer.parseInt(q.nextToken());
            
            
                    if(name[c].givep != 0){
                
                            name[c].back += name[c].give % name[c].givep;
                        
                    }else name[c].give = -name[c].give;
            
       
                    for(int a = 0; a < name[c].givep; a++){
                
                        String line = reader.readLine();
               
                        for(int b = 0; b < NP; b++){ 
                  
                            if(name[b].name.equals(line)){
                   
                                name[b].gain += name[c].give / name[c].givep;

                            }
                        }   
                    }
                    reader.mark(100);
                }
            }        
            if(reader.read() == -1)break;
        }  
        
        for(int y = 0; y < NP; y++){
        
            name[y].total = name[y].back + name[y].gain - name[y].give;

        }
    
        for(int e = 0; e < NP; e++){
        
            writer.write(name[e].name + " " + name[e].total + "\n");
    
        }
    
        reader.close();
        writer.close();
        
    }
}
