import java.util.Scanner;

public class MovieDriver {
	
	
	public static void main(String[] args) {
//object type scanner that reads from keyboard
Scanner Keyboard = new Scanner(System.in);

//new movie object
	Movie movieobject = new Movie();
//initializing 
	String title, rating;
	int soldTickets;
//reading in variables
	System.out.println("Enter the name of a movie");
	title = Keyboard.nextLine();
	System.out.println("Enter the rating of the movie");
	rating = Keyboard.nextLine();
	System.out.println("Enter the number of tickets sold for this movie");
	soldTickets = Keyboard.nextInt();
	Keyboard.nextLine();
//setting the objects 
	movieobject.setTitle(title);
	movieobject.setRating(rating);
	movieobject.setSoldTickets(soldTickets);
	System.out.println(movieobject);

	
// Task 2
	String answer;
	System.out.println("do you want to enter another? (y or n)");
	answer = Keyboard.nextLine();
	while(answer.equalsIgnoreCase("y")) {
		System.out.println("Enter the name of a movie");
		title = Keyboard.nextLine();
		System.out.println("Enter the rating of the movie");
		rating = Keyboard.nextLine();
		System.out.println("Enter the number of tickets sold for this movie");
		soldTickets = Keyboard.nextInt();
		Keyboard.nextLine();
	//setting the objects 
		movieobject.setTitle(title);
		movieobject.setRating(rating);
		movieobject.setSoldTickets(soldTickets);
		System.out.println(movieobject);
		

		answer = Keyboard.nextLine();
		System.out.println("do you want to enter another? (y or n)");
		
		
	}
System.out.println("goodbye");
	}

}
