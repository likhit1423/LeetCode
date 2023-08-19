import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maxNumberOfSentences {
    public static void main(String a[])
    {
        String s[]={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        List<Integer> ls=new ArrayList<Integer>();
        for(int i=0;i<s.length;i++)
        {
            String s1[]=s[i].split(" ");
            ls.add(s1.length);
        }
        int max= Collections.max(ls);
        System.out.println(max);

    }
}
