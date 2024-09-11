
public class DeafGrandmaApp {
	public String greetGrandma = " ";
	public static void main(String[] args) {
		
		DeafGrandmaApp app = new DeafGrandmaApp();
		app.launch();
	}

	public void launch() {
		
		
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		Grandma Grandma = new Grandma();
		// Prompt user to say something to grandma, and tell user about grandma's hearing problem

		System.out.println("Hello, User! You have decided to visit your sweet old grandma.");
		System.out.println("However, grandma is pretty hard of hearing, and can only hear you when ");
		System.out.println("you raise your voice (input all caps). If you do not raise your voice, she ");
		System.out.println("will shout at you with some old grandma nonsense. Nobody wants that, so please ");
		System.out.println("keep that in mind when you say something to her. You have arrived at grandma's. ");
		System.out.println("Do you want to say something to your dear old grandma? ");
		System.out.println();
		System.out.println("what would you like to say?: ");
		greetGrandma = scanner.nextLine();
		Grandma.didGrandmaHearYou(greetGrandma);
		
				 
		}
	}
		
		

	
	


