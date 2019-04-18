import java.util.Scanner;

public class Cube extends NormalPolygon {
  // field declarations

  public double getVolume() {
    return Math.abs(Math.pow(sideLength, 3));
  }

  public double getSurfaceArea() {
    return Math.abs(Math.pow(sideLength, 2) * 6);
  }

  /**
   * User interface for dimension finding.
   * 
   * @param scanner Scans to get user's numbers.
   */
  public static void measureCube(Scanner scanner) {
    Cube myCube = new Cube();
    boolean goodInput = false;
    while (goodInput == false) {
      try {
        System.out.println("Please enter a side length of the square below:");
        myCube.setSideLength(scanner.nextDouble());
        goodInput = true;
      } catch (Exception ex) {
        System.out.println("Invalid input. Please try again.");
        scanner.nextLine();
      }
    }
    System.out.println("\nCube Dimensions");
    System.out.println("Perimeter: " + myCube.getVolume() + " units cubed.");
    System.out.println("Diagonal Distance Across: " + myCube.getSurfaceArea() + " units squared.");
  }
}
