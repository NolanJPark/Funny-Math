import java.util.*;
public class Advanced_Division_WIP
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        ArrayList<Integer> x;
        System.out.println("Give me a number: ");
        String s1 = s.nextLine();
        System.out.println("Give me a number to divide it by: ");
        String s2 = s.nextLine();
        x = subtract(s1,s2);
        print(x);
    }
    public static ArrayList<Integer> subtract(String s1, String s2)
    {
        ArrayList<Integer> a1 = convert(s1);
        int a2 = convertInt(s2);
        ArrayList<Integer> a = new ArrayList();
        for (int i = 0; i < a1.size(); i++)
        {
            if (a1.get(i) < a2)
            {
                a.add(0);
                
            }
        }
        return a;
    }
    public static ArrayList<Integer> convert(String s)
    {
        ArrayList<Integer> a = new ArrayList(s.length());
        for (int i = 0; i < s.length(); i++)
            a.add(Integer.parseInt(s.substring(i,i+1)));
        return a;
    }
    public static int convertInt(String s)
    {
        int x = 0;
        for (int i = 0; i < s.length(); i++)
        {
            x += Integer.parseInt(s.substring(i,i+1)) * Math.pow(10, s.length()-i-1);
        }
        return x;
    }
    public static void print(ArrayList<Integer> a)
    {
        boolean b = true;
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) != 0)
                break;
            else if (i+1 == a.size())
            {
                System.out.println("0");
                return;
            }
        }
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) == 0 && b == true)
                b = true;
            else
                b = false;
            if (!b)
                System.out.print(a.get(i));
        }
        System.out.println("");
    }
}
