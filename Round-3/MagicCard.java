import java.util.Scanner;

public class MagicCard {

    public static void main(String[] args) {
        int row=4;
        int col=4;
        int[][] matrix = new int[row][];
        int count=1;
        Scanner sc= new Scanner(System.in);
        for (int i=0;i<row;i++){
            matrix[i] = new int[col];
            for (int j=0;j<col;j++){
                matrix[i][j] = count;
                count++;

            }
        }
        for (int[] i : matrix){
            for (int j : i )
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
        int r1;
        r1 = sc.nextInt();

        int[][] rev_matrix = new int[col][];
        for (int i = 0; i < col; i++){
            rev_matrix[i] = new int[row];
            for (int j = 0; j < row; j++){
                rev_matrix[i][j] = matrix[j][i];
                count++;
            }
        }

        for (int i[] : rev_matrix){
            for (int j : i )
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }

        int c1;
        c1=sc.nextInt();

        System.out.println(matrix[r1-1][c1-1]);
    }

}
