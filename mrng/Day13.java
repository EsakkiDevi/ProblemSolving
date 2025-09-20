import java.util.*;

class SpiralArray
{
  public static void main(String args[])
  {
    int n=3;
    int top=0;int bottom=n-1;
    int left=0;int right=n-1;
    int mat[][]=new int[n][n];
    int num=1;
    while(top<=bottom && left<=right)
    {
        for(int i=left;i<=right;i++)
        {
            mat[top][i]=num++;
        }
        top++;
        
        for(int i=top;i<=bottom;i++)
        {
            mat[i][right]=num++;
        }
        right--;
        
        if(top<=bottom)
        {
              for(int i=right;i>=left;i--)
              {
                  mat[bottom][i]=num++;
              }
              bottom--;
              
              if(left<=right)
              {
              for(int i=bottom;i>=top;i--)
              {
                  mat[i][left]=num++;
              }
              left++;
              }
        }
    }
    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
        System.out.print(mat[i][j]);
        }
        System.out.println();
  }
}
}



//---------------------------------------------------------------------------------------


class RotateMatrix
{
      public static void main(String args[])
      {
          int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
          int n=nums.length;
          int result[][]=new int[n][n];
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<n;j++)
              {
              result[j][i]=nums[i][j];
              }
          }
         
         for(int i=0;i<n;i++)
         {
         int l=0;
          int r=n-1;
          while(l<=r)
          {
         int temp=result[i][l];
         result[i][l]=result[i][r];
         result[i][r]=temp;
         l++;
         r--;
         }
         
          }
          
          
          /*for(int i=0;i<n;i++)
          {
            for(int j=0;j<n;j++)
            {
                System.out.print(result[i][j]);
                
            }
            System.out.println();
            }*/
            for(int[] row:result)
            {
            System.out.println(row);
            }
      }
}
//-------------------------------------------------
class WeakestRow
{
      public static void main(String args[])
      {
      int[][] mat={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
      int k=2;
      int count[]=new int[mat.length];
      for(int i=0;i<mat.length;i++)
      {
      int fre=0;
          for(int j=0;j<mat[0].length;j++)
          {
             if(mat[i][j]==1)
             {
             fre++;
             }
             
          
          }
          count[i]=fre;
      }
      ArrayList<Integer> list=new ArrayList<>();
      for(int i=0;i<k;i++)
      {
      int min=Integer.MAX_VALUE;
      int index=0;
          for(int j=0;j<count.length;j++)
         {
             if(min>count[j])
               {
                min=count[j];
                index=j;
                }
         }
           list.add(index);
          count[index]=Integer.MAX_VALUE;
      }
      System.out.println(list);
      
      }
}


