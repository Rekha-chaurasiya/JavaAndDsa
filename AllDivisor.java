class AllDivisor
{
    public static void main(String args[])
    {
      allDivisor(36);
    } 
    public static void allDivisor(int num)
    {
        int count=1;
       
     while(count<=num)  
     {
        if(num%count==0)
        {
            System.out.println(count);
        }

        count++;
     }
    }
}