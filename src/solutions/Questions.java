/**
 * 
 */
package solutions;

import java.util.ArrayList;

/**
 * @author YunTing Wang
 *
 */
public class Questions {
	
	public int singleNumber(int[] nums) {
        int countNum = 0;
        for(int num : nums){     
            countNum = 0;
            for(int j = 0; j< nums.length; j++){
                if(num == nums[j]) countNum ++;
                if(countNum == 1 && j == nums.length -1)
                    return num;              
            }            
           
        }
        return 0;        
    }
	
	
	public boolean happyNumber(int n) {
		if(Math.pow(n,2.0) == 1) return true;      

        ArrayList <Integer> nums = new ArrayList<Integer>();
        ArrayList <Integer> vertify = new ArrayList<Integer>();
        int tempNum = 0;
        int older = n;
        nums = getNums(n);
        do{ 
            for(int num:nums) {
                tempNum += Math.pow(num, 2.0);	        		
            }
            if(tempNum == 1) return true;
            nums = getNums(tempNum);
            vertify.add(older);
            older = tempNum;
            tempNum = 0;
        }while(!vertify.contains(older)) ;
        return false;
	       
	 } 
	
	    public static ArrayList<Integer> getNums(int n){
	        ArrayList <Integer> tempNums = new ArrayList<Integer>();
	        String number = String.valueOf(n);
	        for(int i = 0; i < number.length(); i++) {
	            tempNums.add(Character.digit(number.charAt(i), 10));
	        }
	        return tempNums;   
	    }


	    public void moveZeroes(int [] nums) {
	    	int lastIdx = nums.length;
	        int tempIdx = 0;
	        for(int i=0; i< lastIdx; i++){
	            if(nums[i] == 0){
	                tempIdx = i;
	                while(tempIdx < lastIdx-1){
	                    nums[tempIdx] = nums[tempIdx+1];
	                    tempIdx++;
	                }
	                i--;
	                lastIdx --;
	                nums[lastIdx]=0;
	            }
	        }
	    }
}
