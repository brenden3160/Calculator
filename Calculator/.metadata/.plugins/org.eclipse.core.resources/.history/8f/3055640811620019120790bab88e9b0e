import java.util.Scanner;

public class Ellipse extends RoundShape {

	// field declarations
	private double minRadius;
	private double maxRadius;

	// Mutator methods
	public void setMinRadius(double minRadius) {
		this.minRadius = minRadius;
	}

	public void setMaxRadius(double maxRadius) {
		this.maxRadius = maxRadius;
	}

	public double getCircumference() {
		double sqrtPart = Math.sqrt((Math.pow(minRadius, 2) + Math.pow(maxRadius, 2)) / 2);
		return Math.abs((2 * Math.PI) * sqrtPart);
	}

	public double getArea() {
		return Math.abs(Math.PI * (minRadius * maxRadius));
	}
	
	public static void ellipseCalculator(Scanner scanner) {
	  
	  Ellipse myEllipse = new Ellipse(); // new instance declared
    boolean goodInput = false;
    while (goodInput == false) {
	      try {
	        System.out.println("Please enter the shortest radius of the ellipse below:");
	        myEllipse.setMinRadius(scanner.nextDouble());// scanner searches for doubles
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
	        System.out.println("Please enter the longest radius of the ellipse below:");
	        myEllipse.setMaxRadius(scanner.nextDouble());
	        goodInput2 = true;
	      }

	      catch (Exception ex) {
	        System.out.println("Invalid input. Please try again.");
	        scanner.nextLine();
	      }
	    }

	    System.out.println("Ellipse Dimensions:");
	    System.out.println("Area: " + myEllipse.getArea() + " units squared.");// receiving output
	    System.out.println("Circumference: " + myEllipse.getCircumference() + " units.");
	  }
}

