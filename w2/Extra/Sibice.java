import java.util.Scanner;
import java.math.*;
public class Sibice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,w,h;
		n = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		int q = (int) Math.sqrt(Math.pow(w, 2)+Math.pow(h, 2)); //hypotenuse

		int[] z= new int[n];
		for(int i=0;i<n;i++)
		{

			z[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++)
		{

			if(z[i]<=q) System.out.println("DA");
			else System.out.println("NE");
			
		}
		
		
		sc.close();
	}

}