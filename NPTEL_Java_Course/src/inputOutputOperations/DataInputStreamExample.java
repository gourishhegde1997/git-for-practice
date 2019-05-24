package inputOutputOperations;

import java.io.DataInputStream;
import java.lang.Math;

public class DataInputStreamExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		DataInputStream input = new DataInputStream(System.in);
		System.out.println("Please enter the radius of circle :");
		String temp ="";
		try{
			temp = input.readLine();
			double r = Double.valueOf(temp);
			System.out.println("Area of circle is :"+Math.PI*r*r);
		}catch(Exception e){
			System.out.println("IOExceptio is occured");
		}
	}
}
