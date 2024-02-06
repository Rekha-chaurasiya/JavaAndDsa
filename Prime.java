class Prime{
    public static void main(String args[])
    {
         prime(3);
    }
    public static void prime(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
        {
        
         if(num%i==0)
         {
            System.out.println(num+" "+"number is not prime");
            return;
         }
      
        }
        System.out.println(num+" "+"number is  prime");
    }
}