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
	 * @param args
	 */
	static Questions questions = new Questions();
	public static void main(String[] args) {
		int [] testArray = {4,1,2,1,2};
		int [] testArray_moveZeroes = {4,0,2,0,1};
		//single Number
		System.out.println("Output: " + questions.singleNumber(testArray));
		questions.happyNumber(19);
		questions.moveZeroes(testArray_moveZeroes);

	}

}
