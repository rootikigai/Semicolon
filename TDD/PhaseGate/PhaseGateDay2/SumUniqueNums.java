public class SumUniqueNums{
	public static int sumUnique(int[] nums){
    int count = 0;
    int sum = 0;
		for(count = 0; count < nums.length; count++){
      if(nums[0] != nums[1] && nums[0] != nums[2] && nums[0] != nums[3] && nums[0] != nums[4]){
        count++;
        sum += count;
      }
      if(nums[1] != nums[0] && nums[1] != nums[2] && nums[1] != nums[3] && nums[1] != nums[4]){
        count++;
        sum += count;
      }
      if(nums[2] != nums[0] && nums[2] != nums[1] && nums[2] != nums[3] && nums[2] != nums[4]){
        count++;
        sum += count;
      }
      if(nums[3] != nums[0] && nums[3] != nums[1] && nums[3] != nums[2] && nums[3] != nums[4]){
        count++;
        sum += count;
      }
      if(nums[4] != nums[0] && nums[4] != nums[1] && nums[4] != nums[2] && nums[4] != nums[3]){
        count++;
        sum += count;
      }
	  }
    return sum;
  }
}
