import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tests = sc.nextInt();
        long a, b, c, temp;
        for(long i = 0; i<tests; i++) {
            a = sc.nextLong();
            b = sc.nextLong();
            c = sc.nextLong();
            temp = a;

            for (long j = 0; j<c; j++) {
                if(j==c-1) {
                    temp+=Math.pow(2, j)*b;
                    System.out.println(temp);
                }
                else {
                    temp+=Math.pow(2, j)*b;
                    System.out.print(temp+" ");
                }
            }
        }
    }
}
