/**
 * 
 */
package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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
	    
	    
	    public int max_Subarray(int[] nums) {
			 int tempSum = 0;
			 int max = nums[0];
			 //if(nums.length == 1) return nums[0];
			 for(int i=0; i< nums.length; i++){
			     tempSum = 0;
			     for(int j=i; j< nums.length; j++){          
			         tempSum += nums[j];
			         max = Math.max(max, tempSum);
			     }
			 }
			 return max;
	    }
	    	
	    public int maxProfit(int[] prices) {
	        int profit = 0;
	        for(int i=1; i<prices.length; i++){
	            int diff = prices[i]-prices[i-1];
	            if(diff > 0){
	                profit += diff;
	            }
	        }
	        return profit;
	    }

	    
        public List<List<String>> groupAnagrams_1(String[] strs) {
            List<List<String>> outList = new ArrayList<List<String>>();
            int tempIdx = 0;
            if(strs.length == 0 && strs == null) return outList;
            ArrayList<String> record  = new ArrayList<String>();
            List<String> list = new ArrayList<String>();
            /*solution 1 - without hashMap*/
            for(String str:strs){
                char [] cs = str.toCharArray();
                Arrays.sort(cs);
                String sortedString = new String(cs);
                if(record.indexOf(sortedString) != -1){
                    //seeking the position of array.
                    //add to the same group in outList
                    tempIdx = record.indexOf(sortedString);
                    outList.get(tempIdx).add(str);
                }else{
                    record.add(sortedString);
                    list = new ArrayList<String>();
                    list.add(str);
                    outList.add(list);
                }
            }
            return outList;
        }
        
        public List<List<String>> groupAnagrams_2(String[] strs){
        	List<List<String>> outList = new ArrayList<List<String>>();
        	
            if(strs.length == 0 && strs == null) return outList;
            
            ArrayList<String> record  = new ArrayList<String>();
            
            /* solution -1*/
            HashMap<String, Integer> recordMap  = new HashMap<String, Integer>(); 
            for(String str: strs){
                char[] c = str.toCharArray();
                Arrays.sort(c);
                String compareStr = new String(c);
                if(recordMap.containsKey(compareStr)){ //existing in the recordMap, it's the same group.
                    List<String> list = outList.get(recordMap.get(compareStr));
    				list.add(str);
                }else {
    				List<String> list = new ArrayList<String>();
    				list.add(str);
    				recordMap.put(compareStr, outList.size());
    				outList.add(list);
    			}
            }
            return outList;
        }
	    
}
