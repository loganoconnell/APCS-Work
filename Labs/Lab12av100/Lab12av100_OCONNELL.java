// Lab12av100_OCONNELL.java     This is the student starting version.
// This assignment pertains to some of the "Magpie" AP Lab Materials
//***************************************************************************
// The "Magpie" AP Lab is created for the College Board APCS
// curriculum by Laurie White.
// Leon Schram has altered some of the "Magpie" files to focus on 
// specific CS topics as the "Magpie" Lab is integrated into the curriculum.

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Lab12av100_OCONNELL {
	public static void main(String[] args) {
		MagpieLab12a maggie = new MagpieLab12a();

		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye")) {
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
}

class MagpieLab12a {
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	public String getResponse(String statement) {
		String response = "";
      
		if (statement.indexOf("no") >= 0){
			response = "Why so negative?";
		}
      
		else if (statement.indexOf("family") >= 0 || statement.indexOf("parent") >= 0 || statement.indexOf("mother") >= 0 || statement.indexOf("father") >= 0 || statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0) {
         String[] array = {"Tell me more about your family.", "Do you still talk your parents?", "Are you the oldest?", "Did you have any pets?", "How was your childhood?", "How many brothers do you have?", "How many sisters do you have?", "Do you get along with anyone particularly well?", "What was your favorite family vacation?", "Where did you grow up?"};
         ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(array));
         response = arrayList.get((int)(Math.random() * 10));
 		}
            
		else {
			response = getRandomResponse();
		}
      
		return response;
	}

	private String getRandomResponse() {
      String[] responses = {"Interesting, tell me more.", "Hmmm.", "Do you really think so?", "You don't say.", "Wow!", "Oh really?", "No way!", "How so?", "That's awesome!", "Good luck!"};
		return responses[(int)(Math.random() * 10)];
	}
}