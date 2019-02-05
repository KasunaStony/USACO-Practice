package TrainingSolution;

/*
ID: maruili1
LANG: JAVA
TASK: milk
 */

/**
 *
 * @author maruiling
 */
import java.util.*;
import java.io.*;

public class milk {

    public static void main(String args[]) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader(new File("milk.in")));
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("milk.out")));

        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int numberOfF = Integer.parseInt(st.nextToken());

        if (n != 0) {
            int[][] data = new int[numberOfF][2];

            for (int i = 0; i < numberOfF; i++) {

                st = new StringTokenizer(reader.readLine());
                data[i][0] = Integer.parseInt(st.nextToken());
                data[i][1] = Integer.parseInt(st.nextToken());

            }

//        for(int i =0; i < numberOfF; i++){
//            
//            System.out.println(data[i][0] + " " + data[i][1]);
//        }
//        System.out.println();
            Arrays.sort(data, (a, b) -> Integer.compare(a[0], b[0]));

//        for(int i =0; i < numberOfF; i++){
//            
//            System.out.println(data[i][0] + " " + data[i][1]);
//        }
            int totalMilk = 0;
            int c = 0;

            for (int i = 0; i < numberOfF; i++) {

                if (totalMilk >= n) {
                    c = i;
                    break;
                }
                totalMilk += data[i][1];

            }

            
            //System.out.println(c);

            int cost = 0;
            int beforeRemain = 0;
            int remain = 0;
            for (int i = 0; i < c - 1; i++) {

                cost += data[i][0] * data[i][1];
                beforeRemain += data[i][1];

            }
            //System.out.println(c);
            remain = n - beforeRemain;
            if(c != 0)
                cost += remain * data[c - 1][0];
            else
                cost += remain * data[0][0];

            writer.write(cost + "\n");
        } else {
            writer.write(0 + "\n");
        }
        writer.close();
        reader.close();
    }

}
