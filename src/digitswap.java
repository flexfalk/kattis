import java.util.Scanner;

public class digitswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        char first  = Integer.toString(number).charAt(0);
        char second  =Integer.toString(number).charAt(1);



        String new_number = "" + second + first;
//
        System.out.println(new_number);

    sc.close();    }
}

