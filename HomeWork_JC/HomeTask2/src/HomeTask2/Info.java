package HomeTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Info {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.println("What is your name?");
	    String name = br.readLine();
	    
		System.out.println("How old are you?");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Where are you live, (name)?");
		String adress = br.readLine();
		
		System.out.println("Hello, " + name + "! You are " + age + " years old. You live in " + adress + ".");
	}

}
