import java.util.Scanner;
public class allNegativeArray {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int [] a = new int [10];
        int positive=0, negative=0, zero=0;
        System.out.println("enter the elements = ");
        for (int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt();
        }

        for( int i=0; i<a.length; i++)
        {
            if (a[i]<0)
                negative++;
            else if (a[i]>0)
                positive++;
            else
                zero++;
        }

        System.out.println("positive numbers = " +positive);
        System.out.println("negative numbers = " +negative);
        System.out.println("zero = "+zero);
    }
}
