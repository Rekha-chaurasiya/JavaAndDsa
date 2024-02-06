
class Solution {
    public static String reverseStr(String s, int k) {
       String rev="";
      for(int i=k-1;i<=0;i--)  
      {
         rev=rev+(s.charAt(i));
      }
      return rev;
    }
  
    public static void main(String args[])
    {
        String s="abcde";
        String str=reverseStr(s,2);
        System.out.println(str);
    }
   
}
