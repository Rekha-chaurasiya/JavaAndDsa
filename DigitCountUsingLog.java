class DigitCountUsingLog{
    public static void main(String args[])
    {
        digitCountUsingLog(3456745);

    }
    public static void digitCountUsingLog(int num)
    {
        
     int res=(int)Math.log10(num)+1;
     
     System.out.println(res);
    }

    
}