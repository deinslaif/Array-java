import java.util.*;

public class highest_array {

    public static void main(String[] args) {
        int[] a = new int[5];
        Arrays.sort(a);
        Scanner r = new Scanner(System.in);
        System.out.println("Enter any elements: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("The second highest array: ");
        for (int i = 1; i < a.length; i++) {
            
        }
        System.out.println(+a[a.length-2]);
    }
}
