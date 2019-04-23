import java.util.Scanner;

public class BMI {
  private double height;
  private double weight;

  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getBmi() {
    return Math.abs((weight * 703) / (Math.pow(height, 2)));
  }

  public static void findBmi(Scanner scanner) {
    BMI myBMI = new BMI();
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        System.out.println("Please enter your height in inches:");
        myBMI.setHeight(scanner.nextDouble());
        goodInput = true;
      }

      catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }

    boolean goodInput2 = false;
    while (goodInput2 == false) {
      try {
        System.out.println("Please enter your weight in pounds (yes ladies, you too...)");
        myBMI.setWeight(scanner.nextDouble());
        goodInput2 = true;
      }

      catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }

    System.out.println("Your BMI is " + myBMI.getBmi());

    if (myBMI.getBmi() < 18.5) {
      System.out.println("According to your BMI, you are probably underweight.");
    } else if (myBMI.getBmi() > 18.5 && myBMI.getBmi() < 24.9) {
      System.out.println("According to your BMI, you are at a normal weight.");
    } else {
      System.out.println("According to your BMI, you are most likely overweight.");
    }
    Main.continueProgram(scanner);
  }
}
