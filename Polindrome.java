class Polindrome
{
    public static void main(String args[])
    {
     polindrome(122);
    }
    public static void polindrome(int num)
    {
        int copy=121;
        int res=0;
        while(num>0)
        {
            int rem =num%10;
              res=res*10+rem;
              num=num/10;
        }
        System.out.println(copy==res);

    }

}