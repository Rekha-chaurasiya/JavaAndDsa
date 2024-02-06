public class arrayInfinite {
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,6,7,8,9,10,11,34,56,78,89,120,789,890,1111,5678};
        int arr1[]=findrangeinInfiniteArray(arr,34);
        for(int ar:arr1)
        System.out.print(ar+", ");
        elementSearch(arr1,10);


    }
    public static int[] findrangeinInfiniteArray(int arr[],int target)
    {
     int start=0;
     int end=1;
    
     while(arr[end]<=target)
     {
        start=end;
        end=2*end;
     }
     int arr1[]=new int[end-start+1];
     int k=0;
     for(int i=start;i<=end;i++)
     {
      arr1[k]=arr[i];
      k++;
     }
    
      return arr1;
    
     
    }

    public static void elementSearch(int arr[],int target)
    {
      int start=0;
      int ans=-1;
      int end =arr.length-1;
     
      while(start<=end)
      {
        int mid=start+(end-start)/2;
        if(target==arr[mid])
        {
             ans= mid;
             break;
        }else if(target<arr[mid])
        {
            end=mid-1;
        }else
        {
         start=mid+1;   
        }
      }
      if(ans==-1)
      {
   System.out.println("element is not found");
      }
      else
  System.out.println("element found in index  "+ans);

    }
    

    
}
