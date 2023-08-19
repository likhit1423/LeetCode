public class IncrementDecrementOperations {

    public static void main(String a[])
    {
        int X=0;
        String a1[]={"X++","++X","--X","X--"};
        for(int i=0;i<a1.length;i++)
        {
            if(a1[i].equalsIgnoreCase("++X"))
                ++X;
            else if(a1[i].equalsIgnoreCase("--X"))
                --X;
            else if(a1[i].equalsIgnoreCase("X++"))
                X++;
            else if(a1[i].equalsIgnoreCase("X--"))
                X--;
        }
        System.out.println(X);
    }
}
