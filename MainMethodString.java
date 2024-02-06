public class MainMethodString {
    public static void main(String[] args) {
        int res=add(3,5);

        System.out.println(res);
        for(String ar:args)
        {
            System.out.println(ar);
        }
        
    }
    public static int add(int a,int b)
    {
        int z=a+b;
        return z;
    }
}
