import java.util.*;
public class Advanced_Subtraction
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        ArrayList<Integer> x;
        System.out.println("Give me a number: ");
        String s1 = s.nextLine();
        System.out.println("Give me a number to subtract from it: ");
        String s2 = s.nextLine();
        x = subtract(s1,s2);
        print(x);
    }
    public static ArrayList<Integer> subtract(String s1, String s2)
    {
        ArrayList<Integer> a1 = convert(s1);
        ArrayList<Integer> a2 = convert(s2);
        ArrayList<Integer> a = new ArrayList();
        boolean negative = needNegative(a1,a2);
        if (negative)
        {
            for (int i = 0; i < a2.size()-1; i++)
            {
                int n1 = a1.get(a1.size()-(i+1));
                int n2 = a2.get(a2.size()-(i+1));
                if (n2 == n1)
                    a.add(0, 0);
                else if (n2 > n1)
                    a.add(0, n2-n1);
                else
                {
                    a.add(0,(n2+10)-n1);
                    a2.set(a2.size()-(i+2), a2.get(a2.size()-(i+2))-1);
                }
            }
            if (a1.size() == a2.size())
                a.add(0, a1.get(0) - a2.get(0));
            else
                a.add(0, Math.abs(a2.get(0)));
            for (int i = 0; i < a.size(); i++)
            {
                if (a.get(i) != 0)
                {
                    a.set(i, Math.abs(a.get(i))*-1);
                    break;
                }
            }
        }
        else
        {
            for (int i = 0; i < a1.size()-1; i++)
            {
                int n1 = a1.get(a1.size()-(i+1));
                int n2 = a2.get(a2.size()-(i+1));
                if (n2 == n1)
                    a.add(0, 0);
                else if (n1 > n2)
                    a.add(0, n1-n2);
                else
                {
                    a.add(0,(n1+10)-n2);
                    a1.set(a1.size()-(i+2), a1.get(a1.size()-(i+2))-1);
                }
            }
            if (a1.size() == a2.size())
                a.add(0, Math.abs(a1.get(0) - a2.get(0)));
            else
                a.add(0, Math.abs(a1.get(0)));
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
    public static boolean needNegative(ArrayList<Integer> a1, ArrayList<Integer> a2)
    {
        if (a1.size() == a2.size())
        {
            for (int i = 0; i < a1.size(); i++)
            {
                if (a2.get(i) > a1.get(i))
                    return true;
                else if (a1.get(i) > a2.get(i))
                    return false;
            }
            return false;
        }
        else if (a2. size() > a1.size())
            return true;
        else
            return false;
    }
}
