import java.util.Scanner;
public class Quadrant_select {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x==0||y==0)
		{
			System.err.println("x or y is 0");
		}
		else
		{
			if(x>0&&y>0) System.out.print("1");
			else if(x<0&&y>0) System.out.print("2");
			else if(x<0&&y<0) System.out.print("3");
			else if(x>0&&y<0) System.out.print("4");
			else System.err.print("Error in Berechnung");
		}
		
		sc.close();

	}

}
