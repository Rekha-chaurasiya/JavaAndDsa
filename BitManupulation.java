class BitManupulation{
    public static void main(String args[])
    {                                                 
      bitprint(32);
      int res=setBit(32,1);
      bitprint(res);
    //0010000
            

    }
    public static void bitprint(int num)
    {
        
       for(int i=7;i>0;i--)           
       {
        System.out.print(num>>i&1);
       }
       System.out.println();
    } 
    public static int setBit(int num,int bit)
    {
         return (num|1<<bit);
    }
    }

