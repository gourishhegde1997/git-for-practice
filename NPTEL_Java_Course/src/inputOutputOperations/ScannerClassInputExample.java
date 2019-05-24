package inputOutputOperations;

import java.util.*;

public class ScannerClassInputExample {

	public static void main(String[] args) {
		System.out.println("Please enter the radius of circle : ");
		Scanner scnr = new Scanner(System.in);
		double x = scnr.nextDouble();
		System.out.println("Area of the circle is :");
		double area = Math.PI*x*x;
		System.out.println(area);
		scnr.close();
	}

}
