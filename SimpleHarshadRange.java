import java.util.Scanner;

public class SimpleHarshadRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        //System.out.println("Harshad numbers in range:");

        for (int num = start; num <= end; num++) {
            int sum = 0, temp = num;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (num % sum == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
