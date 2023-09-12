import java.util.Scanner;
public class copyArray {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        System.out.println("enter the elements = ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt();
        }
        System.out.println("first array element = ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]+ " ");
        }
        System.out.println("second array element = ");
        for (int i = 0; i < a.length; i++)
        {
            b[i]=a[i];
            System.out.println(b[i]+ " ");
        }

    }
}
