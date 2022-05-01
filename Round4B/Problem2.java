import java.io.*;
import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) throws FileNotFoundException {

        int t;
        Scanner sc = null;
        try {
            sc = new Scanner(new File("E:\\Codefest\\Final-Project\\src\\ts2_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        FileOutputStream fos = new FileOutputStream(new File("E:\\Codefest\\Final-Project\\src\\ts2_output.txt"));
        PrintStream ps = new PrintStream(fos);

        String out = new String();
        t=sc.nextInt();
        String str1,str2;
        int i=1;
        while (i <= t){

            str1 = sc.next();
            str2 = sc.next();
            int[][] a = new int[str2.length()][];
            for (int j=0;j<str2.length();j++){
                a[j] = new int[str1.length()];
                for (int k=0;k<str1.length();k++){
                    int abs = Math.abs(str1.charAt(k) - str2.charAt(j));
                    a[j][k] = (abs > 13)?(26 - abs): abs;
//                    System.out.print(a[j][k]+"\t");
                }
            }
            int[] min = new int[str1.length()];
            for (int j=0;j<str1.length();j++) {
                min[j] = Integer.MAX_VALUE;
                for (int k = 0; k < str2.length(); k++) {
                    if(a[k][j] < min[j])
                        min[j] = a[k][j];
                }
            }
            int ans=0;
            for (int tmp : min){
                ans+=tmp;
            }
            out += "Case #"+i+": "+ans+"\n";
            i++;
        }

        ps.println(out);
    }
}
