



public class Reverses {
   public static void main(String args[])
   {
    String str="rekha";
    String rev="";
    System.out.println(str.length());
    for(int i=str.length()-2;i>=0;i--)
    {
       rev=rev+(str.charAt(i));
      
    }
    if(rev.length()==str.length())
    {

    
    System.out.println(rev);
    }
    System.out.println(rev.length());
   }
  
    
}
