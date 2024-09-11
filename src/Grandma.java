public class Grandma {
	public String grandmaHearsYou = " ";
	public String grandmaDoesntHearYou = " "; 

			
		
	// method for when grandma hears you, gives 1 of 5 random responses. system will ask you to continue talking to granny
	public void grandmaHearsYou() {
		
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			java.util.Random rand = new java.util.Random();
			
		 	String grandmaResponses[] = new String[5];
			grandmaResponses[0] = "HEY THERE, SONNY!";
			grandmaResponses[1] = "WHAT'RE YOU LOOKIN' AT??";
			grandmaResponses[2] = "IT'S BEEN AGES! WHERE'VE YOU BEEN??";
			grandmaResponses[3] = "FELLOW?? THERE'S NO FELLOW HERE, NOT SINCE GRANPA DIED ";
			grandmaResponses[4] = "COME ON IN, SWEETIE! WE HAVE COOKIES!";
			int index = rand.nextInt(grandmaResponses.length);
			System.out.println(grandmaResponses[index]);
			System.out.println();
			System.out.println("What else would you like to say? ");
			System.out.println();
			grandmaHearsYou = scanner.next();
			if (grandmaHearsYou.equals("GOODBYE")) {
				System.out.println("GOODBYE, SONNY!");
				System.out.println("Your conversation with grandma has ended. ");
			}
//			else {
//				whileGrandmaHearsYou ();
			else if (grandmaHearsYou.equals(grandmaHearsYou.toUpperCase())) {
				grandmaHearsYou();
		    	}
			else if (grandmaHearsYou.equalsIgnoreCase(grandmaHearsYou)){
		    		grandmaDoesntHearYou();	
				}
	}		    	
			
				
			
			 		
			
		
	

	// method for when grandma DOESNT hear you, gives 1 of 5 random responses. system will ask you to continue talking to granny
	public void grandmaDoesntHearYou () {
			java.util.Scanner scanner = new java.util.Scanner(System.in);
			java.util.Random rand = new java.util.Random();
			String grandmaDoesntHearYou = " ";
			
		 	String grandmaOtherResponses[] = new String[5];
				grandmaOtherResponses[0] = "WHAT?! SORRY!! YOU'LL HAVE TO SPEAK LOUDER!!";
				grandmaOtherResponses[1] = "CATS??! WHO'S CATS??!";
				grandmaOtherResponses[2] = "HEEEEH?? CANT HEAR YOU WITH ALL THESE DAMN FANS!!";
				grandmaOtherResponses[3] = "NO! I DON'T WANT ANY";
				grandmaOtherResponses[4] = "DANGIT, BOBBY! WE DONT SELL NATURAL GAS! WE SELL PROPANE!";
				int secondIndex = rand.nextInt(grandmaOtherResponses.length);
				System.out.println(grandmaOtherResponses[secondIndex]);
				System.out.println();
				System.out.println("Could you speak a little louder so grandma can hear you? ");
				grandmaDoesntHearYou = scanner.next();
				if (grandmaDoesntHearYou.equals("GOODBYE")) {
					System.out.println("GOODBYE, SONNY!");
					System.out.println("Your conversation with grandma has ended. ");
				}
//				else {
//					whileGrandmaDoesntHearYou();
				
					else if (grandmaDoesntHearYou.equals(grandmaDoesntHearYou.toUpperCase())) {
					grandmaHearsYou();
				}
					else if (grandmaDoesntHearYou.equalsIgnoreCase(grandmaDoesntHearYou)) {
						grandmaDoesntHearYou();
					}
				}				
			
					
				
	
				
			
		
				
			
			 		
			
		
			
	
		

	// method to call true/false on whether grandma hears you depending on what
	// input the user gives
	public void didGrandmaHearYou(String greetGrandma) {
		 if (greetGrandma.equals(greetGrandma.toUpperCase())) {
			grandmaHearsYou();
		}
			else {
				grandmaDoesntHearYou();
			}
		}
}

//public void grandmaGoodBye () {
//	System.out.println("GOODBYE, SONNY!");
//	System.out.println("Your conversation with grandma has ended. ");
//	System.exit(0);
//}	
//
//			
//public void whileGrandmaHearsYou () {
//	while (grandmaHearsYou.equals(grandmaHearsYou.toUpperCase())) 
//		grandmaHearsYou();
//}
//    	{
//    	if (grandmaHearsYou.equalsIgnoreCase(grandmaHearsYou)) {
//    		grandmaDoesntHearYou();	
//    	}
//}    	   	
//public void whileGrandmaDoesntHearYou () {
//	while (grandmaDoesntHearYou.equals(grandmaDoesntHearYou.toUpperCase())) {
//		grandmaHearsYou();
//	
//		if (grandmaDoesntHearYou.equalsIgnoreCase(grandmaDoesntHearYou)) {
//			continue;
		
			 
			 
			
		
	


//if (grandmaHearsYou.equals("GOODBYE")); {
//System.out.println("GOODBYE, SONNY!");
//System.out.println("Your conversation with grandma has ended. ");
//System.exit(0);
//}					
			
			
		
			
		 		  
	 
				 
	

	
				 
				
		
	

				
			 			
				
			 			
		
	

