import java.util.Scanner;
public class Quick_Estimates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] erg = new int[N];
		for(int i=0;i<N;i++)
		{
			erg[i] = sc.next().length();
		}
		sc.close();
		for(int i=0;i<N;i++)
		{
			System.out.println(erg[i]);
		}
	}

}
