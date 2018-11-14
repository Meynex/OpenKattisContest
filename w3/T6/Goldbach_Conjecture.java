package T6;
import java.util.Scanner;
public class Goldbach_Conjecture {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		fakultaet fak = new fakultaet();
		
		
		//int l =sc.nextInt();
		//int[] z = new int[l];
		
		long inp = sc.nextLong();
		System.out.println(fak.FakCount(inp));
		fak.FakOut(inp);
		Prime p = new Prime();
		p.PrimeOut();
		/*
		for(int i = 0;i<l;i++) {
			z[i]= sc.nextInt();
		}
		*/
		
	}

}
