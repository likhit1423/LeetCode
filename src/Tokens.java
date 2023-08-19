public class Tokens {
    public static void main(String a[])
    {
        String s="He is a very very good boy, isn't he?";
        String []array = s.split("[ ,'?!._@]");
        int length = array.length;
        for(int i=0; i<array.length; i++)
        {
            if(array[i].compareTo("") == 0)
                length--;

        }
        System.out.println(length);
        for(int i=0; i<array.length; i++)
        {
            if(array[i].compareTo("") != 0)
                System.out.println(array[i]);

        }


    }
}
