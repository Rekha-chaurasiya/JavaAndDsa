class ArmStrongNum{
    public static void main(String args[])
    {
     armStrongNum(153);
    }
    public static void armStrongNum(int num)
    {
      int copy=num;
      int res=0;
      while(num>0)
      {
        int rem=num%10;
        res+=Math.pow(rem,3);
        num=num/10;
      }
      System.out.println(copy==res);
    }
}