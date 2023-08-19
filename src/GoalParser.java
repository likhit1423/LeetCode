import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoalParser {

    public static void main(String a[])
    {
        String s="(al)G(al)()()G";
        String s1="";
        List<String> al= Arrays.asList(s.split(""));
        List<String> l1=new ArrayList<String>();
        System.out.println(al);
        for(int i=0;i<al.size();i++)
        {
            if(al.get(i).equalsIgnoreCase("G"))
                l1.add("G");
            else if(al.get(i).equalsIgnoreCase("(")&&al.get(i+1).equalsIgnoreCase(")"))
            {
                l1.add("()");
                i++;
            }

            else if(al.get(i).equalsIgnoreCase("(")&&al.get(i+1).equalsIgnoreCase("a")&&al.get(i+2).equalsIgnoreCase("l")&&al.get(i+3).equalsIgnoreCase(")"))
            {
                l1.add("(al)");
                i+=3;
            }

        }
        System.out.println(l1);
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i).equalsIgnoreCase("G"))
                continue;
            else if(l1.get(i).equalsIgnoreCase("()"))
                l1.set(i,"o");
            else if(l1.get(i).equalsIgnoreCase("(al)"))
                l1.set(i,"al");
        }
        System.out.println(l1);
        String listString = String.join("", l1);
        System.out.println(listString);
    }

}
