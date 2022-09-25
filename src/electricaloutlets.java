import java.util.Scanner;


public class electricaloutlets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0; i< n; i++) {

            int k = sc.nextInt();

            int sum = 0;

            for (int j=0; j<k; j++) {
                int o = sc.nextInt();
                sum += o;
            }
            sum = (sum + 1 - k);
            System.out.println(sum);

//        int countryCode = Integer.parseInt(Integer.toString(phone_number).substring(0, 3));

        }
        sc.close(); }
}
