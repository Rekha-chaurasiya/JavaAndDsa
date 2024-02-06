public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={5,7,8,9,10,67,89,90};
        int aar1[]={50,40,30,20,10,5,2,1};
        // binarySearch(arr,7);
        // binarySearchdesc(aar1,50);
        binarySearchwithoutknowingorder(arr,10);
        binarySearchwithoutknowingorder(aar1,20);
        
    }
    public static void binarySearch(int arr[],int target)
    {

        int ans=-1;
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
        int mid=start+(end-start)/2;
         if(arr[mid]==target)
         {
          ans=mid;
          break;
         }
        else if(arr[mid]<target)
        {
           start=mid+1;
        
        }else{
            end=mid-1;
        }
        }if(ans==-1)
        {
            System.out.println("element is not found");    
        }
        System.out.println("element is found"+"  " +ans +"  "+"index");
    }
    public static void binarySearchdesc(int arr[],int target){
        int start=0;
        int end=arr.length-1;
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
        }else
        {
            start=mid+1;
        }
    }
        if(ans==-1)
        {
            System.out.println("element is not found");    
        }else
        System.out.println("element is found"+"  " +ans +"  "+"index");
        
    }
    public static void binarySearchwithoutknowingorder(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        if(arr[start]<arr[end])
        {
            binarySearch(arr,target);   
        }else{
            binarySearchdesc(arr,target);   
        }
    }
}
