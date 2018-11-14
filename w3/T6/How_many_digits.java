package T6;
import java.util.Scanner;
public class How_many_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		 int n = sc.nextInt();
		
		if(n<2) System.out.println("1");
		else System.out.println((int)Math.ceil(Math.log10(2*Math.PI*n)/2+n*(Math.log10(n/Math.E)))); // Ceil = runden auf höcherezahl
		sc.close();
		
	}
}
