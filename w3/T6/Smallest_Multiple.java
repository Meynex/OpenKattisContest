package T6;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Smallest_Multiple {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[1000];
		
		String[] Text = sc.next().split(" ");
		
		
		
		for(int i=0;!(Text[i+1].isEmpty());i++)
		{
			input =Text[i].chars().toArray();
			
		}
		
			System.out.println(input.toString());
		
		
		
		
		
		
		sc.close();
	}

}
