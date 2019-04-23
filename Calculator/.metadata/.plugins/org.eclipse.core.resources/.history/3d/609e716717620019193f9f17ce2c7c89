import java.util.Scanner;

public class LoanAmortization {
  private double carryValue;
  private double interestRate;
  private double monthlyPayment;

  public void setCarryValue(double carryValue) {
    this.carryValue = carryValue;
  }

  public void setMonthlyPayment(double monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public void setInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }

  public double getInterestForMonth() {
    double paidInInterest = carryValue * ((interestRate / 100) / 12);
    double remainingCarry = carryValue - paidInInterest;
    return carryValue - remainingCarry;
  }

  public double getPaidOffInPeriod() {
    double paidInInterest = carryValue * ((interestRate / 100) / 12);
    return carryValue - (monthlyPayment - paidInInterest);

  }

  public double getNewCarry() {
    double paidInInterest = carryValue * ((interestRate / 100) / 12);
    return carryValue - paidInInterest;
  }

  public static void findLoanAmortization(Scanner scanner) {
    LoanAmortization myLoanAmortization = new LoanAmortization();
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        System.out.println("Please enter the the amount owed.");
        myLoanAmortization.setCarryValue(scanner.nextDouble());
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
        System.out.println("Please enter your monthly payment.");
        myLoanAmortization.setMonthlyPayment(scanner.nextDouble());
        goodInput2 = true;
      }

      catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }
    boolean goodInput3 = false;
    while (goodInput3 == false) {
      try {
        System.out.println("Please enter the annual interest rate.");
        myLoanAmortization.setInterestRate(scanner.nextDouble());
        goodInput3 = true;
      }

      catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }

    System.out.println("For this period, $" + myLoanAmortization.getInterestForMonth()
        + " was used to pay off the loan.");
    System.out.println("For this period, $" + myLoanAmortization.getPaidOffInPeriod()
        + " was used to pay off the payment.");
    System.out.println("You still owe $" + myLoanAmortization.getNewCarry() + ".");

  }
}
