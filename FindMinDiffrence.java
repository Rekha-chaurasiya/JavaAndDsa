public class FindMinDiffrence {

    public static void main(String args[])
    {
        int arr[]={3,5,7,8,9,45,67,89};
        findMinDifference(arr,1);
    }

    public static void findMinDifference(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        
        int res=-1;
        while(start<=end)
        {
          int mid=start+(end-start )/2;
          if(target==arr[mid])
          {
             res=arr[mid];
             break;
          }else if(target<arr[mid])
          {
           end=mid-1; 
          }else
          {
            start=mid+1;
          }
        }

        if(res==-1)
        {
        if(end==-1)
        {
            res=Math.abs(target-arr[start]);
            System.out.println("minimum difference "+res);
        }else if(start==arr.length)
            {
            res=Math.abs(target-arr[end]);
            System.out.println("minimum difference "+res);   
            }
             
        }else{
          int arrstart=Math.abs(target-arr[start]);
          int arrend=Math.abs(target-arr[end]);
          int mindiffe=Math.min(arrstart,arrend) ; 
          int difference=Math.abs(mindiffe);
          
          System.out.println("minimum value "+mindiffe);
          System.out.println("minimum difference "+difference);
        }
        
        }
        
    }
    

