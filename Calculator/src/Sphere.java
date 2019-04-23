import java.util.Scanner;

public class Sphere extends RoundShape {
  // field declarations

  public double getVolume() {
    return Math.abs(Math.PI * Math.pow(radius, 3) * (4 / 3));
  }

  public double getSurfaceArea() {
    return Math.abs(Math.PI * Math.pow(radius, 2) * 4);

  }

  public static void measureSphere(Scanner scanner) {
    Sphere mySphere = new Sphere();
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        System.out.println("Please enter the radius of the sphere below:");
        mySphere.setRadius(scanner.nextDouble());
        goodInput = true;
      }

      catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }
    System.out.println("\nSphere Dimensions:");
    System.out.println("Volume: " + mySphere.getVolume() + " units cubed.");
    System.out.println("Surface Area: " + mySphere.getSurfaceArea() + " units squared.");
    Main.continueProgram(scanner);
  }
}
