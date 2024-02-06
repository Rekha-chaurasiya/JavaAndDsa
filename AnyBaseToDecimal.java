class AnyBaseToDecimal{
    public static void main(String args[])
    {
     anyBaseToDecimal(8,101);

    }

    static void anyBaseToDecimal(int base,int anyNumber )
    {
        int res=0;
        int power=0;
        while(anyNumber>0)
        {
        int rem=anyNumber%10;
        res+=rem*Math.pow(base,power);
         anyNumber=anyNumber/10;
        power++;
 

        }
        System.out.println(res);

    }


}