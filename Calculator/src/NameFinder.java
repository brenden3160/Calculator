import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class NameFinder {
	private String Name;

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getName() {

		return getName();
	}

	public static void GiveNames(Scanner scanner) {
		NameFinder Name = new NameFinder();

		System.out.println("Press any key for your new street name.");
		scanner.nextLine();
		scanner.nextLine();

		Random randomNum = new Random();

		String[] FirstName = new String[5];
		FirstName[0] = "Lil ";
		FirstName[1] = "Big ";
		FirstName[2] = "Yung ";
		FirstName[3] = "Ol'";
		FirstName[4] = "Rich homie";

		String[] LastName = new String[6];
		LastName[0] = "Weezy";
		LastName[1] = "G";
		LastName[2] = "Shoota";
		LastName[3] = "Terrance";
		LastName[4] = "Killa";
		LastName[5] = "Biscuit";
		

		System.out.println(FirstName[randomNum.nextInt(5)] + LastName[randomNum.nextInt(6)]);

Main.continueProgram(scanner);
}
}
