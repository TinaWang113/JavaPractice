/**
 * 
 */
package solutions;

/**
 * @author YunTing Wang
 *
 */
public class Main {

	/**
	 * the questions from leetcode
	 * url: https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/
	 * @param args
	 */
	static Questions questions = new Questions();
	public static void main(String[] args) {
		int [] testArray = {-2,1,-3,4,-1,2,1,-5,4};
		int [] testArray_moveZeroes = {4,0,2,0,1};
		String [] testString = {"eat", "tea", "tan", "ate", "nat", "bat"};
		//single Number
		questions.singleNumber(testArray);
		questions.happyNumber(19);
		questions.moveZeroes(testArray_moveZeroes);
		questions.max_Subarray(testArray);
		questions.maxProfit(testArray);
		questions.groupAnagrams_1(testString);
		questions.groupAnagrams_2(testString);
	}

}
