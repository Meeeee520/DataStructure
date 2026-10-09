import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        int replacement = sc.nextInt();
        numbers[1] = replacement;
        System.out.println(numbers.length);
        System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
        sc.close();
    }
}
