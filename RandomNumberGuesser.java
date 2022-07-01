import  java.util.Scanner;


public class RandomNumberGuesser {
//main method, which will be the only one used in this driver and where we will conduct our program
	public static void main(String[] args) {
		
// Scanner object creation + initialization 
	Scanner userInput = new Scanner(System.in);

	RNG sup = new RNG();
	int randNum, nextGuess, lowGuess, highGuess,  count;

	
	String answer= "yes";
	count =RNG.getCount();

	
//random number generator	

	

		randNum = RNG.rand();
		answer = "yes";
		RNG.resetCount();
		lowGuess = 0;
		highGuess=100;
//unneeded
		System.out.println(randNum);
// user first guesses here 	
		System.out.println("Enter your first guess");
		nextGuess = userInput.nextInt();
		userInput.nextLine();

	
		do {
		if(RNG.inputValidation(nextGuess, lowGuess, highGuess) == true) {
		
			
			if (nextGuess == randNum) {
			System.out.println("congratulations, you guessed correctly");
			System.out.println("try again?(yes or no)");
			answer = userInput.nextLine();
			
			}
			else if(nextGuess < randNum || nextGuess > randNum); {
				if(nextGuess < randNum) {
				lowGuess = nextGuess;
				System.out.println("Number of guesses is "+count);
				System.out.println("your guess is too low");
				System.out.println("enter your next guess between "+ lowGuess + " and "+ highGuess);
				count++;
			
		}
				else if(nextGuess > randNum) {
				highGuess = nextGuess;
				System.out.println("Number of guesses is "+count);
				System.out.println("your guess is too high");
				System.out.println("enter your next guess between "+ lowGuess + "and "+ highGuess);
				count++;		
			}
		}
		}
		else
			System.out.println("guess must be between " + lowGuess + " and "+ highGuess + " try again");
			nextGuess = userInput.nextInt();
			userInput.nextLine();
	} while(answer.equalsIgnoreCase("yes"));
	
	
	System.out.println("thanks for playing..");
	System.out.println("bruce wyatt developer");
}
}



