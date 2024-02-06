public class RotatedArrayFindMax {
    public static void main(String args[])
    {
      int nums[]={4,5,6,7};
     int maxElement= FindMaxInRotatedArray(nums);
     System.out.println("max element found "+maxElement);
    }
    public static int  FindMaxInRotatedArray(int nums[])
    {
        int start=0;
        int end=nums.length-1;
        while(start<end)  
      {
          int mid=start+(end-start)/2;
         
          if(mid>0&&nums[mid]<nums[mid-1])
          {
              return nums[mid-1];
          }else if(nums[start]<nums[mid])
          {
              start=mid+1;
          }
          else if(nums[end]>nums[mid])
          {
              end=mid-1;
          }
      }
      return 0;
    }
    }
    

