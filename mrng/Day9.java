import java.util.*;

class LuckyNumber
{
    public static void main(String args[])
    {
      ArrayList<Integer> list=new ArrayList<>();
        int[][] nums={{1,2,3},{4,5,6},{10,8,9}};
        int n=nums.length;
        
        for(int i=0;i<n;i++)
        {
        int minrow=nums[i][0];
          for(int j=0;j<n;j++)
          {
         minrow=Math.min(minrow,nums[i][j]);
         }
           list.add(minrow);
         
          
        }  
        int maxcol=0;
        for(int k:list)
        {
         maxcol=Math.max(k,maxcol);
        }
        System.out.println(maxcol);
        

    }
}
//-----------------------------------------------------------------
class Product
{
    public static void main(String args[])
    {
          int nums[]={1,2,3,4};
          int n=nums.length;
        
          int[] result=new int[n];
          result[0]=1;
          for(int i=1;i<n;i++)
          {
          result[i]=result[i-1]*nums[i-1];
          }
          int right=1;
          for(int i=n-1;i>=0;i--)
          {
          result[i]=result[i]*right;
          right*=nums[i];
          }
          for(int k:result)
          {
          System.out.print(k+" ");
          }
    }
}
//-------------------------------------------------------------
class Rotation
{
  public static void main(String args[])
  {
  int nums[]={1,2,3,4,5,6,7};
  int k=3;
  int n=nums.length;
  k=k%n;
  int result[]=new int[n];
  
  for(int i=0;i<n;i++)
  {
  result[i]=nums[(1+i+k)%n];
  }
  for(int v:result)
  {
  System.out.print(v+" ");
  }
  
}
}
