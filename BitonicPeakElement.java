public class BitonicPeakElement {

   
    public static void main(String[] args) {
     int arr[]={2,3,4,5,8,9,20,15,13};  
   
     
    //  bitonicPeakElement(arr);
     int index=bitonicSearch(arr,4);
     System.out.println("element found in index:"+index);
     
    }

    public static int bitonicPeakElement(int arr[])
    {
        int count=0;
       int start=0;
       int end =arr.length-1;
       int ans=-1;
       while(start<=end)
       {
       int mid=start+(end-start)/2;
       int prev=(mid-1+arr.length)%arr.length;
       int next=(mid+1)%arr.length;
       count++;
       if(arr[mid]>arr[prev] && arr[mid]>arr[next])
       {
           ans=mid;
           break;
       }
       else if(arr[mid]>arr[mid-1])
    //    if(arr[mid]>arr[mid-1])
       {
        start=mid-1;
      
       }
       else{
        end=mid-1;
        
       }
    
       }
       return ans;
      
    }
 
    public static int bitonicSearch(int arr[],int target)
    {
       int index= bitonicPeakElement(arr);
       int ans=0;
       if(arr[index]==target)
       {
        return index;
       }
       else{
          
          ans=binarySearch(arr,0,index-1,target);
          if(ans==-1)
          {
            ans=binarySearchdesc(arr,index+1,arr.length-1,target);
            
          }
        }
          if(ans==-1){
            System.out.println("element not found");
          }
          
        
    
        return ans;
       }

    
     
    

    public static int binarySearch(int arr[], int start,int end,int target)
    {
     
     int ans=-1;
     while(start<=end)
     {
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            ans= mid;
            break;

        
        }else if(arr[mid]>target)
        {
         end=mid-1;
        }
        else{
            start=mid+1;
        }
     } 
            return ans;
        }
     
    

    public static int binarySearchdesc(int arr[],int start,int end,int target)
    {
     
     int ans=-1;
     while(start<=end)
     {
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            ans= mid;
            break;
           
        }else if(arr[mid]>target)
        {
         start=mid+1;
        }
        else{
            end=mid-1;
        }
     }
        return ans;
    }
     
    }


