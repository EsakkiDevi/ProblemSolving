class TwoAdjacentSame
{
    public static void main(String args[])
    {
    int nums[]={0,2,2,2,6,6,0,8};
    int result[]=new int[nums.length];
    int i=0;
    int index=0;
    while(i<nums.length)
    {
        if(i+1<nums.length  && nums[i]==nums[i+1] && nums[i]!=0)
        {
        result[index++]=nums[i]+nums[i+1];
        i+=2;
        }
        else if(nums[i]!=0)
        {
        result[index++]=nums[i];
        i++;
        }
        else
        {
        i++;
        }
        
    }
    for(int k:result)
    {
    System.out.print(k+" ");
    }
    }
}
