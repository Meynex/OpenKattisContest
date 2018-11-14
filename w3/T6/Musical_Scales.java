package T6;
import java.util.Scanner;
public class Musical_Scales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String C = "CDEFGAHC";
		String D = "DEF#GAHC#D";
				
		
		int n =sc.nextInt();
		String[] text = new String[n];
		String text2 = "";
		
		for(int i = 0; i < n; i++) {
			
			text2=text2+sc.next().toUpperCase();
		}
		
		
		
		if(text2.contains(C)) System.out.println("C Dur");
		else if(text2.contains(D)) System.out.println("D Dur");
		
		System.out.println(text2.toString());
		
		sc.close();
	}

}
