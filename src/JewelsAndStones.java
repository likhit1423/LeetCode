import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class JewelsAndStones {
    public static void main(String a[])
    {
        String j="aA";
        String s="assssaAAbsssbbb";
        List<String> l1= Arrays.asList(j.split(""));
        List<String> l2= Arrays.asList(s.split(""));
        HashMap <String,Integer> m=new HashMap<String,Integer>();
        int k=1;
        for(int i=0;i<l2.size();i++)
        {
            if(m.containsKey(l2.get(i)))
            {
                k=m.get(l2.get(i));
                m.put(l2.get(i),++k);
            }
            else
            {
                k=1;
                m.put(l2.get(i),k);
            }
        }
        int p=0;
        for(int i=0;i<l1.size();i++)
        {
            if(m.containsKey(l1.get(i)))
                p+=m.get(l1.get(i));
        }
        System.out.println(p);
    }

}
