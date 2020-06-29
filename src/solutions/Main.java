/**
 * 
 */
package solutions;

import java.util.Scanner;

/**
 * @author YunTing Wang
 *
 */
public class Main {

	/**
	 * the questions from leetcode or somewhere
	 * @param args
	 */
	static Questions questions = new Questions();
	public static void main(String[] args) {
		boolean isExit = true;
		while(isExit) {
			switch(menu()) {
			case "1":
				System.out.println("questions:");
				break;
			case "2":
				System.out.println("Get longestBreak in the weekly schedule.\n");
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				System.out.println("Exit.");
				isExit = false;
			break;
			default:
				break;
			
			}
		}
	}
	private static String menu() {
		String input ="";
		String menuString = "select functions: \n"
				+ "1. questions form leetCode pure code).\n"
				+ "2. Get longestBreak in the weekly schedule.\n"
				+"5. Exit";
		System.out.println(menuString);
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		
		return input;
	}	

}
