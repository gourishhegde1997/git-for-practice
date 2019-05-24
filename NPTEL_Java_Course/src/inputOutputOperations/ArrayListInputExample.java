package inputOutputOperations;

import java.util.*;

public class ArrayListInputExample {

	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList <String>();
		System.out.println("Enter the input :");
		Scanner scnr = new Scanner(System.in);
		while(scnr.hasNextLine()){
			a.add(scnr.nextLine());
		}
		System.out.println("Entered arguments are :");
		for (String name:a){
			System.out.println(name);
		}
		scnr.close();
	}
}
