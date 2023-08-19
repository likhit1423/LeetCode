import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IPAddress {
    public static void main(String a[])
    {
        String s="1.1.1.1";
        System.out.println(s);
        List<String> l1=Arrays.asList(s.split(""));
        System.out.println(l1);
        for(int i=0;i<l1.size();i++)
        {
            if(l1.get(i).equalsIgnoreCase("."))
            {
                l1.set(i,"[.]");
            }
        }
        System.out.println(l1);
        String listString = String.join("", l1);
        System.out.println(listString);
    }

}
