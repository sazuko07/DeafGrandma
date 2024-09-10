
public class Grandma {

	// method for when grandma hears you, gives 1 of 5 random responses
	public void grandmaHearsYou() {
		{
			java.util.Random rand = new java.util.Random();
			String grandmaResponses[] = new String[5];
			grandmaResponses[0] = "HEY THERE, SONNY!";
			grandmaResponses[1] = "WHAT'RE YOU LOOKIN' AT??";
			grandmaResponses[2] = "IT'S BEEN AGES! WHERE'VE YOU BEEN??";
			grandmaResponses[3] = "FELLOW?? THERE'S NO FELLOW HERE, NOT SINCE GRANPA DIED ";
			grandmaResponses[4] = "COME ON IN, SWEETIE! WE HAVE COOKIES!";
			int index = rand.nextInt(grandmaResponses.length);
			System.out.println(grandmaResponses[index]);
		}
	}

	// method for when grandma DOESNT hear you, gives 1 of 5 random responses
	public void grandmaDoesntHearYou () {
		
			java.util.Random rand = new java.util.Random();
			String grandmaOtherResponses[] = new String[5];
				grandmaOtherResponses[0] = "WHAT?! SORRY!! YOU'LL HAVE TO SPEAK LOUDER!!";
				grandmaOtherResponses[1] = "CATS??! WHO'S CATS??!";
				grandmaOtherResponses[2] = "HEEEEH?? CANT HEAR YOU WITH ALL THESE DAMN FANS!!";
				grandmaOtherResponses[3] = "NO! I DON'T WANT ANY";
				grandmaOtherResponses[4] = "DANGIT, BOBBY! WE DONT SELL NATURAL GAS! WE SELL PROPANE!";
				int secondIndex = rand.nextInt(grandmaOtherResponses.length);
				System.out.println(grandmaOtherResponses[secondIndex]);
		}

	// method to call true/false on whether grandma hears you depending on what
	// input the user gives
	public void didGrandmaHearYou(String greetGrandma) {
			if (greetGrandma.equals(greetGrandma.toUpperCase()))
					grandmaHearsYou();
			if (!greetGrandma.equals(greetGrandma.toUpperCase()))			
					grandmaDoesntHearYou();	
		}
}