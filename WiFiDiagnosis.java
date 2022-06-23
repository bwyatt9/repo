/*
 * Class: CMSC203 
 * Instructor:Farnaz Eivazi
 * Description: (Give a brief description for each Class)
 * Due: 2/14/2022
 * Platform/compiler: Eclipse workspace
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Bruce Wyatt
*/

import java.util.Scanner;
public class WiFiDiagnosis {
	 static Scanner keyboard = new Scanner(System.in) ;
	//This is the main method, which will be the only method I use
	public static void main(String[] args) {
		
		String answer;
		
		System.out.println("This WiFi Diagnosis might help you if you are having trouble with your WiFi, follow the given instructions and answer the yes/no after completion.");
		System.out.println("Try rebooting the computer and then connecting");
		System.out.println("Did that fix the problem?");
		answer= keyboard.nextLine();
//This is the first branch of answers, the if else statements allow me to answer yes,no, and if the user puts in another answer I can tell them not to do that
	
		if(answer.equalsIgnoreCase("no"))  {
			System.out.println("Reboot the router and try to connect");
			System.out.println("Did that fix the problem?");
		}
		else if(answer.equalsIgnoreCase("yes")) {
			System.out.println("done");
		}
		else
			System.out.println("That is not a viable answer, please input yes or no on your next attempt");
		answer= keyboard.nextLine();
//This is the second branch of answers
		
		if(answer.equalsIgnoreCase("no"))  
		{
			System.out.println("Make sure the cables connecting the power router are firmly plugged in and power is getting to the router");
			System.out.println("Did that fix the problem?");
		}
			else if(answer.equalsIgnoreCase("yes")) {
				System.out.println("done");
			}
			else
				System.out.println("That is not a viable answer, please input yes or no on your next attempt");
		answer= keyboard.nextLine();
//this is the third branch of answers
	
		if(answer.equalsIgnoreCase("no"))  
		{
			System.out.println("Move the computer closer to the router and try to connect");
			System.out.println("Did that fix the problem?");
		}
			else if(answer.equalsIgnoreCase("yes")) {
				System.out.println("done");
			}
			else
				System.out.println("That is not a viable answer, please input yes or no on your next attempt");
		answer= keyboard.nextLine();
//This is the final branch
		
		if(answer.equalsIgnoreCase("no"))  
		{
			System.out.println("Contact your ISP");
		}
			else if(answer.equalsIgnoreCase("yes")) {
				System.out.println("done");
			}
			else
				System.out.println("That is not a viable answer, please input yes or no on your next attempt");
		}
}
