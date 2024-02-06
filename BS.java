public class BS {
    public static void main(String args[])
    {
        int arr[]={2,3,4,5,5,5,6,7,8,9,50,60};
        int arr1[]={9,8,7,6,5,4,3,2,1};
        //elementSearch(arr,50);
        // elementSearchdesc(arr1,4);
        // withoutkonwingsortedArray(arr1,4);
        // withoutkonwingsortedArray(arr,8);
        elementSearchFirstOcuurence(arr,5);
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
  System.out.println("element found in indes  "+ans);

    }
    public static void elementSearchdesc(int arr[],int target)
    {
        int start=0;int 
        end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                break;
            }else if(arr[mid]<target)
            {
               end=mid-1; 
            }
            else 
            {
                start=mid+1;
            }
        }
        if(ans==-1)
        {
            System.out.println("element is not found");
        }else
            System.out.println("element is found "+ans +"ith index" );
        
    } 
    public static void withoutkonwingsortedArray(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end]) 
        {
            elementSearch(arr,target); 
        }else{
            elementSearchdesc(arr,target); 
        }
    }
    

    public static void elementSearchFirstOcuurence(int arr[],int target)
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
                   //end=mid-1;
                   start=mid+1;
                   
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
        System.out.println("element found in indes  "+ans);
      
            
    }
}
