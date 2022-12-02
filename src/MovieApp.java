import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MovieApp {
	public static void main(String[] args) {
		char loopResponse;
		Scanner scnr = new Scanner(System.in);
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Spider-Man: Into The Spider-verse","animated"));
		movies.add(new Movie("Kill Bill","drama"));
		movies.add(new Movie("Hereditary","horror"));
		movies.add(new Movie("Transformers","scifi"));
		movies.add(new Movie("Incredibles","animated"));
		movies.add(new Movie("Top Gun","drama"));
		movies.add(new Movie("Paranormal Activity","horror"));
		movies.add(new Movie("Blade Runner","scifi"));
		movies.add(new Movie("Beauty and the Beast","animated"));
		movies.add(new Movie("The Wolf of Wallstreet","drama"));
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("");
		System.out.println("There are 10 movies in this list.");
		do {
			boolean validEntry = false;
			do {
				System.out.print("What category are you interested in?(animated, scifi, horror, drama)");
				String response = scnr.next();
				if (response.matches("animated|drama|horror|scifi"){
					validEntry = true;
					for (int i = 0; i < movies.size(); i++) {
					if (response.equals(movies.get(i).genre)) {
						System.out.println(movies.get(i).title);
					}else {continue;}
				}
			}else {
				System.out.println("That is not a valid entry.");
				validEntry = false;
			}
			}while (!validEntry);
			System.out.print("Continue? (y/n):");
			loopResponse = scnr.next().charAt(0);
		}while (Character.toLowerCase(loopResponse) == 'y');
		System.out.println("Have a nice day!");
	}
}
