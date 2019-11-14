package ioStreamOps;

import java.io.DataInputStream;
import java.io.IOException;

public class InputStreamDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		Float principalAmount = new Float(0);
		Float rateOfInterest = new Float(0);
		int numberOfYears = 0;
		String tempLine = "";
		
		DataInputStream datain = new DataInputStream(System.in);
		System.out.println("Enter the principal amount : ");
		System.out.flush();
		tempLine = datain.readLine();
		principalAmount = Float.valueOf(tempLine);
		
		System.out.println("Enter the rate of interest : ");
		System.out.flush();
		tempLine = datain.readLine();
		rateOfInterest = Float.valueOf(tempLine);
		
		System.out.println("Enter the number of years : ");
		System.out.flush();
		tempLine = datain.readLine();
		numberOfYears = Integer.valueOf(tempLine);
		
		datain.close();
		
		System.out.println("Principal amount is : "+principalAmount);
		System.out.println("Rate of interest is : "+rateOfInterest);
		System.out.println("Number of years is : "+numberOfYears);
		
		System.out.println("Simple interest is :"+((principalAmount*numberOfYears*rateOfInterest)/100));
		
	}

}
