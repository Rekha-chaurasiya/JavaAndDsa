public class FindMidIndex {
  public static void main(String args[])
  {
    int arr[]={2,3};
    leetCodeFindMidIndex(arr);
  }
    public static void leetCodeFindMidIndex(int arr[])
    {
        int left;
        int right;
        int index=-1;
      for(int i=0;i<=arr.length-1;i++)
      {
       left=0;
       right=0;
         for(int j=0;j<i;j++)
         {
            left=left+arr[j];
         }
         for(int k=i+1;k<=arr.length-1;k++)
         {
            right=right+arr[k];
            
         }
        
         if(left==right)
         {
           index=i;
           break;
         }

      }
      if(index==-1)
      {
        System.out.println("mid not found");
      }
     else
      System.out.println("index of mid value:"+index);
    } 
    
}

