import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[6];
        for (int i = 0; i<arr.length; i++, i++) {
            String a = sc.nextLine();
            String s[] = a.split(" ");
            arr[i] = s[0];
            arr[i+1] = s[1];
        }

        System.out.println("================================");
        for (int i = 0; i<arr.length; i++) {
            if (i%2!=0) continue;
            System.out.print(arr[i]);
            for(int j = 0; j<15-(arr[i].length()); j++) {
                System.out.print(" ");
            }
            if(arr[i+1].length()<3) {
                for(int k = 0; k<3-arr[i+1].length(); k++) {
                    System.out.print("0");
                }
            }
            System.out.println(arr[i+1]);
        }
        System.out.println("================================");

    }
}
