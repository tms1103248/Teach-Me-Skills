
    import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

    public class HomeWork3 {
        public static void main(String[] args) {
            System.out.println("Enter temperature outside:");
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            if (t > -5) {
                System.out.println("Hot");
            } else if ((t <= -5) && (t > -20)) {
                System.out.println("Normal");
            } else if (t < -20) {
                System.out.println("Cold");
            }

            // 1-2 задача
            Random R = new Random();
            int randomValue = R.nextInt(30) + 1;
            System.out.println(randomValue);
            if (t > -5) {
                System.out.println("Hot");
            } else if ((t <= -5) && (t > -20)) {
                System.out.println("Normal");
            } else if (t < -20) {
                System.out.println("Cold");
            }

            // 2 задача
            System.out.println("Enter number from 1 to 7 to choose color:");
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    System.out.println("RED");
                    break;
                case 2:
                    System.out.println("ORANGE");
                    break;
                case 3:
                    System.out.println("YELLOW");
                    break;
                case 4:
                    System.out.println("GREEN");
                    break;
                case 5:
                    System.out.println("BLUE");
                    break;
                case 6:
                    System.out.println("DARK BLUE");
                    break;
                case 7:
                    System.out.println("PURPLE");
                    break;
            }
            // 3 задача
            System.out.println("Enter number from 1 to 100");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println(sum);

            // 4 задача
            x = 7;
            while (x <= 100) {
                System.out.println(x);
                x = x + 7;
            }
            System.out.println("Enter number from 1 to 100");
            int u = scanner.nextInt();
            if (u > 1 || u < 100) {
                do {
                    System.out.println(u);
                    u = u * (u + 1) / 2;
                }
                while (u <= 100);
            } else if (u < 1 || u > 100) {
                System.out.println("Out of ordered number");
            }
            // 7 задача

            for (int i = 10; i <= 20; i++) {
                System.out.println(i * i);
            }
            // 8 задача
            Scanner k = new Scanner(System.in);
            System.out.println("Enter deposit amount:");
            float number1 = k.nextFloat();
            System.out.println("Enter the number of months of deposit placement:");
            int number2 = k.nextInt();
            System.out.println("Your deposit amount with interest for the specified period:");
            System.out.print(number1 + (number1 * number2 * 6 / 1000));

            // 9 задача

            for (int i = 1; i <= 10; i++) {
                System.out.println("3*" + i + "=" + 3 * i);
            }

        }
    }


