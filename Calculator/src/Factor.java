import java.util.Scanner;

public class Factor {
  private double number;

  public void setNumber(double number) {
    this.number = number;
  }



  public String getFactorTwo() {
    double remainderForTwo = number % 2;
    if (remainderForTwo == 0) {
      return "2";
    } else {
      return "";
    }
  }

  public String getFactorThree() {
    double remainderForThree = number % 3;
    if (remainderForThree == 0) {
      return "3";
    } else {
      return "";
    }
  }

  public String getFactorFour() {
    double remainderForFour = number % 4;
    if (remainderForFour == 0) {
      return "4";
    } else {
      return "";
    }
  }

  public String getFactorFive() {
    double remainderForFive = number % 5;
    if (remainderForFive == 0) {
      return "5";
    } else {
      return "";
    }
  }

  public String getFactorSix() {
    double remainderForSix = number % 6;
    if (remainderForSix == 0) {
      return "6";
    } else {
      return "";
    }
  }

  public String getFactorSeven() {
    double remainderForSeven = number % 7;
    if (remainderForSeven == 0) {
      return "7";
    } else {
      return "";
    }
  }

  public String getFactorEight() {
    double remainderForEight = number % 8;
    if (remainderForEight == 0) {
      return "8";
    } else {
      return "";
    }
  }

  public String getFactorNine() {
    double remainderForNine = number % 9;
    if (remainderForNine == 0) {
      return "9";
    } else {
      return "";
    }
  }


  public static void findFactors(Scanner scanner) {
    Factor myFactor = new Factor();
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        System.out.println("Please enter a number below:");
        myFactor.setNumber(scanner.nextDouble());
        goodInput = true;
      }

      catch (Exception ex) {
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
