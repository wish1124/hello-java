
/*
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요: ");
        int number = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + "의 팩토리얼: " + factorial);
    }
}
*/

/*public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("30 이하의 양의 정수를 입력하세요: ");
        int n = scanner.nextInt();

        if (n < 30) {
            long result = 1L << n;
            System.out.println("2^" + n + " = " + result);
        } else {
            System.out.println("입력값이 30 이상입니다.");
        }
    }
}*/
/*

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1에서 9 사이의 정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 9) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } else {
            System.out.println("잘못된 입력입니다. 1에서 9 사이의 정수를 입력하세요.");
        }
    }
}
*/

package lesson3;
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("피보나치 수열의 길이를 입력하세요: ");
        int length = scanner.nextInt();

        if (length > 0) {
            long[] fibonacci = new long[length + 1];
            fibonacci[0] = 0;
            if (length > 1) {
                fibonacci[1] = 1;
                for (int i = 2; i < length + 1; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }

            System.out.println("피보나치 수열:");
            for (long num : fibonacci) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("양의 정수를 입력하세요.");
        }
    }

}




