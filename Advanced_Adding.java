import java.util.*;
public class Advanced_Adding
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        int x[];
        System.out.println("Give me two numbers: ");
        x = add(s.nextLine(), s.nextLine());
        print(x);
    }
    public static int[] add(String s, String s2)
    {
        int[] a1 = convert(s);
        int[] a2 = convert(s2);
        int[] a;
        if (a1.length >= a2.length)
            a = new int[a1.length+1];
        else
            a = new int[a2.length+1];
        int[] arr1 = new int[a.length];
        int[] arr2 = new int[a.length];
        fill(arr1, a1);
        fill(arr2, a2);
        for (int i = a.length-1; i > -1; i--)
        {
            a[i] += arr1[i] + arr2[i];
            if (a[i] >= 10)
            {
                a[i] -= 10;
                a[i-1] += 1;
            }
        }
        return a;
    }
    public static int[] convert(String s)
    {
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            a[i] = Integer.parseInt(s.substring(i,i+1));
        return a;
    }
    public static void print(int[] a)
    {
        boolean b = true;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == 0 && b == true)
                b = true;
            else
                b = false;
            if (!b)
                System.out.print(a[i]);
        }
        System.out.println("");
    }
    public static void fill(int[] arr, int[] a)
    {
        for (int i = 1; i < a.length+1; i++)
            arr[arr.length-i] = a[a.length-i];
    }
}
