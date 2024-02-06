class AllPrimeNo{
    public static void main(String args[])
    {
      allPrime(10);
    }
    public static void allPrime(int num)
    {
        int count;
        for(int i=2;i<num;i++)
        {
            count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                 count++; 
                  
                }
            }
            if(count==0)
        System.out.println(i);
        }
        
    }


}