import java.util.Scanner;
class SunnyNumRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        //System.out.println("Sunny Numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int sum = num + 1;
            int sqrt = (int) Math.sqrt(sum);

            if (sqrt * sqrt == sum) {
                System.out.println(num);
            }
        }

        sc.close();
    }
}
 