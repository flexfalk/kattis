import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class minimumscalar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0; i<t; i++) {

            int n = sc.nextInt();

            Integer[] x;
            Integer[] y;

            x = new Integer[n];
            y = new Integer[n];

            for (int j=0; j<n; j++){
                x[j] = sc.nextInt();
            }
            for (int j=0; j<n; j++){
                y[j] = sc.nextInt();
            }
            Arrays.sort(x);
            Arrays.sort(y, Collections.reverseOrder());

            int sum = 0;
            for (int k=0;k<n;k++){
                sum += x[k]*y[k];
            }
            System.out.println("Case #" + i+1 + ": " + sum);
        }
        sc.close();
    }
}
