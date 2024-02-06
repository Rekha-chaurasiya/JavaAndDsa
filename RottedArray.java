public class RottedArray {
    public static void main(String[] args) {
        int arr[]={8,7};
        int arr1[]={2,3,4,5,6,7,8};
        findMinInRottedArray(arr1);
    }



    public static void findMinInRottedArray(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            int prev=(mid-1+arr.length)%arr.length;
            int next=(mid+1)%arr.length;

            if( arr[mid]<arr[prev] && arr[mid]<arr[next])
            {
               ans=mid;
               break;
            }else if(arr[mid]<arr[end])
            {
                end=mid-1;
            
            }
            else
            {
                start=mid+1;
            }
        }
        
            System.out.println("min element found in array "+arr[ans]);
        
        }
    }
    

