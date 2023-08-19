import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrams
{
public static void main(String a[])
{
    String a1="Anagram";
    String b1="marganaa";
    a1=a1.toLowerCase();
    b1=b1.toLowerCase();
    List<String> l1= new ArrayList<String>(Arrays.asList(a1.split("")));
    List<String> l2= new ArrayList<String>(Arrays.asList(b1.split("")));
    Collections.sort(l1);
    Collections.sort(l2);
    System.out.println(l1);
    System.out.println(l2);
    if(l1.equals(l2))
        System.out.println("Anagram");
    else
        System.out.println("Not Anagram");
}

}
