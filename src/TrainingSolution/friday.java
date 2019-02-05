package TrainingSolution;

/*
ID: KasunaStony
LANG: JAVA
TASK: friday
*/

import java.io.*;
import java.util.*;


public class friday {
    
    public static void main (String [] args) throws IOException {
     
        
        BufferedReader reader = new BufferedReader(new FileReader("friday.in"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("friday.out"));
    
  
    
        StringTokenizer st = new StringTokenizer(reader.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
       // System.out.println(N);
        
        int c = 0;
        
        for(int i = 1900; i < 1900 + N; i++){
            
            if(i % 4 == 0 && i % 100 !=0)c++;
            else if(i % 400 == 0)c++;
        }
        
        int n = (N * 365 + c)/7 + 1;
       // System.out.println(n);
        
        int calendar [][] = new int[7][n];
        
        int q = 0, date = 0;
        
        for(int b = 1900; b < 1900 + N; b++){
           
          
        //while(q < 7 && date < n){
            
            
            
            for(int jan = 1; jan <= 31 ; jan++){
                
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = jan;
                q++;
            }
            if(b % 4 == 0 && b % 100 !=0){
                for(int feb1 = 1; feb1 <= 29; feb1++){
                    
                    if(q == 7){q = 0; date++;}
                
                calendar[q][date] = feb1;
                q++;
                    
                    
                }
                
            }
            else if(b % 400 == 0){
                for(int feb2 = 1; feb2 <= 29; feb2++){
                    
                    if(q == 7){q = 0; date++;}
                
                calendar[q][date] = feb2;
                q++;
                    
                    
                }
                
                
                
            }
            else{
                for(int feb3 = 1; feb3 <= 28; feb3++){
                    
                    if(q == 7){q = 0; date++;}
                
                calendar[q][date] = feb3;
                q++;
                    
                    
                }
                
            }
            for(int mar = 1; mar <= 31; mar++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = mar;
                q++;
                
            }
            for(int apr = 1; apr <= 30; apr++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = apr;
                q++;
                
            }
            
            for(int may = 1; may <= 31; may++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = may;
                q++;
                
            }
            for(int jun = 1; jun <= 30; jun++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = jun;
                q++;
                
            }
            for(int july = 1; july <= 31; july++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = july;
                q++;
                
            }
            for(int aug = 1; aug <= 31; aug++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = aug;
                q++;
                
            }
            for(int sep = 1; sep <= 30; sep++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = sep;
                q++;
                
            }
            for(int oct = 1; oct <= 31; oct++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = oct;
                q++;
                
            }
            for(int nov = 1; nov <= 30; nov++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = nov;
                q++;
                
            }
            for(int dec = 1; dec <= 31; dec++){
                if(q == 7){q = 0; date++;}
                
                calendar[q][date] = dec;
                q++;
                
            }
            
      //  }
        
        
        }
//-------------------------------------------------------------------------------------------------------
            int Sun = 0, Mon = 0, Tue = 0, Wed = 0, Thu = 0, Fri = 0, Sat = 0;
            
            for(int t = 0; t < n; t++){
                
                if(calendar[0][t] == 13)Mon++;
            }
           // for(int r = 0; r < 7; r++){
                for(int e = 0; e < n; e++){
                  //  System.out.printf("%-4d",(calendar[r][e]));
                    if(calendar[1][e] == 13)Tue++;
                }
                for(int t = 0; t < n; t++){
                
                if(calendar[2][t] == 13)Wed++;
            }
                
                for(int t = 0; t < n; t++){
                
                if(calendar[3][t] == 13)Thu++;
            }
                
                for(int t = 0; t < n; t++){
                
                if(calendar[4][t] == 13)Fri++;
            }
                
                for(int t = 0; t < n; t++){
                
                if(calendar[5][t] == 13)Sat++;
            }
                for(int t = 0; t < n; t++){
                
                if(calendar[6][t] == 13)Sun++;
            }
                
               // System.out.println(Sat + " " + Sun + " " + Mon + " " + Tue + " " + Wed +" " + Thu + " " + Fri);
                
                writer.write(Sat + " " + Sun + " " + Mon + " " + Tue + " " + Wed +" " + Thu + " " + Fri + '\n');
                
                reader.close();
                writer.close();
    }
}