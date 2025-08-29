import java.util.*;

class pattern
{
    public static void main(String args[])
    {
      int n=6;int x=1;
      for(int i=1;i<=n;i++)
      {
          int value=x;
          for(int j=i;j<=n;j++)
          {
       
          System.out.print(value+" ");
          value+=j;
          }
          x+=i+1;
          
          
          System.out.println();
      }
    }
}

//------------------------------------------------------
class  Union
{
    public static void main(String  args[])
    {
        int[] nums1={-1,-2,-3};
        int[] nums2={-3,-4,-5,0};
        int[] result=new int[nums1.length +nums2.length];
       
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<nums1.length;i++)
            {
                if(!list.contains(nums1[i]))
                {
                   list.add(nums1[i]);
                }
            }
            for(int i=0;i<nums2.length;i++)
            {
                if(!list.contains(nums2[i]))
                {
                   list.add(nums2[i]);
                }
            }
            System.out.println(list);
            
              }
        }
        
//-------------------------------------------------------------------------------------------
class continousLength
{
    public static void main(String args[])
    {
    
        int nums[]={1,2,6,4,7,8,3,9};
        Arrays.sort(nums);
       
        List<List<Integer>> list=new ArrayList<>();
        int i=0;
        int maxlength=0;
      while(i<nums.length)
      {
      List<Integer> arr=new ArrayList<>();
      int count=0;
      
      arr.add(nums[i]);
          while(i+1<nums.length && nums[i]+1==nums[i+1])
          {
         arr.add(nums[i+1]);
          count++;
          i++;
          }
         
          if(maxlength<count)
          {
          list=new ArrayList<>();
               list.add(arr);
               maxlength=count;
          }
          else if(maxlength==count)
          {
              list.add(arr);
          }
          i++;
      }

        
      
      System.out.println(list);
        
   }
}
