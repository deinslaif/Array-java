import java.util.Scanner;
public class reverse_length_array {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int a[] = new int [5];
        System.out.println("enter any elements of array = ");
        for(int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt();
        }
        System.out.println("array elements = ");
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println("array reverse elements = ");
        for (int i=a.length-1; i>=0; i--)
        {
            System.out.println(a[i]+ " ");
        }
    }
}
