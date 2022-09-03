import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h1 = sc.nextLong();
        long m1= sc.nextLong();
        long s1 = sc.nextLong();

        h1 = 3600 * h1;
        m1 = 60 * m1;

        long calc1 = h1 + m1 + s1;

        long h2 = sc.nextLong();
        long m2 = sc.nextLong();
        long s2 = sc.nextLong();

        h2 = 3600 * h2;
        m2 = 60 * m2;

        long calc2 = h2 + m2 + s2;

        System.out.println(calc2 - calc1);


    }
}