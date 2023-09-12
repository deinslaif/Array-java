import java.util.Scanner;
public class array_length {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner r = new Scanner(System.in);
        System.out.println("enter any elements = ");
        for(int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt();
        }
        System.out.println("array elements = ");
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]+ " ");
        }
        System.out.println("array length = " +a.length );
    }
}
