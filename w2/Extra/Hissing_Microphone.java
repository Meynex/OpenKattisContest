package Extra;
import java.util.Scanner;
public class Hissing_Microphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		
		String input = Sc.nextLine();
		if(input.contains("ss")) System.out.println("hiss");
		else System.out.println("no hiss");
		
		Sc.close();
	}

}
