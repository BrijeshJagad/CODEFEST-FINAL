
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int temp;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if(arr[j] < arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();

        int[] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        bubbleSort(arr);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
