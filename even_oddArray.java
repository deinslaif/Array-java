import java.util.Scanner;
public class even_oddArray {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("enter the elements = ");
        for ( int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt();
        }
        System.out.println("even numbers = ");
        for ( int i=0; i<a.length; i++)
        {
            if (a[i]%2==0)
                System.out.println(a[i]);
        }
        System.out.println("odd numbers = ");
        for ( int i=0; i<a.length; i++)
        {
            if (a[i]%2!=0)
                System.out.println(a[i]);
        }

    }
}
