package ioStreamOps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileCreationDemo {
	
	private void createFile(){
		String fileName = "inputFile.txt";
		File file = new File(fileName);
		System.out.println("File name is : "+file.getName());
		System.out.println("File path is : "+file.getPath());
		System.out.println("File path is : "+file.getAbsolutePath());
		System.out.println("File length is : "+file.length());
	}
	
	private void createFile(String path) throws Exception{
		File file = new File(path);
		System.out.println("File name is : "+file.getName());
		System.out.println("File path is : "+file.getPath());
		System.out.println("File path is : "+file.getAbsolutePath());
		System.out.println("File length is : "+file.length());
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String currentLine = "";
		while((currentLine = br.readLine()) != null ){
			System.out.println(currentLine);
		}
		
		br.close();
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileCreationDemo fcd = new FileCreationDemo();
		fcd.createFile();
		System.out.println("#############################################################3");
		fcd.createFile("C:\\Users\\Gourish Hegde\\Desktop\\Notepad Log.txt");
	}

}