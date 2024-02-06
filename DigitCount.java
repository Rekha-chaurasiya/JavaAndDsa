class DigitCount
{
    public static void main(String args[])
    {
      digitCount(123456);
    }

    public static void digitCount(int num)
    {
        int count=0;
        while(num>0)
        {
         count++;
         num=num/10;
        }
        
        System.out.println(count);
        
    }
}
