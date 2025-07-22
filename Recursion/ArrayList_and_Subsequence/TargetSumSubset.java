public class TargetSumSubset {
    public static void main(String [] args){
        int target=60;  
        String sub="";
        int [] nums = {10,20,30,40,50};
        int sum=0,index=0;
        subsets(nums,sub,index,target,sum);

    }
    public static void subsets(int [] nums,String sub,int index,int target,int sum)
    {
        if(sum==target)
        {
            System.out.println(sub);
            return;
        }
        else if(index==nums.length||sum>target)
        {
            return;
        }
        //including 
        subsets(nums, sub+nums[index]+",", index+1, target, sum+nums[index]);
        //excluding
        subsets(nums, sub, index+1, target, sum);
    }
}
