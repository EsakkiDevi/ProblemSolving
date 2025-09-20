class Boats
{
    public static void main(String args[])
    {
        int nums[]={1,2,4,5};
        int limit=6;
        int l=0;
        int r=nums.length-1;
        int boat=0;
        while(l<=r)
        {
            if(nums[l]+nums[r]<=limit)
            {
                boat++;
                
                l++;
                r--;
            }
            else if(nums[l]<=limit)
            {
            boat++;
            l++;
            }
            else
            {
            boat++;
            r--;
            }
        }
        System.out.println(boat);
    }
}
//--------------------------------------------------------------------------
class SameDiagonal
{
    public static void main(String args[])
    {
          int[][] nums={{1,2},{2,2}};
          int m=nums.length;
          int n=nums[0].length;
      for(int i=0;i<m;i++)
          {
            for(int j=0;j<n;j++)
            {
              if(samediagonal(nums,i+1,j+1))
              {
                 continue;
              }
              else
              {
                 System.out.println("False");
                return;
              }
            }
          }
          
          
          System.out.println("True");
          
          
          
    }
    public static boolean samediagonal(int[][] nums,int i,int j)
    {
        while(i<nums.length && j<nums[0].length)
        {
            if(nums[i][j]!=nums[i-1][j-1])
            {
            return false;
          
            }
            i++;
            j++;
        }
        return true;
    }
    
}

//--------------------------------------------------------
class Shape
{

    public static void main(String args[])
    {
        int points[]={{0,0},{0,1},{1,0},{1,1}};
        int count=0;
        for(int[] row:points)
        
        {
        
        
            
        }
    }
    public static boolean calDis(int[][] points,int i,int j)
    {
              
    
    }
}
