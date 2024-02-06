class DecimalAnyBase{
    public static void main(String args[])
    {
     decimalToAnyBase(8,5);
    }
    static void decimalToAnyBase(int base,int anyNumber)
    {
      int res=0;
      int power=0;
      while(anyNumber>0)
      {
      int rem=anyNumber%base;
      res+=rem*Math.pow(10,power);
      power++;
      anyNumber=anyNumber/base;
      }
      System.out.println(res);
    }
}