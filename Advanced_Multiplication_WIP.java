import java.util.*;
public class Advanced_Multiplication_WIP
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        ArrayList<Integer> x;
        System.out.println("Give me a number: ");
        String s1 = s.nextLine();
        System.out.println("Give me a number to multiply it by: ");
        String s2 = s.nextLine();
        x = subtract(s1,s2);
        print(x);
    }
    public static ArrayList<Integer> subtract(String s1, String s2)
    {
        ArrayList<Integer> a1 = convert(s1);
        ArrayList<Integer> a2 = convert(s2);
        ArrayList<Integer> a = new ArrayList();
        for(int i = a2.size()-1; i >= 0; i--)
        {
            for (int j = a1.size()-1; j >= 0; j--)
            {
                int x = a2.get(i) * a1.get(j);
                int temp;
                if (x < 10)
                {
                    a.add(0,x);
                    temp = 0;
                }
                else
                {
                    a.add(0, x%10);
                    temp = x/10;
                }
                if (temp != 0)
                {
                    a.set(0, a.get(0) + temp);
                    if (a.get(0) > 9)
                    {
                        temp += a.get(0) / 10;
                        a.set(0, a.get(0)%10);
                    }
                }
                print(a);
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
