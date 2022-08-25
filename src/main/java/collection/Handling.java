package collection;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Handling {
 
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		File f2 = new File ("D:\\java software\\Java\\bank\\src\\main\\java\\collection.sample.txt");
		System.out.println("enter the data into the file");
		FileWriter fw = new FileWriter(f2);
		fw.write(data);
		System.out.println(f2.getName()+" is created successfully ");
		fw.close();
		sc.close();
		

	}

}
