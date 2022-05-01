import java.util.Scanner;

public class Example {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
//        n=sc.nextInt();
        int num;
        int ans;

            num=sc.nextInt();
            ans=1;
            for (int i=1;i<=num;i++){
                if((i%3==0) || (i%5==0)){
                    ans*=i;
                }
            }
            System.out.println("answer = "+ans);


    }

}
