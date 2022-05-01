package Round4C;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Problem3 {

    public static long search_min(long[] arr){
        long min = Integer.MAX_VALUE;
        long index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min=arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner("E:\\Codefest\\Final-Project\\src\\Round4C\\ts1_input.txt");
        t=sc.nextInt();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("E:\\Codefest\\Final-Project\\src\\ts2_output.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintStream ps = new PrintStream(fos);

        int count=1;
        while(count <= t){
            int N;
            int P;
            int steps=0;
            N = sc.nextInt();
            P = sc.nextInt();

            long[][] arr = new long[N][];
            for (int i=0;i<arr.length;i++)
            {
                arr[i] = new long[P];
                for (int j=0;j<arr[i].length;j++){
                    arr[i][j] = sc.nextLong();
                }
            }
            long temp=0;
            for (int i=0;i<arr.length;i++)
            {
                long ind=search_min(arr[i]);

                for (int j=0;j<arr[i].length;j++){
                    if(temp==arr[i][0]){
                        continue;
                    }else if(temp==arr[i][(j+(int)ind)%(arr[i].length)]){
                        continue;
                    }
                    steps+=Math.abs(temp - arr[i][(j+(int)ind)%(arr[i].length)]);

                    temp=arr[i][(j+(int)ind)%(arr[i].length)];
//                    System.out.println("temp ->>>>>>>>>"+temp);
//                    System.out.println("---->"+steps);
//                    System.out.println(arr[i][(j+(int)ind)%(arr[i].length)]);
                }

//                System.out.println(steps);
            }
            steps+=Math.abs(temp - arr[arr.length-1][arr[arr.length-1].length-1]);
//            steps -= arr[arr.length-1][arr[0].length-1];
            ps.println("Case #"+count+": "+steps);

            count++;
        }
    }
}
