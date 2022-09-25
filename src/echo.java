import java.util.Scanner;

public class echo{
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String word = sc.next();


        System.out.println(word + " " + word + " " + word);

        sc.close();
    }
}