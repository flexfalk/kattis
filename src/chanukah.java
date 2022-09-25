import java.util.Scanner;

public class chanukah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();

        for (int i=0; i<p; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int candles = ((n*(n+1))/2) + n;
            System.out.println(k + " " + candles);
        }
        sc.close();    }
}

