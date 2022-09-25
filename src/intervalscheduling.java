import java.util.Scanner;
import java.util.Arrays;

public class intervalscheduling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        movie[] arr;
        arr = new movie[n];

        for (int i=0; i<n; i++) {
            int stime = sc.nextInt();
            int ftime = sc.nextInt();
            arr[i] = new movie(stime, ftime);
        }

        Arrays.sort(arr);

        int sum = 1;

        movie current_movie = arr[0];

        for (int j=1; j<n; j++) {
            movie next_movie = arr[j];

            if (current_movie.ftime <= next_movie.stime) {
                current_movie = next_movie;
                sum += 1;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

class movie implements Comparable<movie> {
    public int stime;
    public int ftime;
    public int interval;
    public movie(int stime, int ftime) {
        this.stime = stime;
        this.ftime = ftime;

        this.interval = ftime - stime;
    }
    @Override
    public int compareTo(movie m) {
        return this.ftime - m.ftime;
    }
}