package T6;
import java.util.Scanner;
public class Prime_Path {
	
	/*public static boolean isPrime(int z) {
		
		if(z%2==0||z%3==0||z%7==0) return false;
		else return true;
		
		
	}*/

	private static boolean isPrime(int z) 
	{
	        if (z == 2) 
	            return true;
	        if (z < 2 || z % 2 == 0) 
	            return false;
	        for (int i = 3; i * i <= z; i += 2)
	            if (z % i == 0) 
	                return false;
	        return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z=sc.nextInt();
		int[] n = new int[z];
		int[] m = new int[z];
		int[] count= new int[z];
		
		for(int i=0;i<z;i++) {
			n[i]=sc.nextInt();
			m[i]=sc.nextInt();
			count[i]=0;
		}
		
		for(int i=0;i<z;i++) {
			for(int a=n[i];a<m[i];a++) 
			{
				if(isPrime(a)) count[i]++;
			}
		}
		
		for(int i=0;i<z;i++) {
		
				//System.out.println("Primesline "+ i +": "+count[i]);
				
				System.out.println(count[i]);
			
		}
		
		sc.close();
		
		
	}

}
