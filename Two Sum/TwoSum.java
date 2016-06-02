/*
 * Given an array of integers
 * return the indices of the two numbers 
 * such that they add up to the target number
 */
 
public class TwoSum{
    
    public static void main(String args[]){
        
        int[] nums = {2,7,11,15};
        int target = 9;
        
        int i, j, var1, var2, sum;
        
        for( i = 0; i < nums.length; i++){
            
            // check if the first value is bigger than the target
            if(i < target){
                var1 = nums[i];
                
                // check if the second value is bigger than the target 
                for (j = i+1; j < nums.length; j++){
                
                    if(j < target){
                        var2 = nums[j];
                        sum = var1 + var2;
                        
                        if(sum == target){
                            System.out.printf("Target: %d \nIndex %d: %d\nIndex %d: %d \n",
                                        target, i, var1, j, var2);
                        }
                    }
                }
            }
        }
            
    }//end main
    
}//end class