package date;

import java.util.Scanner;

public class ScannerLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line;
		Scanner in = new Scanner(System.in);
		System.out.print("Type something: ");
		line = in.nextLine();
		System.out.println("You said: " + line);
		System.out.print("Type something else: ");
		line = in.nextLine();
		System.out.println("You also said: " + line);
	}

}
