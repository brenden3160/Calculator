import java.util.Scanner;

public class Factor {
  private double number;

  public void setNumber(double number) {
    this.number = number;
  }

  /**
   * Checks if factorable by 2.
   * 
   * @return Returns 2 if divisible by 2.
   */
  public String getFactorTwo() {
    double remainderForTwo = number % 2;
    if (remainderForTwo == 0) {
      return "2";
    } else {
      return "";
    }
  }


  /**
   * Checks if factorable by 3.
   * 
   * @return Returns 3 if divisible by 3.
   */
  public String getFactorThree() {
    double remainderForThree = number % 3;
    if (remainderForThree == 0) {
      return "3";
    } else {
      return "";
    }
  }

  /**
   * Checks if factorable by 4.
   * 
   * @return Returns 4 if divisible by 4.
   */
  public String getFactorFour() {
    double remainderForFour = number % 4;
    if (remainderForFour == 0) {
      return "4";
    } else {
      return "";
    }
  }

  /**
   * Checks if factorable by 5.
   * 
   * @return Returns 5 if divisible by 5.
   */
  public String getFactorFive() {
    double remainderForFive = number % 5;
    if (remainderForFive == 0) {
      return "5";
    } else {
      return "";
    }
  }

  /**
   * Checks if factorable by 6.
   * 
   * @return Returns 6 if divisible by 6.
   */
  public String getFactorSix() {
    double remainderForSix = number % 6;
    if (remainderForSix == 0) {
      return "6";
    } else {
      return "";
    }
  }

  /**
   * Checks if factorable by 7.
   * 
   * @return Returns 7 if divisible by 7.
   */
  public String getFactorSeven() {
    double remainderForSeven = number % 7;
    if (remainderForSeven == 0) {
      return "7";
    } else {
      return "";
    }
  }

  /**
   * Checks if factorable by 8.
   * 
   * @return Returns 8 if divisible by 8.
   */
  public String getFactorEight() {
    double remainderForEight = number % 8;
    if (remainderForEight == 0) {
      return "8";
    } else {
      return "";
    }
  }

  /**
   * Checks if factorable by 9.
   * 
   * @return Returns 9 if divisible by 9.
   */
  public String getFactorNine() {
    double remainderForNine = number % 9;
    if (remainderForNine == 0) {
      return "9";
    } else {
      return "";
    }
  }

  /**
   * This is user prompt for finding factors.
   * 
   * @param scanner Opens scanner to take user input
   */
  public static void findFactors(Scanner scanner) {
    Factor myFactor = new Factor();
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        System.out.println("Please enter a number below:");
        myFactor.setNumber(scanner.nextDouble());
        goodInput = true;
      } catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }
    System.out.println("Factors below 10:");
    System.out.println("1 " + myFactor.getFactorTwo() + " " + myFactor.getFactorThree() + " "
        + myFactor.getFactorFour() + myFactor.getFactorFive() + " " + myFactor.getFactorSix() + " "
        + myFactor.getFactorSeven() + " " + myFactor.getFactorEight() + " "
        + myFactor.getFactorNine());
    Main.continueProgram(scanner);
  }
}
