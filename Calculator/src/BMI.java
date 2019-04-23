import java.util.Scanner;


/**
 * This is class to calculate body mass index.
 * 
 * @author rbrathgeber1940 Brenden Rathgeber made this.
 */
public class BodyMassIndex {
  private double height;
  private double weight;

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getBodyMassIndex() {
    return Math.abs((weight * 703) / (Math.pow(height, 2)));
  }


  /**
   * This is the code for prompting user and giving back info.
   * 
   * @param scanner Scanner takes height and weight.
   */
  public static void findBodyMassIndex(Scanner scanner) {
    BodyMassIndex myBodyMassIndex = new BodyMassIndex();
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        System.out.println("Please enter your height in inches:");
        myBodyMassIndex.setHeight(scanner.nextDouble());
        goodInput = true;
      } catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }

    boolean goodInput2 = false;
    while (goodInput2 == false) {
      try {
        System.out.println("Please enter your weight in pounds");
        myBodyMassIndex.setWeight(scanner.nextDouble());
        goodInput2 = true;
      } catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }

    System.out.println("Your BMI is " + myBodyMassIndex.getBodyMassIndex());

    if (myBodyMassIndex.getBodyMassIndex() < 18.5) {
      System.out.println("According to your BMI, you are probably underweight.");
    } else if (myBodyMassIndex.getBodyMassIndex() > 18.5
        && myBodyMassIndex.getBodyMassIndex() < 24.9) {
      System.out.println("According to your BMI, you are at a normal weight.");
    } else {
      System.out.println("According to your BMI, you are most likely overweight.");
    }
    Main.continueProgram(scanner);
  }
}
