import java.util.InputMismatchException;
// import allows me to use more functions from libraries that I am including
import java.util.Scanner;

// Brenden Rathgeber
// Integration Project Calculator
 /**
   * Java main class leads to welcome menu and switch.
   * 
   * @param args This is for the scanner.
   */
public class Main {
  // Class = code
  public static void main(String[] args) { // this is a header. public is an access modifier.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello! I calculate commonly used formulas for you. Press "
		       + "enter to get started.");
    scanner.nextLine();
    boolean continueProgram = true;
    while (continueProgram == true) {
      System.out.println("\nPlease enter the number coresponding to the field "
			 + "that you want to use:");
	     /*
   * This is the main and switch statement that takes you to different functions
   * 
   * @param args Switch is first thing by main.
   */
switch (choice) {
			System.out.println((int) 2.0 / 2 + ": Circle");
			System.out.println("2: Ellipse");
			System.out.println("3: Sphere");
			System.out.println("4: Square");
			System.out.println("5: Cube");
			System.out.println("6: Your Body Mass Index (BMI)");
			System.out.println("7: Amortization Amount on a Bond");
			System.out.println("8: Factors List");
			System.out.println("9: Find your street name");
			System.out.println("10: Creator Credits");
			System.out.println("11: Terminate Program");
			int choice = 0;
			boolean runInput = true;
			while (runInput == true) {
				try {
					choice = scanner.nextInt();
					break;
				} catch (InputMismatchException ex) {
					System.out.println("Invalid input. Please try one of the menu options. ");
					scanner.nextLine();
				}
			}

 
      switch (choice) {

        case 1:
          Circle.measureCircle(scanner);
          break;

        case 2:
          Ellipse.ellipseCalculator(scanner);
          break;

        case 3:
          Sphere.measureSphere(scanner);
          break;

        case 4:
          Square.measureSquare(scanner);
          break;

        case 5:
          Cube.measureCube(scanner);
          break;

        case 6:
          BodyMassIndex.findBodyMassIndex(scanner);
          break;

        case 7:
          LoanAmortization.findLoanAmortization(scanner);
          break;
	case 8:
				Factor.findFactors(scanner);
				break;
				
			case 9:
				NameFinder.GiveNames(scanner);
				break;
			case 10:
				System.out.println("Made by Brenden Rathgeber in COP 2006 in 2019.");
				break;

			case 11:
				System.out.println("Are you sure you would like to terminate program? (Y/N)");
				boolean goodInput = false;
				while (goodInput == false) {
					String terminateInput = scanner.nextLine();
					try {
						if (terminateInput.equalsIgnoreCase("N")) {
							goodInput = true;
						} else if (terminateInput.equalsIgnoreCase("Y")) {
							System.exit(0);
						}
					} catch (Exception e) {
						System.out.println("Invalid input.");
						scanner.nextLine();
					}


	public static void continueProgram(Scanner scanner) {
		System.out.println("Are you sure you would like to continue program? (Y/N)");
		boolean goodInput = false;
		while (goodInput == false) {
			String terminateInput = scanner.nextLine();
			try {
				if (terminateInput.equalsIgnoreCase("Y")) {
					goodInput = true;
				} else if (terminateInput.equalsIgnoreCase("N")) {
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Invalid input.");
				scanner.nextLine();
			}	
	}
          }
          break;

        default:
          System.out.println("Invalid Input. Please try again.\n");

      }
    }
  }


// comments are in the read me!!!
