// Success in 0.71s
import java.util.Scanner;

public class fyi {
    public static void main(String[] args) {

        //transforming to string and then index
        Scanner sc = new Scanner(System.in);
        int phone_number = sc.nextInt();

        int countryCode = Integer.parseInt(Integer.toString(phone_number).substring(0, 3));

        if (countryCode == 555) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}