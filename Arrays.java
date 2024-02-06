import java.util.Scanner;
class Arrays{

public static void main(String args[])
{
    int rollno[]=new int[5];
  
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<rollno.length-2;i++)
    {
      System.out.println("Enter value:");
       int num = sc.nextInt();
      rollno[i]=num;
    }
    printArrays(rollno);
    insertElement(rollno,1,45);
    printArrays(rollno);
    deleteElement(rollno,2);
    printArrays(rollno);

    
}
public static void printArrays(int arr[])
{
  for(int i=0;i<arr.length;i++)
  {
    System.out.print(arr[i]+" ");
   
  }
}
public static void insertElement(int arr[],int pos,int element)
{
  int n=arr.length;
  if(pos<0 || pos>n-1)
  {
    System.out.println("wrong input");
    return;
  }
  for(int i=n-2;i>pos;i--)
  {
    arr[i+1]=arr[i];
  }
  arr[pos]=element;
}
public static void deleteElement(int arr[],int pos)
{
  for(int i=pos;i<arr.length;i++)
  {
    arr[i]=arr[i+1];
  }
  arr[arr.length-1]=0;
}
}