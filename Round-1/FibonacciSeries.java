import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        int start;
        int n=5;
        Scanner sc = new Scanner(System.in);

        start = sc.nextInt();

        int a=1;
        int b=1;
        int temp;
        for (int i=0;;i++){
            temp=a;
            a=b;
            b+=temp;
            if(b>=start && n!=0){
                System.out.print(b + " ");
                n--;
            }
        }

    }

}
