import java.util.Scanner;

public class Example2 {
    public static void main(String[] args){
        String original, rev = null;
        boolean comp;
        Scanner scanner = new Scanner(System.in);
        original = scanner.nextLine();
        System.out.println(original);
        comp = original.equals(rev);
        System.out.print(comp);
    }
}
