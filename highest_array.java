import java.util.Scanner;
import java.util.Arrays;

public class SecondHighestArray {

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner r = new Scanner(System.in);
        
        System.out.println("Enter any elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        
        // Sort the array in ascending order
        Arrays.sort(a);

        // The second highest element will be at a.length - 2 index
        int secondHighest = a[a.length - 2];

        System.out.println("The second highest array: " + secondHighest);
    }
}
