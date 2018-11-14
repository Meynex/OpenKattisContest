package T4;
import java.util.Scanner;
public class Nasty_Hacks {
	public static void main(String[] args) {
	
		Scanner Sc = new Scanner(System.in);
		
		int n = Sc.nextInt();
		int[] r = new int[n];
		int[] e = new int[n];
		int[] c = new int[n];
		for(int i=0;i<n;i++)
		{
			r[i]= Sc.nextInt(); //expected revenue not advertised
			e[i] = Sc.nextInt(); // expected revenue advertised
			c[i] = Sc.nextInt(); // cost of advertise
			
		}
		for(int i=0;i<n;i++)
		{
			if((e[i]-r[i]-c[i])>0) System.out.println("advertise");
			else if((e[i]-r[i]-c[i])==0) System.out.println("does not matter");
			else System.out.println("do not advertise");;
		}
		Sc.close();
	}
}
