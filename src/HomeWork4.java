import java.util.Scanner;
import java.util.Arrays;
public class HomeWork4 {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 10);
            System.out.println(myArray[i]);
        }
        System.out.println("Enter an integer from 0 to 20");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int [] myArray1 =  myArray;
        Arrays.sort(myArray);


        int pos1 = Arrays.binarySearch(myArray1,t);

               System.out.println(pos1);




                }
            }










