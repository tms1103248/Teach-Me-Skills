import java.util.Scanner;
import java.util.Arrays;
public class HomeWork4 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            System.out.println(myArray[i]);

        }
// 2 задача homeWork4
        System.out.println("Enter an integer from 0 to 20");
        Scanner scanner = new Scanner(System.in);
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
        if (arr.length >0) {
            double sum = 0;
            for (int o = 0; o<arr.length; o++){
                sum+=arr [o];
            }
            average = sum/arr.length;
        }
        System.out.println(average);
        System.out.println(arr.length);
        //float sum = 0;
        // for (float e=0; e<arr.length; e++){
        //    sum=(sum+arr[t])/t;
        // }
        // System.out.println("Sum of the elements of an array:" + sum);


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

        for (int i = 0; i <5; i++) {
            average1 += mas1[i];
            average2 += mas2[i];
        }
        average1/=5;
        average2/=5;

        if(average1>average2) {
            System.out.println("Average sum of the first array ("+average1+") is greater than average sum "+" second array ("+average2+")");
                    } else if (average1<average2) {
            System.out.println("Average sum of the first array ("+average1+") is smaller than average sum "+" second array ("+average2+")");
        } else {
            System.out.println("Average sums are equal ("+average1+")");
        }
    }
                         }


























