import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length = A.length() + B.length();
        System.out.println(length);


        int C = A.compareToIgnoreCase(B);
        if(C>0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


        String output = A.substring(0, 1).toUpperCase() + A.substring(1);
        String output2 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output + " " + output2);
    }
}