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

    System.out.println("Press enter for your new street name.");
    scanner.nextLine();
    scanner.nextLine();

    Random randomNum = new Random();

    String[] FirstName = new String[16];
    FirstName[0] = "Lil ";
    FirstName[1] = "Big ";
    FirstName[2] = "Yung ";
    FirstName[3] = "Ol'";
    FirstName[4] = "Cold ";
    FirstName[5] = "Hawt ";
    FirstName[6] = "Red ";
    FirstName[7] = "Bloody ";
    FirstName[8] = "Ugly ";
    FirstName[9] = "Blue ";
    FirstName[10] = "Two ";
    FirstName[11] = "Crazy ";
    FirstName[12] = "Mad ";
    FirstName[13] = "MC ";
    FirstName[14] = "Real ";
    FirstName[14] = "Cash ";
    FirstName[15] = "Gucci ";
    
    String[] LastName = new String[] {"Stonr", "G", "Shoota", "Shredda", "Killa", "Baby", "Face",
        "Snow", "Lion", "Champ", "Thug", "Money", "Smoke", "Murrda", "Thug", "Gucci"};
    
   

    System.out.println(FirstName[randomNum.nextInt(16)] + LastName[randomNum.nextInt(16)]);

    Main.continueProgram(scanner);
  }}
