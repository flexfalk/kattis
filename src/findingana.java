import java.util.Scanner;


public class findingana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String new_string = "";
        boolean foundA = false;

        for (int i=0; i < word.length(); i++) {

            char letter = word.charAt(i);

            if ('a' == letter) {
                foundA = true;
            }

            if (foundA) {
                new_string += letter;
            }
        }
        System.out.println(new_string);
//        int countryCode = Integer.parseInt(Integer.toString(phone_number).substring(0, 3));

        sc.close();
    }
}
