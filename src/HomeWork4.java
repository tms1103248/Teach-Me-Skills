import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class HomeWork4 {
    public static void main(String[] args) {
// Задача 0 homeWork4
        System.out.println("Insert a number");
        int[] myArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10) + 1;
            //System.out.println(myArray[i]);
            if (j == myArray[i]) {
                System.out.println("The number is in the array");
                System.out.println(myArray[i]);
            } else {
                System.out.print("The number is out of array");
                System.out.println(myArray[i]);
            }

        }
        System.out.println(Arrays.toString(myArray));

// Задача 1 homeWork4
        System.out.println("Insert a number:");
        int myArray1[] = new int[10];
        int k = scanner.nextInt();
        for (int i = 0; i < myArray1.length; i++) {
            myArray1[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 0; i < myArray1.length; i++) {
            if (k != myArray1[i]) {
                System.out.println("No match");
            } else if (k == myArray1[i]) {
                System.out.println("Match");
            }
        }
        System.out.println(Arrays.toString(myArray1));
        for (int i = 0; i < myArray1.length; i++) {
            if (k == myArray1[i]) {
                myArray1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(myArray1));


// 2 задача homeWork4
        System.out.println("Enter a number from 0 to 20");

        int t = scanner.nextInt();
        int[] arr = new int[t];
        System.out.println(arr);
        for (int a = 0; a < arr.length; a++) {
            arr[a] = (int) (Math.random() * 10);
            System.out.println(arr[a]);
        }

        int max = arr[0];
        for (int s = 0; s < arr.length; s++) {
            if (arr[s] > max)
                max = arr[s];
        }
        System.out.println("Largest element present in given array:" + max);

        int min = arr[0];
        for (int y = 0; y < arr.length; y++) {
            if (arr[y] < min)
                min = arr[y];
        }
        System.out.println("Smallest element present in given array:" + min);

        double average = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int o = 0; o < arr.length; o++) {
                sum += arr[o];
            }
            average = sum / arr.length;
        }
        System.out.println(average);
        System.out.println(arr.length);

// 3 Задача homeWork4

        int[] mas1 = new int[5];
        int[] mas2 = new int[5];

        for (int i = 0; i < 5; i++) {
            mas1[i] = (int) (Math.random() * 6);
            mas2[i] = (int) (Math.random() * 6);
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));

        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < 5; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        }
        average1 /= 5;
        average2 /= 5;

        if (average1 > average2) {
            System.out.println("Average sum of the first array (" + average1 + ") is greater than average sum " + " second array (" + average2 + ")");
        } else if (average1 < average2) {
            System.out.println("Average sum of the first array (" + average1 + ") is smaller than average sum " + " second array (" + average2 + ")");
        } else {
            System.out.println("Average sums are equal (" + average1 + ")");
        }

// 4 задача homeWork4
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Insert number to set the size of the array in the range from 5 to 10");


        int n = 0;

        while (n <= 10) {
            if (scanner1.hasNextInt()) {
                n = scanner1.nextInt();
                if (n > 10) {
                    System.out.println("False. A number must be in range from 5 to 10. Try one more time.");
                }
                if (n < 5) {
                    System.out.println("False. A number must be in range from 5 to 10. Try one more time.");
                } else {
                    System.out.println("Try again. You do not entered number.");
                }
            }
            int[] mas3 = new int[n];
            int evenNums = 0;
            for (int i = 0; i < n; i++) {
                mas3[i] = (int) (Math.random() * (n + 1));
                if (mas3[i] % 2 == 0) {
                    evenNums++;
                }
            }
            System.out.println(Arrays.toString(mas3));
            int[] mas4 = new int[evenNums];
            int index = 0;
            for (int i = 0; i < n; i++) {
                if (mas3[i] % 2 == 0) {
                    mas4[index] = mas3[i];
                    index++;
                }
            }
            System.out.println(Arrays.toString(mas4));


        }
    }
}


























