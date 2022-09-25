// Success in 0.71s
import java.util.Scanner;

public class sum{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {
            int k = sc.nextInt();
            sum += k;
        }
        System.out.println(sum);
        sc.close();
    }
}